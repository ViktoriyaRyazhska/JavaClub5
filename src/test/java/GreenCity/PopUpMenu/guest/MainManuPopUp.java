package GreenCity.PopUpMenu.guest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainManuPopUp {

    private WebDriver driver;

    @FindBy(css="span.menu-icon-wrapper")
    private WebElement naviconButton;
    @FindBy(css=".header_logo > img")
    private WebElement homePage;
    @FindBy(xpath="//a[contains(text(),'Eco news')]")
    private WebElement menuEcoNewsPage;
    @FindBy(xpath="//a[contains(text(),'Tips & Tricks')]")
    private WebElement menuTipsTricksPage;
    @FindBy(xpath="//a[contains(text(),'Events')]")
    private WebElement menuEventsPage;
    @FindBy(xpath="//a[contains(text(),'Places')]")
    private WebElement menuPlacesPage;
    @FindBy(xpath = "//a[contains(text(),'About us')]")
    private WebElement menuAboutUsPage;
    @FindBy( xpath = "//a[contains(text(),'My space')]" )
    private WebElement menuMySpacePage;
    @FindBy(  xpath = "//a[contains(text(),'UBS courier')]" )
    private WebElement menuUBSCourierPage;
    //
    @FindBy(css = ".header_navigation-menu-left-col li:nth-child(3) > a")
    private WebElement homePagePopUp;
    @FindBy(css = ".header_navigation-menu-left-col li:nth-child(1) > a")
    private WebElement menuEcoNewsPopUp;
    @FindBy(css = ".header_navigation-menu-left-col li:nth-child(2) > a")
    private WebElement menuTipsTricksPopUp;
    @FindBy(css = ".ng-star-inserted:nth-child(4) > a")
    private WebElement menuPlacesPopUp;
    @FindBy(css = ".header_navigation-menu-left-col li:nth-child(5) > a")
    private WebElement menuAboutPopUp;
    @FindBy(css = "li:nth-child(7) > a")
    private WebElement menuUSBCourierPopUp;
    @FindBy(css = ".header_navigation-menu-left-col li:nth-child(6) > a")
    private WebElement menuMySpacePopUp;




    public MainManuPopUp(WebDriver driver) {
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
        System.out.println("********");
    }


    //naviconButton
    private WebElement getNaviconButton() {
        return naviconButton;
    }

    public String getNaviconButtonText(){
        return getNaviconButton().getText();
    }

    public void clickNaviconButton(){
        if(!isDisplayedNaviconButton()){
            getNaviconButton().click();}
    }

    public boolean isDisplayedNaviconButton(){
        return getNaviconButton().isDisplayed();
    }
    //
    //Home Page
    private WebElement getHomePage() {
        if (!isDisplayedHomePage()) {
            clickNaviconButton();
            return getHomePagePopUp();
        }
        return homePage;
    }

    public String getHomePageText(){
        return getHomePage().getText();
    }

    public void clickHomePage(){getHomePage().click();}

    public boolean isDisplayedHomePage(){
        return homePage.isDisplayed();
    }
    //
    //EcoNews
    private WebElement getMenuEcoNewsPage() {
        if (!isDisplayedMenuEcoNewsPage()) {
            clickNaviconButton();
            return getMenuEcoNewsPopUp();}

        return menuEcoNewsPage;
    }

    public String getMenuEcoNewsPageText(){return getMenuEcoNewsPage().getText();}

    public void clickMenuEcoNewsPage() {
            getMenuEcoNewsPage().click();
    }

    public boolean isDisplayedMenuEcoNewsPage(){
        return menuEcoNewsPage.isDisplayed();
    }
    //
    //Tips And Tricks
    private WebElement getMenuTipsTricksPage() {
        if (!isDisplayedTipsTricksPage()) {
            clickNaviconButton();
            return getMenuTipsTricksPopUp();
        }
        return menuTipsTricksPage;
    }

    public String getMenuTipsTricksText(){
        return getMenuTipsTricksPage().getText();
    }

    public void clickMenuTipsTricksPage() {
            getMenuTipsTricksPage().click();

    }

    public boolean isDisplayedTipsTricksPage(){
        return menuTipsTricksPage.isDisplayed();
    }
    //
    //Events
    private WebElement getMenuEventsPage() {
        return menuEventsPage;
    }

    public String getMenuEventsText(){
        return getMenuEventsPage().getText();
    }

    public void clickMenuEventsPage(){
            getMenuEventsPage().click();

    }

    public boolean isDisplayedEventsPage(){
        return getMenuEventsPage().isDisplayed();
    }
    //
    //Places
    private WebElement getMenuPlacesPage() {
        if (!isDisplayedPlacesPage()) {
            clickNaviconButton();
            return getMenuPlacesPopUp();
        }
        return menuPlacesPage;
    }

    public String getMenuPlacesText(){
        return getMenuPlacesPage().getText();
    }

    public void clickMenuPlacesPage(){

            getMenuTipsTricksPage().click();

    }

    public boolean isDisplayedPlacesPage(){
        return menuPlacesPage.isDisplayed();
    }
    //
    //About Us
    private WebElement getMenuAboutUsPage() {
        if (!isDisplayedMenuAboutUsPage()) {
            clickNaviconButton();
            return getMenuAboutPopUp();
        }
        return menuAboutUsPage;
    }

    public String getMenuAboutUsPageText(){
        return getMenuAboutUsPage().getText();
    }

    public void clickMenuAboutUsPage(){

            getMenuAboutUsPage().click();

    }
    public boolean isDisplayedMenuAboutUsPage(){
        return menuAboutUsPage.isDisplayed();
    }
    //
    //My Space

    private WebElement getMenuMySpacePage() {
        if(!isDisplayedMenuMySpacePage()){
            clickNaviconButton();
            return getMenuMySpacePopUp();
        }
        return menuMySpacePage;
    }

    public String getMenuMySpacePageText(){
        return getMenuMySpacePage().getText();
    }

    public void clickMenuMySpacePage(){

            getMenuMySpacePage().click();

    }
    public boolean isDisplayedMenuMySpacePage(){
        return menuMySpacePage.isDisplayed();
    }
    //
    //UBS Courier
    private WebElement getMenuUBSCourierPage() {
        if (!isDisplayedMenuUBSCourierPage()) {
            clickNaviconButton();
            return getMenuUSBCourierPopUp();
        }
        return menuUBSCourierPage;
    }

    public String getMenuUBSCourierPageText(){
        return getMenuUBSCourierPage().getText();
    }

    public void clickMenuUBSCourierPage(){

            getMenuMySpacePage().click();

    }
    public boolean isDisplayedMenuUBSCourierPage(){
        return menuMySpacePage.isDisplayed();
    }

    //homePagePopUp

    public WebElement getHomePagePopUp() {
        return homePagePopUp;
    }

    public String getHomePagePopUpText() {
        return getHomePagePopUp().getText();
    }

    public void clickHomePagePopUp() {
        getHomePagePopUp().click();
    }
//
//    public boolean isDisplayedHomePagePopUp() {
//        return getHomePagePopUp().isDisplayed();
//    }

    //menuEcoNewsPopUp

    public WebElement getMenuEcoNewsPopUp() {
        return menuEcoNewsPopUp;
    }

    public String getMenuEcoNewsPopUpText() {
        return getMenuEcoNewsPopUp().getText();
    }

    public void clickMenuEcoNewsPopUp() {
        getMenuEcoNewsPopUp().click();
    }

//    public boolean isDisplayedMenuEcoNewsPopUp() {
//        return menuEcoNewsPopUp.isDisplayed();
//    }

    //menuTipsTricksPopUp

    public WebElement getMenuTipsTricksPopUp() {
        return menuTipsTricksPopUp;
    }

    public String getMenuTipsTricksPopUpText() {
        return getMenuEcoNewsPopUp().getText();
    }

    public void clickMenuTipsTricksPopUp() {
        getMenuEcoNewsPopUp().click();
    }
//
//    public boolean isDisplayedMenuTipsTricksPopUp() {
//        return menuTipsTricksPopUp.isDisplayed();
//    }

    //menuPlacesPopUp

    public WebElement getMenuPlacesPopUp() {
        return menuPlacesPopUp;
    }

    public String getMenuPlacesPopUpText() {
        return getMenuPlacesPopUp().getText();
    }

    public void clickMenuPlacesPopUp() {
        getMenuPlacesPopUp().click();
    }
//
//    public boolean isDisplayedMenuPlacesPopUp() {
//        return menuPlacesPopUp.isDisplayed();
//    }

    //menuAboutPopUp

    public WebElement getMenuAboutPopUp() {
        return menuAboutPopUp;
    }

    public String getMenuAboutPopUpText() {
        return getMenuAboutPopUp().getText();
    }

    public void clickMenuAboutPopUp() {
        getMenuAboutPopUp().click();
    }

//    public boolean isDisplayedMenuAboutPopUp() {
//        return menuAboutPopUp.isDisplayed();
//    }

    //menuUSBCourierPopUp

    public WebElement getMenuUSBCourierPopUp() {
        return menuUSBCourierPopUp;
    }

    public String getMenuUSBCourierPopUpText() {
        return getMenuUSBCourierPopUp().getText();
    }

    public void clickMenuUSBCourierPopUp() {
        getMenuUSBCourierPopUp().click();
    }

//    public boolean isDisplayedMenuUSBCourierPopUp() {
//        return menuUSBCourierPopUp.isDisplayed();
//    }

    //menuMySpacePopUp

    public WebElement getMenuMySpacePopUp() {
        return menuMySpacePopUp;
    }

    public String getMenuMySpacePopUpText() {
        return getMenuMySpacePopUp().getText();
    }

    public void clickMenuMySpacePopUp() {
        getMenuMySpacePopUp().click();
    }
}
//    public boolean isDisplayedMenuMySpacePopUp() {
//        return menuMySpacePopUp.isDisplayed();
//    }



