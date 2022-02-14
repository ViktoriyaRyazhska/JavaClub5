package GreenCity.peges;

import GreenCity.PopUpMenu.guest.MainManuPopUp;
import GreenCity.PopUpMenu.guest.SingInPopUp;
import GreenCity.PopUpMenu.guest.SingUpPopUp;
import GreenCity.PopUpMenu.guest.UBSCourierPopUp;
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
        @FindBy(className="header_lang-switcher-wrp")
        private WebElement languageButton;
        // @FindBy(id="copyright-label")
        // private WebElement copyright;


        private SingUpPopUp singUpPopUp;
        private SingInPopUp singInPopUp;
        private MainManuPopUp mainManuPopUp;
        private UBSCourierPopUp ubcCourierPopUp;
        private int Window_Heigth_toClick_Footer=480;


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
                ubcCourierPopUp = new UBSCourierPopUp(driver);
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


        public void clickLanguageButton1() {
                getLanguageButton().click();
        }


        //Copyright
        // public WebElement getCopyright() {
        //         return copyright;
        // }

        // public String getCopyrightText() {
        //        return getCopyright().getText();
        //}


        // public void clickCopyright() {
        //         getCopyright().click();
        // }

        //

        //MySpase


        // ManuPopUp
        public MainManuPopUp getMainManuPopUp() {
                return mainManuPopUp;
        }
        public UBSCourierPopUp getUBSCourierPopUp(){return ubcCourierPopUp;}


        //Functional
//
        public void clicklanguageButton2(Languages languages) {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
                clickLanguageButton1();
                // WebElement lang_dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='add-shadow header_lang-switcher-wrp header_navigation-menu-right-list']/li/span")));
                List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='add-shadow header_lang-switcher-wrp header_navigation-menu-right-list']/li/."));

                for (WebElement ele : allOptions) {
                        String lang_name = ele.getText();
                        System.out.println(lang_name);
                        System.out.println(languages);
                        if (ele.getText().equals(languages.toString())) {
                                ele.click();
                                break;
                        }
                        else {
                                System.out.println("Do not work");
                        }
                }
        }

        //  protected void scrollDown(){
        //         JavascriptExecutor js = (JavascriptExecutor) driver;
        //         js.executeScript("arguments[0].scrollIntoView(true);", getCopyright());
        // }


        //Business logic

        public HomePage navigateMenuHome() {
                getMainManuPopUp().clickHomePage();
                return new HomePage(driver);
        }

        public EcoNewsPage navigateMenuEcoNews() {
                getMainManuPopUp().clickMenuEcoNewsPage();
                return new EcoNewsPage(driver);
        }

        public TipsTricksPage navigateMenuTipsTricks() {
                getMainManuPopUp().clickMenuTipsTricksPage();
                return new TipsTricksPage(driver);
        }
        public EventsPage navigateMenuEvents() {
                getMainManuPopUp().clickMenuEventsPage();
                return new EventsPage(driver);
        }

        public PlacesPage navigateMenuPlaces() {
                getMainManuPopUp().clickMenuPlacesPage();
                return new PlacesPage(driver);
        }

        public AboutUsPage navigateMenuAboutUs() {
                getMainManuPopUp().clickMenuAboutUsPage();
                return new AboutUsPage(driver);
        }

        public MySpacePage navigateMenuMySpace() {
                getMainManuPopUp().clickMenuMySpacePage();
                return new MySpacePage(driver);
        }


        public UBSCourierPage navigateMenuUBSCourier() {
                getMainManuPopUp().clickMenuUBSCourierPage();
                if(driver.manage().window().getSize().height> Window_Heigth_toClick_Footer){
                        getUBSCourierPopUp().clickGreenCityPage();}
                return new UBSCourierPage(driver);
        }
}
