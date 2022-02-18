package GreenCity.peges;

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
    @FindBy(xpath="//button[@type='submit']")
    private WebElement login;
    @FindBy(css="form.sign-in-form .alert-general-error")
    private WebElement errorText;
    @FindBy(className="google-sign-in")
    private WebElement loginMail;
    @FindBy(xpath="//a[contains(text(),'Зареєструватись')]")
    private WebElement toLogUp;
   // @FindBy(className = "close-modal-window")
    @FindBy (css = "img.cross-btn")
    private WebElement close;

   public SingInPopUp(WebDriver driver){
       super(driver);
        this.driver = driver;

        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    //Set user name in textbox
    public void setUserName(String strUserName){
        guestName.sendKeys(strUserName);
    }
    //Set password in password textbox
    public void setPassword(String strPassword){
        guestPassword.sendKeys(strPassword);
    }
    //Click on login button
    public void clickLogin(){
        login.click();
    }
    //Get Text with error
    public String getLoginText(){
        return errorText.getText();
    }
    //Sing in by google account
    public void singInMail(){
        loginMail.click();
    }
    //Back to sing up page
    public void linkToLogUp(){
        toLogUp.click();
    }
    //Close the window
   // public void closeWindow(){
        //close.click();
   // }

    public void loginToGuest(String strUserName,String strPasword){
        //Fill user name
        this.setUserName(strUserName);
        //Fill password
        this.setPassword(strPasword);
        //Click Login button
        this.clickLogin();
    }
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

}
