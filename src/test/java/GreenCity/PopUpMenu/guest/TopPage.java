package GreenCity.PopUpMenu.guest;

import GreenCity.peges.EcoNewsPage;
import GreenCity.peges.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public abstract class TopPage {

        protected WebDriver driver;

        //@FindBy(css=".header_sign-up-btn")
        private WebElement singUpLink;
        // @FindBy(className="cdk-overlay-container")
        private WebElement singInLink;
        // @FindBy(id="language-switcher")
        private Select languageSwitcher;

        private SingUpPopUp singUpPopUp;
        private SingInPopUp singInPopUp;
        private MainManuPopUp mainManuPopUp;
        private HomePage homePage;

        public TopPage(WebDriver driver){
                this.driver = driver;
                //This initElements method will create all WebElements
                initElements();
        }

        private void initElements() {
                singUpLink= driver.findElement(By.cssSelector(".header_sign-up-btn"));
                singInLink = driver.findElement(By.className("cdk-overlay-container"));
                languageSwitcher = new Select(driver.findElement(By.id("language-switcher")));
                mainManuPopUp = new MainManuPopUp(driver);
        }

        //Object
        //Atomic logic
        //singUpLink
        public WebElement getSingUpLink(){
                return (WebElement) singUpLink;
        }

        public String getSingUpLinkText(){
                return getSingUpLink().getText();
        }

        public void clickSingUpLink(){
                getSingUpLink().click();
        }

        //singInLink

        public WebElement getSingInLink(){
                return (WebElement) singInLink;
        }

        public String getSingInLinkText(){
                return getSingInLink().getText();
        }

        public void clickSingInLink(){
                getSingInLink().click();
        }

        //languageSwitcher

        public Select getLanguageSwitcher(){
                return languageSwitcher;
        }

        public WebElement getLanguageSwitcherWebelement(){
                return getLanguageSwitcher().getWrappedElement();
        }

        public String getLanguageSwitcherText(){
                return getLanguageSwitcher().getFirstSelectedOption().getText();
        }

        public void setLanguageSwitcher(Select text){
                getLanguageSwitcher().selectByVisibleText(String.valueOf(text));
        }

        public void clickLanguageSwitcher(){
                getLanguageSwitcherWebelement().click();
        }

        // mainManuPopUp
        public MainManuPopUp getMainManuPopUp(){
                return mainManuPopUp;
        }

        //Functional

        //Business logic
        public HomePage gotoHomePage(){
                getMainManuPopUp().clickHomePage();
                return new HomePage(driver);
        }

        public EcoNewsPage gotoEcoNewsPage(){
                getMainManuPopUp().clickMenuEcoNews();
                return new EcoNewsPage(driver);
        }
}
