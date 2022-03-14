package GreenCity.peges;

import GreenCity.PopUpMenu.guest.Footer;
import GreenCity.PopUpMenu.guest.MainManuPopUp;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;


public class EcoNewsPage extends TopPage {
    final static Logger logger = LoggerFactory.getLogger(EcoNewsPage.class);
    MainManuPopUp mainManuPopUp;
    @FindBy(css = ".ul-eco-buttons>li:nth-child(1)>a")
    private WebElement filterBy_News;
    @FindBy(css = ".ul-eco-buttons>li:nth-child(1)>a>span>div")
    private WebElement endfilterBy_News;
    @FindBy(css = ".ul-eco-buttons>li:nth-child(2)>a")
    private WebElement filterBy_Events;
    @FindBy(css = ".ul-eco-buttons>li:nth-child(2) div.global-tag-close-icon")
    private WebElement endfilterBy_Events;
    @FindBy(css = ".ul-eco-buttons>li:nth-child(3)>a")
    private WebElement filterBy_Courses;
    @FindBy(css = ".ul-eco-buttons>li:nth-child(3) div.global-tag-close-icon")
    private WebElement endfilterBy_Courses;
    @FindBy(css = ".ul-eco-buttons>li:nth-child(4)>a")
    private WebElement filterBy_Initiatives;
    @FindBy(css = ".ul-eco-buttons>li:nth-child(4) div.global-tag-close-icon")
    private WebElement endfilterBy_Initiatives;
    @FindBy(css = ".ul-eco-buttons>li:nth-child(5)>a")
    private WebElement filterBy_Ads;
    @FindBy(css = ".ul-eco-buttons>li:nth-child(5) div.global-tag-close-icon")
    private WebElement endfilterBy_Ads;
    @FindBy(css = "div.wrapper  em.fa.fa-th-large")
    private WebElement wrapper_btntiles;
    @FindBy(css = "div.wrapper  em.fa.fa-bars")
    private WebElement wrapper_btnbars;
    @FindBy(css = "h1.main-header")
    private WebElement footerapp;
    @FindBy(css = "div.panel-account>span")
    private WebElement panelAccoun;
    private Footer footer;

    public EcoNewsPage(WebDriver driver) {
        super(driver);
        //This initElements method will create all WebElements
        initElements();
        PageFactory.initElements(driver, this);
        mainManuPopUp =new MainManuPopUp((driver));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        footer = new Footer(driver);

    }

    private void initElements() {
        if(logger.isInfoEnabled()){
            logger.info("This is info : class EcoNewsPage");
        }
    }



    // page Object
    //filterBy_News
    private WebElement getFilterBy_News() {
        return filterBy_News;
    }

    public String getFilterBy_NewsText(){
        return getFilterBy_News().getText();
    }

    public void clickFilterBy_News() throws InterruptedException {
        getFilterBy_News().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);
    }

    public boolean isDisplayedFilterBy_News(){
        return getFilterBy_News().isDisplayed();
    }

    //endfilterBy_News
    private WebElement getEndFilterBy_News() { return endfilterBy_News;
    }

    public String getEndFilterBy_NewsText(){
        return getEndFilterBy_News().getText();
    }

    public void clickEndFilterBy_News() throws InterruptedException {

        getFilterBy_News().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);
    }

    public boolean isDisplayedEndFilterBy_News(){
        return getEndFilterBy_News().isDisplayed();
    }


    //filterBy_Events
    private WebElement getFilterBy_Events() {
        return filterBy_Events;
    }

    public String getFilterBy_EventsText(){
        return getFilterBy_Events().getText();
    }

    public void clickFilterBy_Events() throws InterruptedException {

        getFilterBy_Events().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);
    }

    public boolean isDisplayedFilterBy_Events(){
        return getFilterBy_Events().isDisplayed();
    }

    //endfilterBy_Events
    private WebElement getEndFilterBy_Events() {
        return  endfilterBy_Events;
    }
    public void clickEndFilterBy_Events() throws InterruptedException {
        getEndFilterBy_Events().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);
    }
    public boolean isDisplayedEndFilterBy_Events(){
        return getEndFilterBy_Events().isDisplayed();
    }

    //filterBy_Courses
    private WebElement getFilterBy_Courses() {
        return filterBy_Courses;
    }

    public String getFilterBy_CoursesText(){
        return getFilterBy_Courses().getText();
    }

    public void clickFilterBy_Courses() throws InterruptedException {

        getFilterBy_Courses().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);
    }

    public boolean isDisplayedFilterBy_Courses(){
        return getFilterBy_Courses().isDisplayed();
    }

    //endfilterBy_Courses
    private WebElement getEndFilterBy_Courses() {
        return endfilterBy_Courses;
    }
    public void clickEndFilterBy_Courses() throws InterruptedException {
        getEndFilterBy_Courses().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);
    }
    public boolean isDisplayedEndFilterBy_Courses(){
        return getEndFilterBy_Courses().isDisplayed();
    }

    //filterBy_Initiatives
    private WebElement getFilterBy_Initiatives() {
        return filterBy_Initiatives;
    }

    public String getFilterBy_InitiativesText(){
        return getFilterBy_Initiatives().getText();
    }

    public void clickFilterBy_Initiatives() throws InterruptedException {

        getFilterBy_Initiatives().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);
    }

    public boolean isDisplayedFilterBy_Initiatives(){
        return getFilterBy_Initiatives().isDisplayed();
    }

    //endfilterBy_Initiatives
    private WebElement getEndFilterBy_Initiatives() {
        return endfilterBy_Initiatives;
    }
    public void clickEndFilterBy_Initiatives() throws InterruptedException {
        getEndFilterBy_Initiatives().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);
    }
    public boolean isDisplayedEndFilterBy_Initiatives(){
        return getEndFilterBy_Initiatives().isDisplayed();
    }

    //filterBy_Ads
    WebElement getFilterBy_Ads() {
        return filterBy_Ads;
    }

    public String getFilterBy_AdsText(){
        return getFilterBy_Ads().getText();
    }

    public void clickFilterBy_Ads() throws InterruptedException {
        getFilterBy_Ads().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);
    }

    public boolean isDisplayedFilterBy_Ads(){
        return getFilterBy_Ads().isDisplayed();
    }

    //endfilterBy_Ads
    private WebElement getEndFilterBy_Ads() {
        return endfilterBy_Ads;
    }
    public void clickEndFilterBy_Ads() throws InterruptedException {

        getEndFilterBy_Ads().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);
    }
    public boolean isDisplayedEndFilterBy_Ads(){
        return getEndFilterBy_Ads().isDisplayed();
    }

    //wrapper_btntiles
    private WebElement getWrapper_btntiles() {
        return wrapper_btntiles;
    }
    public void clickWrapper_btntiles() throws InterruptedException {

        getWrapper_btntiles().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);
    }
    public boolean isDisplayedEndWrapper_btntiles(){
        return getWrapper_btntiles().isDisplayed();
    }

    // wrapper_btnbars
    WebElement getWrapper_btnbars() {
        return  wrapper_btnbars;
    }
    public void clickWrapper_btnbars() throws InterruptedException {

        getWrapper_btnbars().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);
    }
    public boolean isDisplayedWrapper_btnbars(){
        return getEndFilterBy_Ads().isDisplayed();
    }

    //panelAccoun
    WebElement getPanelAccoun() {
        return  panelAccoun;
    }
    public void clickPanelAccoun() throws InterruptedException {

        getPanelAccoun().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);
    }
    public boolean isDisplayedPanelAccoun(){
        return getPanelAccoun().isDisplayed();
    }


    //Functional


    public WebElement getFooterapp() {
        return footerapp;
    }



    //Basiness Logic
    public void clickFilterBy() throws InterruptedException {
        clickFilterBy_News();
        clickFilterBy_Events();
        clickFilterBy_Courses();
        clickFilterBy_Initiatives();
        clickFilterBy_Ads();

    }
    public void endClickFilterBy() throws InterruptedException {
        clickEndFilterBy_News();
        clickEndFilterBy_Events();
        clickEndFilterBy_Courses();
        clickEndFilterBy_Initiatives();
        clickEndFilterBy_Ads();


    }
    protected void scrollDown(WebElement webElement) throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",webElement);
        //Thread.sleep(500);
    }



}

