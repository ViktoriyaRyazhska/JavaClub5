package GreenCity.PopUpMenu.guest;

import GreenCity.data.RegistrationData;
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
    @FindBy(id = "email-err-msg")
    private WebElement wrongEmail;
    @FindBy(xpath="//div[@id='firstname-err-msg']/app-error/div")
    private WebElement errorSymbolName;
    @FindBy(xpath="//div[@id='password-err-msg']/app-error/div")
    private WebElement errorAmountPassword;
    @FindBy(xpath="//div[@id='password-err-msg']/app-error/div")
    private WebElement errorSymbolPassword;
    @FindBy(css="div#confirm-err-msg.error-message.ng-star-inserted")
    private WebElement errorCoincidePassword;
    @FindBy(xpath="//div[@id='password-err-msg']/app-error/div")
    private WebElement errorNoPassword;
    @FindBy(xpath="//mat-dialog-container[@id='mat-dialog-0']/app-auth-modal/div/div/div[2]/div/app-sign-up/form/div/img")
    private WebElement showHidePassword;
    @FindBy(xpath="//mat-dialog-container[@id='mat-dialog-0']/app-auth-modal/div/div/div[2]/div/app-sign-up/form/div[2]/img")
    private WebElement showHideRepassword;



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

    public void sendKeysRepeatPassword(String password){
        getRepeatPassword().sendKeys(password);
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

    //email error
    public WebElement getWrongEmail() {
        return wrongEmail;
    }
    public String getWrongEmailText() {
        return getWrongEmail().getText();
    }
    //errorSymbolName
    public WebElement getErrorSymbolName() {
        return errorSymbolName;
    }
    public String getErrorSymbolNameText() {
        return getErrorSymbolName().getText();
    }
    //errorSymbolPassword
    public WebElement getErrorSymbolPassword() {
        return errorSymbolPassword;
    }
    public String getErrorSymbolPasswordText() {
        return getErrorSymbolPassword().getText();
    }
    //errorAmountPassword
    public WebElement getErrorAmountPassword() {
        return errorAmountPassword;
    }
    public String getErrorAmountPasswordText() {
        return getErrorAmountPassword().getText();
    }
    //errorCoincidePassword

    public WebElement getErrorCoincidePassword() {
        return errorCoincidePassword;
    }
    public String getErrorCoincidePasswordText() {
        return getErrorCoincidePassword().getText();
    }
    //errorNoPassword
    public WebElement getErrorNoPassword() {
        return errorNoPassword;
    }
    public String getErrorNoPasswordText() {
        return getErrorNoPassword().getText();
    }

    //showHidePassword
    public WebElement getShowHidePassword() {
        return showHidePassword;
    }
    public void clickShowHidePassword() {
        getShowHidePassword().click();
    }

    //showHideRepassword
    public WebElement getShowHideRepassword() {
        return showHideRepassword;
    }
    public void clickShowHideRepassword() {
        getShowHideRepassword().click();
    }

    //Functional
    public void singUp(String email, String name, String password){
        clickEmail();
        sendKeysEmail(email);
        clickName();
        sendKeysName(name);
        clickPassword();
        sendKeysPassword(password);
        clickShowHidePassword();
        clickRepeatPassword();
        sendKeysRepeatPassword(password);
        clickShowHidePassword();
        clickShowHideRepassword();
        clickSingInButton();
    }

    public void singUpWrongEmail(String wrongEmail){
        clickEmail();
        sendKeysEmail(wrongEmail);
        clickName();
    }

    public void singUpErrorSymbolName(String email, String wrongName){
        clickEmail();
        sendKeysEmail(email);
        clickName();
        sendKeysName(wrongName);
        clickPassword();
    }

    public void singUpAmountPassword(String email, String name, String amountPassword) {
        clickEmail();
        sendKeysEmail(email);
        clickName();
        sendKeysName(name);
        clickPassword();
        sendKeysPassword(amountPassword);
        clickShowHidePassword();
        clickRepeatPassword();
    }

    //errorSymbolPassword
    public void singUpErrorSymbolPassword (String email, String name, String errorSymbolPassword) {
        clickEmail();
        sendKeysEmail(email);
        clickName();
        sendKeysName(name);
        clickPassword();
        sendKeysPassword(errorSymbolPassword);
        clickShowHidePassword();
        clickRepeatPassword();
    }

    //errorCoincidePassword
    public void singUpErrorCoincidePassword(String email, String name, String password, String errorSymbolPassword){
        clickEmail();
        sendKeysEmail(email);
        clickName();
        sendKeysName(name);
        clickPassword();
        sendKeysPassword(password);
        clickShowHidePassword();
        clickRepeatPassword();
        sendKeysRepeatPassword(errorSymbolPassword);
        clickShowHideRepassword();
        clickSingInButton();
    }

    public void singUpNoPassword(String email, String name){
        clickEmail();
        sendKeysEmail(email);
        clickName();
        sendKeysName(name);
        clickPassword();
        clickRepeatPassword();
    }


    public void regGoogleAccount(){
        GoogleAccountPage googleAccountPage =new GoogleAccountPage(driver);
        googleAccountPage.clickSingInGoogle();
    }
}
