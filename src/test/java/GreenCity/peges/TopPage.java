package GreenCity.peges;

import GreenCity.PopUpMenu.guest.*;
import GreenCity.data.Languages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        private Footer footer;
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
                footer=new Footer(driver);
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

        //mainMenuDropdown
        public MainManuPopUp getMainMenuDropdown(){
                return mainManuPopUp;
        }
        //footer
        public Footer getFooter(){
                return footer;
        }

        //SingInDropdoun
        protected SingInPopUp SingInDropdoun (){
                System.out.println("closeSingInDropdoun-1");
                return new SingInPopUp(driver);}

        //Business logic

        public HomePage navigateMenuHome() {
                getMainManuPopUp().clickHomePage();
                return new HomePage(driver);
        }
        public HomePage navigateMenuHomeFooter() throws InterruptedException {
                System.out.println("gotoMenuHomeFooter()");
                getFooter().clickFooterHomePage();
                return new HomePage(driver);
        }

        public EcoNewsPage navigateMenuEcoNews() {
                getMainManuPopUp().clickMenuEcoNewsPage();
                return new EcoNewsPage(driver);
        }
        public EcoNewsPage navigateMenuEcoNewsFooter() throws InterruptedException {
                System.out.println("navigateMenuEcoNewsFooter()");
                getFooter().clickFooterEcoNewsPage();
                System.out.println("footer.clickFooterEcoNewsPage();");
                return new EcoNewsPage(driver);}


        public TipsTricksPage navigateMenuTipsTricks() {
                getMainManuPopUp().clickMenuTipsTricksPage();
                return new TipsTricksPage(driver);
        }
        public TipsTricksPage navigateMenuTripandTricksFooter() throws InterruptedException {
                System.out.println("navigateMenuTripandTricksFooter()");
                // getFooter().scrollDown();
                System.out.println("footer.scrollDown();");
                getFooter().clickFooterTipsTricksPage();
                System.out.println(" footer.clickFooterTipsTricksPage()");
                return new TipsTricksPage(driver);
        }
        public EventsPage navigateMenuEvents() {
                getMainManuPopUp().clickMenuEventsPage();
                return new EventsPage(driver);
        }
        public EventsPage navigateMenuEventsFooter() throws InterruptedException {
                System.out.println("navigateMenuTripandTricksFooter");
                // getFooter().scrollDown();
                // System.out.println("footer.scrollDown();");
                getFooter().clickFooterEventsPage();
                System.out.println(" footer.clickFooterTipsTricksPage()");
                return new EventsPage(driver);
        }

        public PlacesPage navigateMenuPlaces() {
                getMainManuPopUp().clickMenuPlacesPage();
                if(SingInDropdoun ().isDisplayedcloseWindow()){
                        SingInDropdoun().clickcloseWindow();
                        return new PlacesPage(driver);
                }
                return new PlacesPage(driver);
        }
        public PlacesPage navigateMenuPlacesFooter() throws InterruptedException {
                System.out.println("gotoPlacesPageFooter");
                getFooter().clickFooterPlacesPage();
                if(SingInDropdoun ().isDisplayedcloseWindow()){
                        SingInDropdoun().clickcloseWindow();
                        return new PlacesPage(driver);
                }
                return new PlacesPage(driver);
        }

        public AboutUsPage navigateMenuAboutUs() {
                getMainManuPopUp().clickMenuAboutUsPage();
//                if(SingInDropdoun ().isDisplayedcloseWindow()){
//                        SingInDropdoun().clickcloseWindow();
//                        return new AboutUsPage(driver);
//                }
                return new AboutUsPage(driver);
        }
        public AboutUsPage navigateMenuAboutUsFooter() throws InterruptedException {
                System.out.println("gotoAboutusPagefooter()");
                getFooter().clickFooterAboutUsPage();
//                if(SingInDropdoun ().isDisplayedcloseWindow()){
//                        SingInDropdoun().clickcloseWindow();
//                        return new AboutUsPage(driver);
//                }
                return new AboutUsPage(driver);
        }

        public MySpacePage navigateMenuMySpace() {
                getMainManuPopUp().clickMenuMySpacePage();
                if(SingInDropdoun ().isDisplayedcloseWindow()){
                        SingInDropdoun().clickcloseWindow();
                        return new MySpacePage(driver);
                }
                return new MySpacePage(driver);
        }


//        public UBSCourierPage navigateMenuUBSCourier() {
//                getMainManuPopUp().clickMenuUBSCourierPage();
//                if(driver.manage().window().getSize().height> Window_Heigth_toClick_Footer){
//                        getUBSCourierPopUp().clickGreenCityPage();}
//                return new UBSCourierPage(driver);
//        }
public UBSCourierPage navigateMenuUBSCourier(){
        System.out.println("gotoUbsCourierPage()");
        getMainManuPopUp().clickMenuUBSCourierPage();;
        return new UBSCourierPage(driver);
}
        public SingInPopUp navigateSingInDropdown() throws InterruptedException {
                System.out.println("navigateSingInDropdown()");
                getMainMenuDropdown().clickSingInDropdown();
                System.out.println(".clickSingInDropdown()");
                if(SingInDropdoun ().isDisplayedcloseWindow()){
                        SingInDropdoun().clickcloseWindow();
                        return new SingInPopUp(driver);
                }
                return new SingInPopUp(driver);
        }
        public MyhabitsPage navigateMyhabitsPageFooter() throws InterruptedException {
                System.out.println("navigateMyhabitsPageFooter()");
                getFooter().clickFooterMyHabitsPage();
                System.out.println(".clickFooterMyHabitsPage()");
                if(SingInDropdoun ().isDisplayedcloseWindow()){
                        SingInDropdoun().clickcloseWindow();
                        return new MyhabitsPage(driver);
                }
                return new MyhabitsPage(driver);
        }

}
