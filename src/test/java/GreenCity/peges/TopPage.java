package GreenCity.peges;

import GreenCity.PopUpMenu.guest.MainManuPopUp;
import GreenCity.PopUpMenu.guest.SingInPopUp;
import GreenCity.PopUpMenu.guest.SingUpPopUp;
import GreenCity.data.Languages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;

public abstract class TopPage {

        protected WebDriver driver;

        @FindBy(css=".header_sign-up-btn")
        private WebElement singUpLink;
        @FindBy(className="cdk-overlay-container")
        private WebElement singInLink;
        @FindBy(css="li > span")
        private WebElement languageButton;
        private List<WebElement> languageSwitcher;

        private SingUpPopUp singUpPopUp;
        private SingInPopUp singInPopUp;
        private MainManuPopUp mainManuPopUp;


        public TopPage(WebDriver driver) {
                this.driver = driver;
                //This initElements method will create all WebElements
                PageFactory.initElements(driver, this);
                CloseAlertIsPresent();
                initialElements();
        }


        private void CloseAlertIsPresent(){
                FluentWait fluentWait = new FluentWait(driver);
                //Specify the timout of the wait
                fluentWait.withTimeout(Duration.ofSeconds(1));
                //Sepcify polling time
                fluentWait.pollingEvery(Duration.ofSeconds(1));
                //Specify what exceptions to ignore
                fluentWait.ignoring(NoSuchElementException.class);
                //TimeoutException
                fluentWait.ignoring(TimeoutException.class);
                 //This is how we specify the condition to wait on.
                 //This is what we will explore more in this chapter
                  Alert alert =null;
                   try {
                       alert = (Alert) fluentWait.until(ExpectedConditions.alertIsPresent());
               }catch (TimeoutException e){

                   }
                if(alert!=null) {
                   alert.accept();
                      // driver.switchTo().alert().accept();
                }
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

        //languageButton
        public WebElement getLanguageButton() {
                return  languageButton;
        }

        public String getLanguageButtonText() {
                return getLanguageButton().getText();
        }


        public void clickLanguageButton(Languages languages) {
                getLanguageButton().click();
        }

        //languageSwitcher

        public List<WebElement> getLanguageSwitcher() {
                return  languageSwitcher;
        }


        // mainManuPopUp
        public MainManuPopUp getMainManuPopUp() {
                return mainManuPopUp;
        }

        //Functional
        /*
        public String clickLanguageSwitcher(Languages languages) {
                clickLanguageButton();
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

                WebElement lang_dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.li:nth-child > span")));
                Select lang_dd = new Select(lang_dropdown);
                List <WebElement> lang_lists = lang_dd.getOptions();
                int total_lang= lang_lists.size();
                System.out.println("Total language count is"+ total_lang);

                for(WebElement ele:lang_lists) {
                        String lang_name = ele.getText();
                        System.out.println(lang_name);
                        if (ele.getText().equals(languageSwitcher)){
                               ele.click();
                        }
                        куег
                }



                // List<WebElement> allOptions = driver.findElements(By.cssSelector("a.li:nth-child > span"));

              //  java.util.Iterator<WebElement> i = allOptions.iterator();
              //  while(i.hasNext()) {
              //         WebElement ele = i.next();
               //         if (ele.getText().equals(languageSwitcher)){
              //                  ele.click();
              //          }
               // }
                return languages.toString();
        }

         */

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
