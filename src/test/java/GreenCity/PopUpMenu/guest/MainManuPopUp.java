package GreenCity.PopUpMenu.guest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainManuPopUp {

    private WebDriver driver;
    @FindBy(css=".header_burger-btn")
    private WebElement naviconButton;
    @FindBy(css=".header_logo > img")
    private WebElement homePage;
    @FindBy(css="div.app-wrapper .header_navigation-menu>nav>ul>li:nth-child(1) > a")
    private WebElement menuEcoNewsPage;
    @FindBy(css="div.app-wrapper .header_navigation-menu>nav>ul>li:nth-child(2) > a")
    private WebElement menuTipsTricksPage;
    @FindBy(css="div.app-wrapper .header_navigation-menu>nav>ul>li:nth-child(3) > a")
    private WebElement menuEventsPage;
    @FindBy(css="div.app-wrapper .header_navigation-menu>nav>ul>li:nth-child(4) > a")
    private WebElement menuPlacesPage;
    @FindBy(css = "div.app-wrapper .header_navigation-menu>nav>ul>li:nth-child(5) > a")
    private WebElement menuAboutUsPage;
    @FindBy( css = "div.app-wrapper .header_navigation-menu>nav>ul>li:nth-child(6) > a" )
    private WebElement menuMySpacePage;
    @FindBy(css = "div.app-wrapper .header_navigation-menu>nav>ul>li:nth-child(7) > a" )
    private WebElement menuUBSCourierPage;
    @FindBy(className = "close-modal-window")
    protected WebElement closeSingIn;

    public MainManuPopUp(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    //Atomic logic
    //
    //naviconButton
    private WebElement getNaviconButton() {
        return naviconButton;
    }

    public String getNaviconButtonText(){
        return getNaviconButton().getText();
    }

    public void clickNaviconButton(){
        if(isDisplayedNaviconButton()){
            getNaviconButton().click();}
    }

    public boolean isDisplayedNaviconButton(){
        return getNaviconButton().isDisplayed();
    }
    //
    //Home Page
    private WebElement getHomePage() {
        return homePage;
    }

    public String getHomePageText(){
        return getHomePage().getText();
    }

    public void clickHomePage(){
        if(isDisplayedHomePage()) {
            getHomePage().click();
        }
    }

    public boolean isDisplayedHomePage(){
        return getHomePage().isDisplayed();
    }
    //
    //EcoNews
    private WebElement getMenuEcoNewsPage() {
        return menuEcoNewsPage;
    }

    public String getMenuEcoNewsPageText(){
        return getMenuEcoNewsPage().getText();
    }

    public void clickMenuEcoNewsPage() {
        clickNaviconButton();
        if(isDisplayedMenuEcoNewsPage()){
            getMenuEcoNewsPage().click();
        }
    }

    public boolean isDisplayedMenuEcoNewsPage(){
        return getMenuEcoNewsPage().isDisplayed();
    }
    //
    //Tips And Tricks
    private WebElement getMenuTipsTricksPage() {
        return menuTipsTricksPage;
    }

    public String getMenuTipsTricksText(){
        return getMenuTipsTricksPage().getText();
    }

    public void clickMenuTipsTricksPage() {
        clickNaviconButton();
        if (isDisplayedTipsTricksPage()) {
            getMenuTipsTricksPage().click();
        }
    }

    public boolean isDisplayedTipsTricksPage(){
        return getMenuTipsTricksPage().isDisplayed();
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
        clickNaviconButton();
        if(isDisplayedEventsPage()) {
            getMenuEventsPage().click();
        }
    }

    public boolean isDisplayedEventsPage(){
        return getMenuEventsPage().isDisplayed();
    }
    //
    //Places
    private WebElement getMenuPlacesPage() {
        return menuPlacesPage;
    }

    public String getMenuPlacesText(){
        return getMenuPlacesPage().getText();
    }

    public void clickMenuPlacesPage(){
        clickNaviconButton();
        if(isDisplayedPlacesPage()){
            getMenuPlacesPage().click();
        }
    }

    public boolean isDisplayedPlacesPage(){
        return getMenuPlacesPage().isDisplayed();
    }
    //
    //About Us
    private WebElement getMenuAboutUsPage() {
        return menuAboutUsPage;
    }

    public String getMenuAboutUsPageText(){
        return getMenuAboutUsPage().getText();
    }

    public void clickMenuAboutUsPage(){
        clickNaviconButton();
        if(isDisplayedMenuAboutUsPage()){
            getMenuAboutUsPage().click();
        }
    }
    public boolean isDisplayedMenuAboutUsPage(){
        return getMenuAboutUsPage().isDisplayed();
    }
    //
    //My Space

    private WebElement getMenuMySpacePage() {
        return menuMySpacePage;
    }

    public String getMenuMySpacePageText(){
        return getMenuMySpacePage().getText();
    }

    public void clickMenuMySpacePage(){
        clickNaviconButton();
        if(isDisplayedMenuMySpacePage()){
            getMenuMySpacePage().click();
        }
    }
    public boolean isDisplayedMenuMySpacePage(){
        return getMenuMySpacePage().isDisplayed();
    }

    private WebElement getCloseSingIn(){return closeSingIn;}
    public String getCloseSingInText() {
        return getCloseSingIn().getText();
    }
    public void clickCloseSingInPopUp() {
        if(isDisplayedCloseSingIn())
            getCloseSingIn().click();
    }
    public boolean isDisplayedCloseSingIn(){
        return getCloseSingIn().isDisplayed();
    }


    //
    //UBS Courier
    private WebElement getMenuUBSCourierPage() {
        return menuUBSCourierPage;
    }

    public String getMenuUBSCourierPageText(){
        return getMenuUBSCourierPage().getText();
    }

    public void clickMenuUBSCourierPage(){
        clickNaviconButton();
        if(isDisplayedMenuUBSCourierPage()){
            getMenuUBSCourierPage().click();
        }
    }
    public boolean isDisplayedMenuUBSCourierPage(){
        return getMenuUBSCourierPage().isDisplayed();
    }

}




