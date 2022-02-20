package GreenCity.peges;

import GreenCity.Components.TopGuestComponent;
import GreenCity.PopUpMenu.guest.*;
import GreenCity.data.Languages;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

/**
 * Base abstract class TopPage of Header and Footer
 */

public abstract class TopPage {


        protected WebDriver driver;

        @FindBy(className="header_lang-switcher-wrp")
        private WebElement languageButton;
        // @FindBy(id="copyright-label")
        // private WebElement copyright;


        private TopGuestComponent topGuestComponent;
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
                topGuestComponent = new TopGuestComponent(driver);
        }


        //Object
        //Atomic logic
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

        //MySpase


        // ManuPopUp
        public MainManuPopUp getMainManuPopUp() {
                return mainManuPopUp;
        }
        public UBSCourierPopUp getUBSCourierPopUp(){return ubcCourierPopUp;}


        //Functional
        protected void scrollToElement(WebElement el) {
                Actions action = new Actions(driver);
                action.moveToElement(el).perform();
        }
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

        /**
         * Go to HomePage from Main Menu.
         * @return HomePage
         */

        public HomePage navigateMenuHome() {
                getMainManuPopUp().clickHomePage();
                return new HomePage(driver);
        }

        /**
         *  Go to HomePage from Footer.
         * @return HomePage
         */
        public HomePage navigateMenuHomeFooter(){
                System.out.println("gotoMenuHomeFooter()");
                getFooter().clickFooterHomePage();
                return new HomePage(driver);
        }

        /**
         * Go to EcoNewsPage from Main Manu.
         * @return EcoNewsPage
         */

        public EcoNewsPage navigateMenuEcoNews() {
                getMainManuPopUp().clickMenuEcoNewsPage();
                return new EcoNewsPage(driver);
        }

        /**
         *  Go to EcoNewsPage from Footer.
         * @return EcoNewsPage
         */
        public EcoNewsPage navigateMenuEcoNewsFooter() {
                System.out.println("navigateMenuEcoNewsFooter()");
                getFooter().clickFooterEcoNewsPage();
                System.out.println("footer.clickFooterEcoNewsPage();");
                return new EcoNewsPage(driver);}

        /**
         * Go to TipsTricksPage from Main Manu.
         * @return TipsTricksPage
         */
        public TipsTricksPage navigateMenuTipsTricks() {
                getMainManuPopUp().clickMenuTipsTricksPage();
                return new TipsTricksPage(driver);
        }

        /**
         * Go to TipsTricksPage from Footer.
         * @return TipsTricksPage
         */

        public TipsTricksPage navigateMenuTripandTricksFooter(){
                System.out.println("navigateMenuTripandTricksFooter()");
                // getFooter().scrollDown();
                System.out.println("footer.scrollDown();");
                getFooter().clickFooterTipsTricksPage();
                System.out.println(" footer.clickFooterTipsTricksPage()");
                return new TipsTricksPage(driver);
        }

        /**
         * Go to EventsPage from Main Manu.
         * @return EventsPage
         */
        public EventsPage navigateMenuEvents() {
                getMainManuPopUp().clickMenuEventsPage();
                return new EventsPage(driver);
        }

        /**
         * Go to EventsPage from Footer.
         * @return EventsPage
         */
        public EventsPage navigateMenuEventsFooter()  {
                System.out.println("navigateMenuTripandTricksFooter");
                getFooter().clickFooterEventsPage();
                System.out.println(" footer.clickFooterTipsTricksPage()");
                return new EventsPage(driver);
        }

        /**
         * Go to PlacesPage from Main Manu.
         * @return PlacesPage
         */
        public PlacesPage navigateMenuPlaces() {
                getMainManuPopUp().clickMenuPlacesPage();
                if(SingInDropdoun ().isDisplayedcloseWindow()){
                        SingInDropdoun().clickcloseWindow();
                        return new PlacesPage(driver);
                }
                return new PlacesPage(driver);
        }

        /**
         * Go to PlacesPage from Footer.
         * @return PlacesPage
         * @throws InterruptedException
         */
        public PlacesPage navigateMenuPlacesFooter() throws InterruptedException {
                System.out.println("gotoPlacesPageFooter");
                getFooter().clickFooterPlacesPage();
                if(SingInDropdoun ().isDisplayedcloseWindow()){
                        SingInDropdoun().clickcloseWindow();
                        return new PlacesPage(driver);
                }
                return new PlacesPage(driver);
        }

        /**
         * Go to AboutUsPage from Main Manu.
         * @return AboutUsPage
         */
        public AboutUsPage navigateMenuAboutUs() {
                getMainManuPopUp().clickMenuAboutUsPage();
                // if(SingInDropdoun ().isDisplayedcloseWindow()){
                //         SingInDropdoun().clickcloseWindow();
                //         return new AboutUsPage(driver);
                //}
                return new AboutUsPage(driver);
        }

        /**
         * Go to AboutUsPage form Footer.
         * @return AboutUsPage
         */
        public AboutUsPage navigateMenuAboutUsFooter() {
                System.out.println("gotoAboutusPagefooter()");
                getFooter().clickFooterAboutUsPage();
                if(SingInDropdoun ().isDisplayedcloseWindow()){
                        SingInDropdoun().clickcloseWindow();
                        return new AboutUsPage(driver);
                }
                return new AboutUsPage(driver);
        }

        /**
         * Go to MySpacePage from Main Manu. Close SingInDropdown.
         * @return MySpacePage
         */
        public MySpacePage navigateMenuMySpace() {
                getMainManuPopUp().clickMenuMySpacePage();
                if(SingInDropdoun ().isDisplayedcloseWindow()){
                        SingInDropdoun().clickcloseWindow();
                        return new MySpacePage(driver);
                }
                return new MySpacePage(driver);
        }

        /**
         * Go to UBSCourierPage from Main Manu.
         * @return UBSCourierPage
         */
        public UBSCourierPage navigateMenuUBSCourier(){
                System.out.println("gotoUbsCourierPage()");
                getMainManuPopUp().clickMenuUBSCourierPage();
                return new UBSCourierPage(driver);
        }

        /**
         * Close SingInDropdown on UBSCourierPage
         * @return SingInPopUp
         */
        public SingInPopUp navigateSingInDropdown() {
                System.out.println("navigateSingInDropdown()");
                // getMainMenuDropdown().clickSingInDropdown();
                System.out.println(".clickSingInDropdown()");
                if(SingInDropdoun ().isDisplayedcloseWindow()){
                        SingInDropdoun().clickcloseWindow();
                        return new SingInPopUp(driver);
                }
                return new SingInPopUp(driver);
        }

        /**
         * Go to MyhabitsPage from Footer.
         * @return MyhabitsPage
         */
        public MyhabitsPage navigateMyhabitsPageFooter() {
                System.out.println("navigateMyhabitsPageFooter()");
                getFooter().clickFooterMyHabitsPage();
                System.out.println(".clickFooterMyHabitsPage()");
                if(SingInDropdoun ().isDisplayedcloseWindow()){
                        SingInDropdoun().clickcloseWindow();
                        return new MyhabitsPage(driver);
                }
                return new MyhabitsPage(driver);
        }

        /**
         * Click on SingUpPopUp.
         * @return
         */
        public SingUpPopUp gotoSingUpPopUp(){
                topGuestComponent = new TopGuestComponent(driver);
                topGuestComponent.clickSingUpLink();
                return new SingUpPopUp(driver);
        }
}
