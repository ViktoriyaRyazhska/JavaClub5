package GreenCity.PopUpMenu.guest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Footer extends MainManuPopUp {

    //Lower menu.Footer
    @FindBy(xpath="//a[contains(@href, '#/about')]")
    private WebElement footerHomePage;
    @FindBy(css="ul.footer_left-side>li>a[href*='#/news']")
    private WebElement footerEcoNewsPage;
    @FindBy(css="div.container>nav.footer_links>ul.footer_left-side>li>a[href*='#/tips']")
    private WebElement footerTipsTricksPage;
    @FindBy(xpath="//a[contains(@href, '#/events')]")
    private WebElement footerEventsPage;
    @FindBy(css="div.container>nav.footer_links>ul.footer_left-side>li>a[href*='#/places']")
    private WebElement footerPlacesPage;
    @FindBy(xpath="//a[contains(@href, '#/about')]")
    private WebElement footerAboutUsPage;
    @FindBy( css = "div.container>nav.footer_links>ul.footer_left-side>li>a[href*='#/profile']" )
    private WebElement footerMyHabitsPage;
    @FindBy(css="#copyright-label")
    private WebElement copyright;
    @FindBy(css=".footer_social-link:nth-child(1) > img")
    private WebElement footerLinkTwitter;
    @FindBy(css=".footer_social-link:nth-child(2) > img")
    private WebElement footerLinkInstagram;
    @FindBy(css=".footer_social-link:nth-child(3) > img")
    private WebElement footerLinkFacebook;

    public Footer(WebDriver driver) {
        super(driver);
    }


    protected void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", getCopyright());
    }

   // Business logic
   public void checkFooter() {
        scrollDown();
        clickFooterHomePage();
        scrollDown();
        clickFooterEcoNewsPage();
        System.out.println("FooterEcoNews");
        scrollDown();
        clickFooterTipsTricksPage();
        scrollDown();
        clickFooterEventsPage();
       // scrollDown();
        //clickFooterPlacesPage();
        scrollDown();
        clickFooterMyHabitsPage();
        System.out.println("MyHabitsPage");
        clickCloseSingIn();
        scrollDown();
        clickFooterAboutUsPage();
        scrollDown();
        clickFooterLinkTwitter();
        System.out.println("LinkTwitter");
        scrollDown();
        clickFooterLinkInstagram();
        System.out.println("LinkInstagram");
        scrollDown();
        clickFooterLinkFacebook();
        System.out.println("LinkFacebook");
    }



    //Atomic logic

    //Copyright
    public WebElement getCopyright() {
        return copyright;
    }

    public String getCopyrightText() {
        return getCopyright().getText();
    }


    public void clickCopyright() {
        getCopyright().click();
    }

    //Footer
    //
    //Home Page
    private WebElement getFooterHomePage() {
        return footerHomePage;
    }

    public String getFooterHomePageText(){
        return getFooterHomePage().getText();
    }

    public void clickFooterHomePage(){
        if(isDisplayedFooterHomePage()) {
            getFooterHomePage().click();
        }
    }

    public boolean isDisplayedFooterHomePage(){
        return getFooterHomePage().isDisplayed();
    }
    //
    //EcoNews
    private WebElement getFooterEcoNewsPage() {
        return footerEcoNewsPage;
    }

    public String getFooterEcoNewsPageText(){
        return getFooterEcoNewsPage().getText();
    }

    public void clickFooterEcoNewsPage() {
        if(isDisplayedFooterEcoNewsPage()){
            getFooterEcoNewsPage().click();
        }
    }

    public boolean isDisplayedFooterEcoNewsPage(){
        return getFooterEcoNewsPage().isDisplayed();
    }
    //
    //Tips And Tricks
    private WebElement getFooterTipsTricksPage() {
        return footerTipsTricksPage;
    }

    public String getFooterTipsTricksPageText(){
        return getFooterTipsTricksPage().getText();
    }

    public void clickFooterTipsTricksPage() {
        if (isDisplayedFooterTipsTricksPage()) {
            getFooterTipsTricksPage().click();
        }
    }

    public boolean isDisplayedFooterTipsTricksPage(){
        return getFooterTipsTricksPage().isDisplayed();
    }
    //
    //Events
    private WebElement getFooterEventsPage() {
        return footerEventsPage;
    }

    public String getFooterEventsText(){
        return getFooterEventsPage().getText();
    }

    public void clickFooterEventsPage(){
        if(isDisplayedFooterEventsPage()) {
            getFooterEventsPage().click();
        }
    }

    public boolean isDisplayedFooterEventsPage(){
        return getFooterEventsPage().isDisplayed();
    }
    //
    //Places
    private WebElement getFooterPlacesPage() {
        return footerPlacesPage;
    }

    public String getFooterPlacesText(){
        return getFooterPlacesPage().getText();
    }

    public void clickFooterPlacesPage(){
        if(isDisplayedFooterPlacesPage()){
            getFooterPlacesPage().click();
        }
    }

    public boolean isDisplayedFooterPlacesPage(){
        return getFooterPlacesPage().isDisplayed();
    }
    //
    //About Us
    private WebElement getFooterAboutUsPage() {
        return footerAboutUsPage;
    }

    public String getFooterAboutUsPageText(){
        return getFooterAboutUsPage().getText();
    }

    public void clickFooterAboutUsPage(){
        if(isDisplayedFooterAboutUsPage()){
            getFooterAboutUsPage().click();
        }
    }
    public boolean isDisplayedFooterAboutUsPage(){
        return getFooterAboutUsPage().isDisplayed();
    }
    //
    //My Habits

    private WebElement getFooterMyHabitsPage() {
        return footerMyHabitsPage;
    }

    public String getFooterMyHabitsPageText(){
        return getFooterMyHabitsPage().getText();
    }

    public void clickFooterMyHabitsPage(){
        if(isDisplayedFooterMyHabitsPage()){
            getFooterMyHabitsPage().click();
            System.out.println("MyHabitsPage");
        }
    }

    public boolean isDisplayedFooterMyHabitsPage(){
        return getFooterMyHabitsPage().isDisplayed();
    }

    //Follow us
    //Link Twitter
    private WebElement getFooterLinkTwitter() {
        return footerLinkTwitter;
    }

    public void clickFooterLinkTwitter(){
        if(isDisplayedFooterLinkTwitter()){
            getFooterLinkTwitter().click();
            System.out.println("MyHabitsPage");
        }
    }

    public boolean isDisplayedFooterLinkTwitter(){
        return getFooterMyHabitsPage().isDisplayed();
    }
    //footerLinkInstagram
    private WebElement getFooterLinkInstagram() {
        return footerLinkInstagram;
    }

    public void clickFooterLinkInstagram(){
        if(isDisplayedFooterLinkInstagram()){
            getFooterLinkInstagram().click();
            System.out.println("MyHabitsPage");
        }
    }

    public boolean isDisplayedFooterLinkInstagram(){
        return getFooterMyHabitsPage().isDisplayed();
    }

    // footerLinkFacebook
    private WebElement getFooterLinkFacebook() {
        return footerLinkFacebook;
    }

    public void clickFooterLinkFacebook(){
        if(isDisplayedFooterLinkFacebook()){
            getFooterLinkFacebook().click();
            System.out.println("MyHabitsPage");
        }
    }

    public boolean isDisplayedFooterLinkFacebook(){
        return getFooterLinkFacebook().isDisplayed();
    }

}
