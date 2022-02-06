package GreenCity.peges;

import GreenCity.PopUpMenu.guest.MainManuPopUp;
import GreenCity.PopUpMenu.guest.SingInPopUp;
import GreenCity.PopUpMenu.guest.SingUpPopUp;
import GreenCity.data.Languages;
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

        @FindBy(css=".header_sign-up-btn")
        private WebElement singUpLink;
        @FindBy(className="cdk-overlay-container")
        private WebElement singInLink;
        @FindBy(css="li > span")
        private WebElement languageSwitcher;

        private SingUpPopUp singUpPopUp;
        private SingInPopUp singInPopUp;
        private MainManuPopUp mainManuPopUp;


        public TopPage(WebDriver driver) {
                this.driver = driver;
                //This initElements method will create all WebElements
                PageFactory.initElements(driver, this);
                initialElements();
        }

        private void initialElements() {
                mainManuPopUp = new MainManuPopUp(driver);
        }

        //Object
        //Atomic logic
        //singUpLink
        public WebElement getSingUpLink() {
                return singUpLink;
        }

        public String getSingUpLinkText() {
                return getSingUpLink().getText();
        }

        public void clickSingUpLink() {
                getSingUpLink().click();
        }

        //singInLink

        public WebElement getSingInLink() {
                return singInLink;
        }

        public String getSingInLinkText() {
                return getSingInLink().getText();
        }

        public void clickSingInLink() {
                getSingInLink().click();
        }

        //languageSwitcher

        public WebElement getLanguageSwitcher() {
                return languageSwitcher;
        }

        /*  public WebElement getLanguageSwitcherWebelement() {
              return getLanguageSwitcher().get();
        }

        public String getLanguageSwitcherText() {
                return getLanguageSwitcher().getFirstSelectedOption().getText();
        }

        protected void setLanguageSwitcher(String text) {
                getLanguageSwitcher().selectByVisibleText(String.valueOf(text));
        }
          protected void SelectLanguageSwitcher() {
        boolean staus = driver.findElement(By.cssSelector("li > span").isSelected();
        }

         */


        protected void clickLanguageSwitcher() {
                getLanguageSwitcher().click();
        }

        // mainManuPopUp
        public MainManuPopUp getMainManuPopUp() {
                return mainManuPopUp;
        }

        //Functional
        protected void chooseLanguage(Languages languages) {
                clickLanguageSwitcher();
                driver.findElement(By.cssSelector("li:nth-child." + languages)).click();;
        }

        //Business logic
        public HomePage gotoHomePage() {
                getMainManuPopUp().clickHomePage();
                return new HomePage(driver);
        }

        public EcoNewsPage gotoEcoNewsPage() {
                getMainManuPopUp().clickMenuEcoNews();
                return new EcoNewsPage(driver);
        }
}
