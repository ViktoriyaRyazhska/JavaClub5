package GreenCity.peges;

import GreenCity.Components.TopGuestComponent;
import GreenCity.PopUpMenu.guest.Footer;
import GreenCity.PopUpMenu.guest.MainManuPopUp;
import GreenCity.PopUpMenu.guest.SingUpPopUp;
import GreenCity.PopUpMenu.guest.UBSCourierPopUp;
import GreenCity.data.Languages;
import GreenCity.data.SingInData;
import GreenCity.user.UserMenuRight;
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
        private SingInData singInData;
        private UserMenuRight userMenuRight;
        private EcoNewsPage ecoNewsPage;
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
                singInData=new SingInData();
                userMenuRight= new UserMenuRight(driver);
                ecoNewsPage=new EcoNewsPage(driver);
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
        //UserMenuRight
        public UserMenuRight getUserMenuRight(){return userMenuRight;}


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
         * Go to EcoNewsPage and check the items.
         * @return EcoNewsPage
         */

        public EcoNewsPage navigateMenuEcoNewsfilter() throws InterruptedException {
                ecoNewsPage = new EcoNewsPage(driver);
                try {
                        if (ecoNewsPage.isDisplayedPanelAccoun()) {

                                ecoNewsPage.clickPanelAccoun();
                                Thread.sleep(8000);
                                ecoNewsPage.clickFilterBy();
                                ecoNewsPage.endClickFilterBy();
                                ecoNewsPage.scrollDown(ecoNewsPage.getFooter().getCopyright());
                                ecoNewsPage.scrollDown(ecoNewsPage.getFooterapp());
                                Thread.sleep(3000);
                                ecoNewsPage.clickWrapper_btnbars();
                                Thread.sleep(1000);
                                ecoNewsPage.scrollDown(ecoNewsPage.getFooter().getCopyright());
                                Thread.sleep(1000);
                                ecoNewsPage.scrollDown(ecoNewsPage.getFooterapp());
                                ecoNewsPage.clickPanelAccoun();
                                return  new EcoNewsPage(driver);


                        }
                } catch (NoSuchElementException e) {
                        ecoNewsPage.clickFilterBy();
                        ecoNewsPage.endClickFilterBy();
                        ecoNewsPage.scrollDown(ecoNewsPage.getFooter().getCopyright());
                        ecoNewsPage.scrollDown(ecoNewsPage.getFooterapp());
                        Thread.sleep(3000);
                        ecoNewsPage.clickWrapper_btnbars();
                        Thread.sleep(1000);
                        ecoNewsPage.scrollDown(ecoNewsPage.getFooter().getCopyright());
                        Thread.sleep(1000);
                        ecoNewsPage.scrollDown(ecoNewsPage.getFooterapp());
                        return  new EcoNewsPage(driver);



                }
                return null;
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
                try{
                if(SingInDropdoun ().isDisplayedcloseWindow()){
                        SingInDropdoun().clickcloseWindow();
                        return new PlacesPage(driver);
                }}catch (NoSuchElementException e){
                return new PlacesPage(driver);}
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
                try{
                if(SingInDropdoun ().isDisplayedcloseWindow()){
                        SingInDropdoun().clickcloseWindow();
                        return new PlacesPage(driver);


                }}catch (NoSuchElementException e){
                     return   new PlacesPage(driver)   ;
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
                try{
                if(SingInDropdoun ().isDisplayedcloseWindow()){
                        SingInDropdoun().clickcloseWindow();
                        return new AboutUsPage(driver);
                }}catch (NoSuchElementException e){
                return new AboutUsPage(driver);}
                return new AboutUsPage(driver);
        }

        /**
         * Go to MySpacePage from Main Manu. Close SingInDropdown.
         * @return MySpacePage
         */
        public MySpacePage navigateMenuMySpace() {
                getMainManuPopUp().clickMenuMySpacePage();
                try{
                if(SingInDropdoun ().isDisplayedcloseWindow()){
                        SingInDropdoun().clickcloseWindow();
                        return new MySpacePage(driver);
                }}catch (NoSuchElementException e){
                return new MySpacePage(driver);}
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
                try{
                if(SingInDropdoun ().isDisplayedcloseWindow()){
                        SingInDropdoun().clickcloseWindow();
                        return new SingInPopUp(driver);
                }}catch (NoSuchElementException e){
                return new SingInPopUp(driver);}
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
                try{
                if(SingInDropdoun ().isDisplayedcloseWindow()){
                        SingInDropdoun().clickcloseWindow();
                        return new MyhabitsPage(driver);
                }}catch (NoSuchElementException e){
                        return new MyhabitsPage(driver);
                }
                return new MyhabitsPage(driver);
        }

        /**
         * Click on SingUpPopUp.
         * @return
         */
        public SingUpPopUp gotoSingUpPopUp() {
                topGuestComponent = new TopGuestComponent(driver);
                if(mainManuPopUp.isDisplayedNaviconButton()){
                        mainManuPopUp.clickNaviconButton();
                        //JavascriptExecutor js = (JavascriptExecutor) driver;
                       // js.executeScript("document.body.style.zoom='70%'");
                       // System.out.println("Minimaze");
                       // WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
                        //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.header_sign-up-btn.secondary-global-button")));
                        JavascriptExecutor jse = (JavascriptExecutor)driver;
                        jse.executeScript("arguments[0].scrollIntoView()", topGuestComponent.getSingUpLinkPopUp());
                       // System.out.println("Scroll");
                        topGuestComponent.clickSingUpLinkPopUp();
                        System.out.println("Click");
                       // JavascriptExecutor js2 = (JavascriptExecutor) driver;
                       // js2.executeScript("document.body.style.zoom='100%'");
                }
                else{
                topGuestComponent.clickSingUpLink();}
                return new SingUpPopUp(driver);

        }
        /**
         * Click and Enter(Data) on SingInPopUp.
         * @return
         */
        public HomePage navigateSingInDropdownEnter() throws InterruptedException {
                getMainMenuDropdown().clickMenuMySpacePage();
                SingInDropdoun ().clickEmailSingInDropdoun();
                SingInDropdoun ().clearEmailSingInDropdoun();
                SingInDropdoun ().sendKeysEmail(singInData.getEmail());
                SingInDropdoun ().clickPasswordSingInDropdoun();
                SingInDropdoun ().clearPasswordSingInDropdoun();
                SingInDropdoun ().sendKeysPassword(singInData.getPassword());
                SingInDropdoun ().clickbButtonSingInDropdoun();
                Thread.sleep(12000);
                //  wait.until();
                // wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.app-wrapper .header_navigation-menu>nav>ul>li:nth-child(1) > a")));
                return new HomePage(driver);

        }

        public MySpacePage navigateSingInRightEnter() throws InterruptedException {
                getMainMenuDropdown().clicksingInLinke();
                SingInDropdoun().clickEmailSingInDropdoun();
                SingInDropdoun().clearEmailSingInDropdoun();
                SingInDropdoun().sendKeysEmail(singInData.getEmail());
                SingInDropdoun().clickPasswordSingInDropdoun();
                SingInDropdoun().clearPasswordSingInDropdoun();
                SingInDropdoun().sendKeysPassword(singInData.getPassword());
                SingInDropdoun().clickbButtonSingInDropdoun();
                Thread.sleep(12000);
                return new MySpacePage(driver);
        }

        public HomePage navigateSingOut() throws InterruptedException {
               // userMenuRight=new UserMenuRight(driver);
                System.out.println("getUserMenuRight().isDisplayedHeaderUserName()"+getUserMenuRight().isDisplayedHeaderUserName());
                if(getUserMenuRight().isDisplayedHeaderUserName()){
                        getUserMenuRight().clickHeaderUserName();
                        getUserMenuRight().clickSignout();
                        return new HomePage(driver);
                }
                getUserMenuRight().clickSignout();

                 return new HomePage(driver);}
        }




