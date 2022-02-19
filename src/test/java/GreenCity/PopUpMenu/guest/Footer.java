package GreenCity.PopUpMenu.guest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class Footer  {
    private WebDriver driver;

    @FindBy(css= ".footer_logo-wrp>a>img.logo")
    private WebElement footerHomePage;
    @FindBy(css="ul.footer_left-side>li:nth-child(1) > a")
    private WebElement footerEcoNewsPage;
    //@FindBy(css="div.container>nav.footer_links>ul.footer_left-side>li>a[href*='#/tips']")
    @FindBy(css = "ul.footer_left-side>li:nth-child(2) > a")
    private WebElement footerTipsTricksPage;
    //@FindBy(xpath="//a[contains(@href, '#/events')]")
    @FindBy(css= "ul.footer_left-side>li:nth-child(3) > a")
    private WebElement footerEventsPage;
    @FindBy(css="ul.footer_left-side>li:nth-child(4) > a")
    private WebElement footerPlacesPage;
    @FindBy(css="ul.footer_left-side>li:nth-child(5) > a")
    private WebElement footerAboutUsPage;
    @FindBy( css = "ul.footer_left-side>li:nth-child(6) > a" )
    private WebElement footerMyHabitsPage;
    // @FindBy(css="img.logo")
    @FindBy(css = "div#copyright-label")
    private WebElement copyright;
    @FindBy(css=".footer_social-link:nth-child(1) > img")
    private WebElement footerLinkTwitter;
    @FindBy(css=".footer_social-link:nth-child(2) > img")
    private WebElement footerLinkInstagram;
    @FindBy(css=".footer_social-link:nth-child(3) > img")
    private WebElement footerLinkFacebook;

    public Footer(WebDriver driver) {
        PageFactory.initElements(driver, this);
        //super(driver);
        this.driver = driver;
    }


    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", getCopyright());
    }

    public void waitOfPageFullDownloading(){
        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div#copyright-label")));
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

    public void clickFooterHomePage() {
        scrollDown();
         //Thread.sleep(1000);
        waitOfPageFullDownloading();
        getFooterHomePage().click();

    }

    public boolean isDisplayedFooterHomePage(){
        return getFooterHomePage().isDisplayed();
    }
    //
    //EcoNews
    private WebElement getFooterEcoNewsPage() {

        return footerEcoNewsPage;
    }

    public String getFooterEcoNewsPageText()  {
        return getFooterEcoNewsPage().getText();
    }

    public void clickFooterEcoNewsPage() {
        //Thread.sleep(1000);
        waitOfPageFullDownloading();
        System.out.println("scrollDown");
        scrollDown();
        //Thread.sleep(1000);
        waitOfPageFullDownloading();
        System.out.println("clickFooterEcoNewsPage");
        getFooterEcoNewsPage().click();
    }

    public boolean isDisplayedFooterEcoNewsPage()  {
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

        System.out.println("scrollDown");
        scrollDown();
        waitOfPageFullDownloading();
        //Thread.sleep(1000);
        System.out.println("getFooterTipsTricksPage().click()");
        getFooterTipsTricksPage().click();


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

        System.out.println("scrollDown");
        scrollDown();
        waitOfPageFullDownloading();
       // Thread.sleep(1000);
        System.out.println(" getFooterEventsPage().click()");
        getFooterEventsPage().click();
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

    public void clickFooterPlacesPage() throws InterruptedException {
        System.out.println("scrollDown");
        scrollDown();
        //waitOfPageFullDownloading();

        Thread.sleep(5000);
        System.out.println(" getFooterPlacesPage().click()");
        getFooterPlacesPage().click();
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
        System.out.println("scrollDown");
        scrollDown();
        waitOfPageFullDownloading();
       //Thread.sleep(1000);
        System.out.println(" getFooterAboutUsPage().click()");
        getFooterAboutUsPage().click();

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

    public void clickFooterMyHabitsPage() {
        System.out.println("scrollDown");
        // Thread.sleep(1000);
        scrollDown();
        waitOfPageFullDownloading();
       // Thread.sleep(1000);
        System.out.println(" getFooterMyHabitsPage().click();");
        getFooterMyHabitsPage().click();
        System.out.println("MyHabitsPage");
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
        scrollDown();
        waitOfPageFullDownloading();
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
        scrollDown();
        waitOfPageFullDownloading();
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
        scrollDown();
        waitOfPageFullDownloading();
        if(isDisplayedFooterLinkFacebook()){
            getFooterLinkFacebook().click();
            System.out.println("MyHabitsPage");
        }
    }

    public boolean isDisplayedFooterLinkFacebook(){
        return getFooterLinkFacebook().isDisplayed();
    }

}
