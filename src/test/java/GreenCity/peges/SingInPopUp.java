package GreenCity.peges;

import GreenCity.PopUpMenu.guest.MainManuPopUp;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SingInPopUp extends TopPage {

    private WebDriver driver;
    @FindBy(id="email")
   private WebElement guestName;
    @FindBy(id ="password")
    private WebElement guestPassword;
    @FindBy(css = ".primary-global-button")
    private WebElement button;
    @FindBy(css = "a.header_sign-in-link.tertiary-global-button")
    private WebElement singInLink;
    @FindBy(css = ".tertiary-global-button:nth-child(1)")
    private WebElement singInLinkMobile;
//    @FindBy(xpath="//button[@type='submit']")
//    private WebElement login;
//    @FindBy(css="form.sign-in-form .alert-general-error")
//    private WebElement errorText;
//    @FindBy(className="google-sign-in")
//    private WebElement loginMail;
//    @FindBy(xpath="//a[contains(text(),'Зареєструватись')]")
//    private WebElement toLogUp;
//   // @FindBy(className = "close-modal-window")
    @FindBy (css = "img.cross-btn")
    private WebElement close;
    MainManuPopUp mainMenuPopUp;

   public SingInPopUp(WebDriver driver){
       super(driver);
       // this.driver = driver;

        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
       initElements();
    }
    private void initElements() {
        mainMenuPopUp=new MainManuPopUp(driver);
    }
    protected void scrollDown() throws InterruptedException {
        System.out.println("----1---");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        System.out.println("----2----");
        //Thread.sleep(500);
        js.executeScript("arguments[0].scrollIntoView(true);",  singInLink );
        //Thread.sleep(500);
    }

//    //Set user name in textbox
//    public void setUserName(String strUserName){
//        guestName.sendKeys(strUserName);
//    }
//    //Set password in password textbox
//    public void setPassword(String strPassword){
//        guestPassword.sendKeys(strPassword);
//    }
//    //Click on login button
//    public void clickLogin(){
//        login.click();
//    }
//    //Get Text with error
//    public String getLoginText(){
//        return errorText.getText();
//    }
//    //Sing in by google account
//    public void singInMail(){
//        loginMail.click();
//    }
//    //Back to sing up page
//    public void linkToLogUp(){
//        toLogUp.click();
//    }
//    //Close the window
//   // public void closeWindow(){
//        //close.click();
//   // }

//    public void loginToGuest(String strUserName,String strPasword){
//        //Fill user name
//        this.setUserName(strUserName);
//        //Fill password
//        this.setPassword(strPasword);
//        //Click Login button
//        this.clickLogin();
//    }
    //closeWindow()
    private WebElement closeWindow() {
        return close;
    }

    public String getcloseWindowText(){
        return closeWindow().getText();
    }

    public void clickcloseWindow(){
        System.out.println(" closeSingInDropdoun.click()");
        close.click();
    }

    public boolean isDisplayedcloseWindow(){
        return closeWindow().isDisplayed();
    }

    //email
    private WebElement getEmailSingInDropdoun() {
        return guestName;
    }

    public String getEmailSingInDropdounText(){
        return getEmailSingInDropdoun().getText();
    }

    public void clickEmailSingInDropdoun(){
        System.out.println(" closeSingInDropdoun.click()");
        guestName.click();
    }
    public void clearEmailSingInDropdoun(){
        guestName.clear();
    }
    public void sendKeysEmail(String userMail){
        getEmailSingInDropdoun().sendKeys(userMail);
    }

    public boolean isDisplayedEmailSingInDropdoun(){
        return getEmailSingInDropdoun().isDisplayed();
    }

    //password
    private WebElement getPasswordSingInDropdoun() {
        return guestPassword;
    }

    public String getPasswordSingInDropdounText(){
        return getPasswordSingInDropdoun().getText();
    }

    public void clickPasswordSingInDropdoun(){
        guestPassword.click();
    }
    public void clearPasswordSingInDropdoun(){
        guestPassword.clear();
    }
    public void sendKeysPassword(String userPassword){
        getPasswordSingInDropdoun().sendKeys(userPassword);
    }

    public boolean isDisplayedPasswordSingInDropdoun(){
        return getEmailSingInDropdoun().isDisplayed();
    }

    //button
    private WebElement getButtonSingInDropdoun() {
        return button;
    }

    public String getButtonSingInDropdounText(){
        return getButtonSingInDropdoun().getText();
    }

    public void clickbButtonSingInDropdoun(){
        button.click();
    }


    public boolean isDisplayedButtonSingInDropdoun(){
        return getButtonSingInDropdoun().isDisplayed();
    }

    //singInLink;
    private WebElement getsingInLink() throws InterruptedException {
        if(!isDisplayedgetsingInLink()){
            Thread.sleep(1000);
            mainMenuPopUp.clickNaviconButton();
            Thread.sleep(1000);
            scrollDown();
            Thread.sleep(1000);
            return singInLinkMobile;

        }
        return singInLink;
    }

    public String getsingInLinkText() throws InterruptedException {
        return getsingInLink().getText();
    }

    public void clicksingInLink() throws InterruptedException {
        Thread.sleep(1000);
        getsingInLink().click();
    }


    public boolean isDisplayedgetsingInLink() throws InterruptedException {
        return getsingInLink().isDisplayed();
    }

}
