package GreenCity.user;

import GreenCity.PopUpMenu.guest.MainManuPopUp;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserMenuRight {
    private WebDriver driver;

    @FindBy( css = ".header_navigation-menu-right a.header_user-name>span")
    private WebElement HeaderUserName;
    @FindBy(css = "#header_user-wrp .drop-down-item:nth-child(3)>a")
    private WebElement  Signout;
    @FindBy( css = ".header_mobile-menu-item:nth-child(11) > a")
    private WebElement SignoutMobile;
    private MainManuPopUp mainManuPopUp;

    public UserMenuRight(WebDriver driver) {
        this.driver = driver;
        initElements();
        PageFactory.initElements(driver, this);
        System.out.println("+++++++construkor UserMenuRight");
    }
    private void initElements() {
        mainManuPopUp = new MainManuPopUp(driver);


    }
    protected void scrollDown() throws InterruptedException {
        System.out.println("----1---");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        System.out.println("----2----");
        //Thread.sleep(500);
        js.executeScript("arguments[0].scrollIntoView(true);", SignoutMobile );
        //Thread.sleep(500);
    }
    // HeaderUserName
    private WebElement getHeaderUserName() {
        return HeaderUserName;
    }

    public String getHeaderUserNameText(){
        return getHeaderUserName().getText();
    }

    public void clickHeaderUserName(){HeaderUserName.click();
    }

    public boolean isDisplayedHeaderUserName(){
        return getHeaderUserName().isDisplayed();
    }


    //Signout & SignoutMobile
    private WebElement getSignout() throws InterruptedException {
        if(mainManuPopUp.isDisplayedNaviconButton()){
            mainManuPopUp.clickNaviconButton();
            scrollDown();
            return SignoutMobile;}
//     if(!mainMenuDropdown.isDisplayedNaviconButton()){
//
//             return Signout;}
        return Signout;
    }

    public String getSignoutText() throws InterruptedException {
        return getSignout().getText();
    }

    public void clickSignout() throws InterruptedException {

        getSignout().click();
    }

    public boolean isDisplayedSignout(){
        return Signout.isDisplayed();
    }

//    public boolean isDisplayedSignoutMobile(){
//        return SignoutMobile.isDisplayed();
//    }
}

