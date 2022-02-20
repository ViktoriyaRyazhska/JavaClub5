package GreenCity.PopUpMenu.guest;

import GreenCity.peges.GoogleAccountPage;
import GreenCity.peges.TopPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingUpPopUp extends TopPage {
    private WebDriver driver;

    @FindBy(id = "email")
    private WebElement email;
    @FindBy(id="firstName")
    private WebElement name;
    @FindBy(id="password")
    private WebElement password;
    @FindBy(className="image-show-hide-password")
    private WebElement showPassword;
    @FindBy(id="repeatPassword")
    private WebElement repeatPassword;
    @FindBy(css=".primary-global-button:nth-child(9)")
    private WebElement singInButton;
    @FindBy(css=".exist-sign-in")
    private WebElement turnToSingIn;
    @FindBy(className="close-modal-window")
    private WebElement closeWindow;
    // @FindBy(className="google-sign-in")
    // private WebElement singInGoogle;

    public SingUpPopUp(WebDriver driver) {
        //this.driver=driver;
         super(driver);
        PageFactory.initElements(driver, this);
    }
    //Email
    public WebElement getEmail() {
        return email;
    }

    public void clickEmail() {
        getEmail().click();
    }

    public void sendKeysEmail(String userMail){
        getEmail().sendKeys(userMail);
    }

    //FirstName
    public WebElement getName() {
        return name;
    }

    public void clickName() {
        getName().click();
    }

    public void sendKeysName(String userName){
        getName().sendKeys(userName);
    }

    //Password
    public WebElement getPassword() {
        return password;
    }

    public void clickPassword() {
        getPassword().click();
    }

    public void sendKeysPassword(String password){
        getPassword().sendKeys(password);
    }

    //ShowPassword
    public WebElement getShowPassword() {
        return showPassword;
    }
    public void clickShowPassword() {
        getShowPassword().click();
    }

    //RepeatPassword
    public WebElement getRepeatPassword() {
        return repeatPassword;
    }

    public void clickRepeatPassword() {
        getRepeatPassword().click();
    }

    public void sendKeysRepeatPassword(String repassword){
        getRepeatPassword().sendKeys(repassword);
    }

    //singInBotton
    public WebElement getSingInButton() {
        return singInButton;
    }

    public String getSingInButtonText() {
        return getSingInButton().getText();
    }

    public void clickSingInButton() {
        getSingInButton().click();
    }

    //turnToSingIn
    public WebElement getTurnToSingIn() {
        return turnToSingIn;
    }

    public String getTurnToSingInText() {
        return getTurnToSingIn().getText();
    }

    public void clickTurnToSingIn() {
        getTurnToSingIn().click();
    }

    //Close Window
    public WebElement getCloseWindow() {
        return closeWindow;
    }

    public void clickCloseWindow() {
        getCloseWindow().click();
    }

    //Functional
    public void singUp(String email, String name, String password, String repassword){
        clickEmail();
        sendKeysEmail(email);
        clickName();
        sendKeysName(name);
        clickPassword();
        sendKeysPassword(password);
        clickRepeatPassword();
        sendKeysRepeatPassword(repassword);
        clickSingInButton();
    }

    public void regGoogleAccount(){
        GoogleAccountPage googleAccountPage =new GoogleAccountPage(driver);
        googleAccountPage.clickSingInGoogle();
    }
}
