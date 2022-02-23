package GreenCity.PopUpMenu.guest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Base abstract class MainManuPopUp of Header
 */

public class MainManuPopUp {
    protected WebDriver driver;
    //Upper Menu
    @FindBy(css = ".header_burger-btn")
    private WebElement naviconButton;
    @FindBy(css = ".header_burger-btn>div>div")
    private WebElement naviconButtonInUBSourier;
    @FindBy(css = ".header_logo > img")
    private WebElement homePage;
    @FindBy(css = "div.app-wrapper .header_navigation-menu>nav>ul>li:nth-child(1) > a")
    private WebElement menuEcoNewsPage;
    @FindBy(css = "div.app-wrapper .header_navigation-menu>nav>ul>li:nth-child(2) > a")
    private WebElement menuTipsTricksPage;
    @FindBy(css = "div.app-wrapper .header_navigation-menu>nav>ul>li:nth-child(3) > a")
    private WebElement menuEventsPage;
    @FindBy(css = "div.app-wrapper .header_navigation-menu>nav>ul>li:nth-child(4) > a")
    private WebElement menuPlacesPage;
    @FindBy(css = "div.app-wrapper .header_navigation-menu>nav>ul>li:nth-child(5) > a")
    private WebElement menuAboutUsPage;
    @FindBy(css = "div.app-wrapper .header_navigation-menu>nav>ul>li:nth-child(6) > a")
    private WebElement menuMySpacePage;
    @FindBy(css = "div.app-wrapper .header_navigation-menu>nav>ul>li:nth-child(7) > a")
    private WebElement menuUBSCourierPage;
    @FindBy(xpath = "//img[@alt='close button']")
    protected WebElement closeSingIn;
    @FindBy( css ="a.ubs-header-sign-in.ng-star-inserted")
    private WebElement singInLinkUBS;
    @FindBy (css = ".header_navigation-menu-ubs .header_mobile-menu-sign-in>a")
    private  WebElement menuSingUpDropdownInUBS;
    @FindBy(css ="a.header_sign-in-link.tertiary-global-button")
    private WebElement singInLink;
    @FindBy(css =".tertiary-global-button:nth-child(1)")
    private  WebElement menuSingInDropdown;


    public MainManuPopUp(WebDriver driver) {
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);


    }
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", menuSingInDropdown);
    }

    //Atomic logic
    //
    //naviconButton
    private WebElement getNaviconButton() {
        return naviconButton;
    }

    public String getNaviconButtonText() {
        return getNaviconButton().getText();
    }

    public void clickNaviconButton() {
        if (isDisplayedNaviconButton()) {
            getNaviconButton().click();
        }
    }

    public boolean isDisplayedNaviconButton() {
        return getNaviconButton().isDisplayed();
    }

    //naviconButtonInUBSourier
    public WebElement getNaviconButtonInUBSourier (){
        return naviconButtonInUBSourier;
    }

    public String NaviconButtonInUBSourierText() {
        return getNaviconButtonInUBSourier().getText();
    }

    public void clickNaviconButtonInUBSourier(){
        if(isDisplayedNaviconButtonInUBSourier()){
            getNaviconButtonInUBSourier().click();
        }}

    public boolean isDisplayedNaviconButtonInUBSourier() { return getNaviconButtonInUBSourier().isDisplayed();
    }




    //
    //Home Page
    private WebElement getHomePage() {
        return homePage;
    }

    public String getHomePageText() {
        return getHomePage().getText();
    }

    public void clickHomePage() {
        if (isDisplayedHomePage()) {
            getHomePage().click();

        }
    }


    public boolean isDisplayedHomePage() {
        return getHomePage().isDisplayed();
    }


    private WebElement getCloseSingIn() {
        return closeSingIn;
    }

    public String getCloseSingInText() {
        return getCloseSingIn().getText();
    }

    public void clickCloseSingIn() {
        if (isDisplayedCloseSingIn())
            getCloseSingIn().click();
    }

    public boolean isDisplayedCloseSingIn() {
        return getCloseSingIn().isDisplayed();
    }



    public WebElement getMenuEcoNewsPage(){
        if(!isDisplayedMenuEcoNewsPage()){
            clickNaviconButton();
        }return menuEcoNewsPage; }


    public void  clickMenuEcoNewsPage(){
        if(!isDisplayedMenuEcoNewsPage()){
            clickNaviconButton();
        }
        getMenuEcoNewsPage().click();
    }

    public String getMenuEcoNewsPageText() {
        if(!isDisplayedMenuEcoNewsPage()){
            clickNaviconButton();
        }
        return getMenuEcoNewsPage().getText();
    }

    public boolean isDisplayedMenuEcoNewsPage() {
        return menuEcoNewsPage.isDisplayed();
    }


    public WebElement getMenuTipsTricksPage(){
        if(!isDisplayedTipsTricksPage()){
            clickNaviconButton();
        }
        return menuTipsTricksPage;
    }

    public String getMenuTipsTricksText() {
        if(!isDisplayedTipsTricksPage()){
            clickNaviconButton();
        }
        return getMenuTipsTricksPage().getText();
    }

    public void clickMenuTipsTricksPage(){
        if(!isDisplayedTipsTricksPage()){
            clickNaviconButton();
        }
        getMenuTipsTricksPage().click();
    }

    public boolean isDisplayedTipsTricksPage() {
        return menuTipsTricksPage.isDisplayed();
    }

    //

//    Events
    public WebElement getMenuEventsPage(){
        if(!isDisplayedEventsPage()){
            clickNaviconButton();
        }
        return menuEventsPage;
    }

    public void clickMenuEventsPage(){
        if(!isDisplayedEventsPage()){
            clickNaviconButton();
        }

        getMenuEventsPage().click();
    }

    public String getMenuEventsText() {
        if(!isDisplayedEventsPage()){
            clickNaviconButton();
        }
        return getMenuEventsPage().getText();
    }


    public boolean isDisplayedEventsPage() {
        return menuEventsPage.isDisplayed();
    }

    //
    //Places


    public WebElement getMenuPlacesPage(){
        if(!isDisplayedPlacesPage()){
            clickNaviconButton();
        }
        return menuPlacesPage;
    }


    public void clickMenuPlacesPage(){
        if(!isDisplayedPlacesPage()){
            clickNaviconButton();
        }

        getMenuPlacesPage().click();
    }

    public String getMenuPlacesText() {
        if(!isDisplayedPlacesPage()){
            clickNaviconButton();
        }
        return getMenuPlacesPage().getText();
    }

    public boolean isDisplayedPlacesPage() {
        return menuPlacesPage.isDisplayed();
    }

    //
    //About Us

    public WebElement getMenuAboutUsPage(){
        if(!isDisplayedMenuAboutUsPage()){
            clickNaviconButton();
        }
        return menuAboutUsPage;
    }

    public void clickMenuAboutUsPage(){
        if(!isDisplayedMenuAboutUsPage()){
            clickNaviconButton();
        }

        getMenuAboutUsPage().click();
    }

    public String getMenuAboutUsPageText() {
        if(!isDisplayedMenuAboutUsPage()){
            clickNaviconButton();
        }
        return getMenuAboutUsPage().getText();
    }

    public boolean isDisplayedMenuAboutUsPage() {
        return menuAboutUsPage.isDisplayed();
    }
    //
    //My Space
//
     public WebElement getMenuMySpacePage(){
        if(!isDisplayedMenuMySpacePage()){
        clickNaviconButton();
        }
        return menuMySpacePage;
     }


    public void clickMenuMySpacePage(){
        if(!isDisplayedMenuMySpacePage()){
            clickNaviconButton();
        }
        getMenuMySpacePage().click();

    }

    public String getMenuMySpacePageText() {
        if(!isDisplayedMenuMySpacePage()){
            clickNaviconButton();
        }
        return getMenuMySpacePage().getText();
    }


    public boolean isDisplayedMenuMySpacePage() {
        return menuMySpacePage.isDisplayed();
    }


    //
    //UBS Courier

    public WebElement getMenuUBSCourierPage(){
        if(!isDisplayedMenuUBSCourierPage()){
            clickNaviconButton();

        }
        return menuUBSCourierPage;
    }

    public void clickMenuUBSCourierPage(){
        if(!isDisplayedMenuUBSCourierPage()){
            clickNaviconButton();
        }

        getMenuUBSCourierPage().click();

    }

    public String getMenuUBSCourierPageText() {
        if(!isDisplayedMenuUBSCourierPage()){
            clickNaviconButton();
        }
        return getMenuUBSCourierPage().getText();
    }

    public boolean isDisplayedMenuUBSCourierPage() {
        return menuUBSCourierPage.isDisplayed();
    }


    // menuSingInDropdoun
    public WebElement getSingInDropdown(){
        if (isDisplayedmenuSingUpDropdownUBS()){ return singInLinkUBS;   }

        // if (isDisplayedmenuSingUpDropdown()){     return singInLink;     }

        if (!isDisplayedmenuSingUpDropdownInUBSInMenu()){  clickNaviconButtonInUBSourier();

        }
        return menuSingUpDropdownInUBS;

    }


    public void clickSingInDropdown() throws InterruptedException {
        if(!isDisplayedmenuSingUpDropdownUBS()){
            clickNaviconButtonInUBSourier();
        }
        getSingInDropdown().click();

    }

    public String SingInDropdownText() throws InterruptedException {
        if(!isDisplayedmenuSingUpDropdownUBS()){
            clickNaviconButtonInUBSourier();
        }
        return getSingInDropdown().getText();
    }


    public boolean isDisplayedmenuSingUpDropdownUBS() {
        return singInLinkUBS.isDisplayed();

    }
    public boolean isDisplayedmenuSingUpDropdownInUBSInMenu() {
        return menuSingUpDropdownInUBS.isDisplayed();

    }
//    public boolean isDisplayedmenuSingUpDropdown() {
//        return singInLink.isDisplayed();

    // }
    public WebElement getsingInLink () throws InterruptedException {
        if(!isDisplayedsingInLink()){
            clickNaviconButton();
            scrollDown();

            return menuSingInDropdown;
        }
        System.out.println("getsingInLink ()");
        return singInLink;
    }


    //sinInlinke
public void clicksingInLinke() throws InterruptedException {
//        if(!isDisplayedsingInLink()){
//            clickNaviconButton();
//        }
        System.out.println("clicksingInLinke()");
        getsingInLink ().click();

    }

    public String MysingInLinkText() throws InterruptedException {
        if(!isDisplayedsingInLink()){
            clickNaviconButton();
        }
        return getsingInLink().getText();
    }

    public boolean isDisplayedsingInLink() {

        return singInLink.isDisplayed();
    }




    //Functional

    //Basiness Logic
}






