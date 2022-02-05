package GreenCity.PopUpMenu.guest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public abstract class TopPage {

        protected WebDriver driver;

        @FindBy(css=".header_sign-up-btn")
        private WebDriver singUpLink;
        @FindBy(className="cdk-overlay-container")
        private WebDriver singInLink;
        @FindBy(id="language-switcher")
        private Select languageSwitcher;

        private SingUpPopUp singUpPopUp;
        private SingInPopUp singInPopUp;
        private MainManuPopUp mainManuPopUp;

        public TopPage(WebDriver driver){
                this.driver = driver;
                //This initElements method will create all WebElements
                PageFactory.initElements(driver, this);
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

        //Functional

       //Business logic

}
