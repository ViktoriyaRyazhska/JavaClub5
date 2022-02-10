package GreenCity.PopUpMenu.guest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public class MainManuPopUp {

    private WebDriver driver;
    @FindBy(css="span.menu-icon-wrapper")
    private WebElement naviconButton;
    @FindBy(css=".header_logo > img")
    private WebElement homePage;
    @FindBy(xpath="//a[contains(text(),'Eco news')]")
    private WebElement menuEcoNewsPage;
    @FindBy(xpath="//a[contains(text(),'Tips & Tricks')]")
    private WebElement menuTipsAndTricksPage;
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
        if(!isDisplayedNaviconButton()){
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
        if(!isDisplayedHomePage()) {
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
        if(!isDisplayedMenuEcoNewsPage()){
           getMenuEcoNewsPage().click();
        }
    }

    public boolean isDisplayedMenuEcoNewsPage(){
        return getMenuEcoNewsPage().isDisplayed();
    }
     //
    //Tips And Tricks
    private WebElement getMenuTipsAndTricksPage() {
        return menuTipsAndTricksPage;
    }

    public String getMenuTipsAndTricksText(){
        return getMenuTipsAndTricksPage().getText();
    }

    public void clickMenuTipsAndTricksPage() {
        if (!isDisplayedTipsAndTricksPage()) {
            getMenuTipsAndTricksPage().click();
        }
    }

    public boolean isDisplayedTipsAndTricksPage(){
        return getMenuTipsAndTricksPage().isDisplayed();
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
        if(!isDisplayedEventsPage()) {
            getMenuTipsAndTricksPage().click();
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
        if(!isDisplayedPlacesPage()){
           getMenuTipsAndTricksPage().click();
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
        if(!isDisplayedMenuAboutUsPage()){
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
        if(!isDisplayedMenuMySpacePage()){
            getMenuMySpacePage().click();
        }
    }
    public boolean isDisplayedMenuMySpacePage(){
        return getMenuMySpacePage().isDisplayed();
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
        if(!isDisplayedMenuUBSCourierPage()){
            getMenuMySpacePage().click();
        }
    }
    public boolean isDisplayedMenuUBSCourierPage(){
        return getMenuMySpacePage().isDisplayed();
    }

}
