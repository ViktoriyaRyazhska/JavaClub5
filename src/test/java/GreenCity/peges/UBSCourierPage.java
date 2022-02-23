package GreenCity.peges;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class UBSCourierPage extends TopPage{

    @FindBy(css=".button:nth-child(3)")
    private WebElement collCourier1Button;
    @FindBy(css=".cross-btn")
    private WebElement closeLogin;
    @FindBy(xpath="//div[@id='main-content']/button")
    private WebElement collCourier2Button;
    @FindBy(css ="ul.footer-links>li:nth-child(1) > a")
    private WebElement userAgreement;
    @FindBy(css ="ul.footer-links>li:nth-child(2) > a")
    private WebElement  publicOffer;
    @FindBy(css ="ul.footer-links>li:nth-child(3) > a")
    private WebElement  helpProject;
    @FindBy(css ="ul.footer-links>li:nth-child(4) > a")
    private WebElement  getThere;
    @FindBy(css="div.footer-content>p:nth-child(3) > a")
    private WebElement preciousPlastic;
    @FindBy(id = "email")
    private WebElement subscribeToNewsletter;
    @FindBy(css="button:nth-child(4)")
    private WebElement subscribeButton;


    public UBSCourierPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    //Coll Courier1
    public WebElement getCollCourier1Button() {
        return collCourier1Button;
    }

    public void clickCollCourier1Button() {
        getCollCourier1Button().click();
    }

    //Coll Courier2
    public WebElement getCollCourier2Button() {
        return collCourier2Button;
    }

    public void clickCollCourier2Button() {
        getCollCourier2Button().click();
    }

    //Close login window
    public WebElement getCloseLogin() {
        return closeLogin;
    }

    public void clickCloseLogin() {getCloseLogin().click();}

    public boolean isDisplayedCloseLoginBotton() {return closeLogin.isDisplayed();}

    //User Agreement Page
    public WebElement getUserAgreement() {return userAgreement;}

    public void clickUserAgreement() {getUserAgreement().click();}

    //Public Offer Page
    public WebElement getPublicOffer() {return publicOffer;}

    public void clickPublicOffer() {getPublicOffer().click();}

    //Help Project Page
    public WebElement getHelpProject() {return helpProject;}

    public void clickHelpProject() {getHelpProject().click();}

    //Get there Page
    public WebElement getGetThere() {return getThere;}

    public void clickGetThere() {getGetThere().click();}

    //Precious Plastic Page
    public WebElement getPreciousPlastic() {return preciousPlastic;}

    public void clickPreciousPlastic() {getPreciousPlastic().click();}

    //Subscribe To Newsletter

    public WebElement getSubscribeToNewsletter() {
        return subscribeToNewsletter;
    }

    public void clickSubscribeToNewsletter() {
        getSubscribeToNewsletter().click();
    }

    public void sendKeysSubscribeToNewsletter(String userMail){getSubscribeToNewsletter().sendKeys(userMail);}

   //Subscribe Button
   public WebElement getSubscribeButton() {
       return  subscribeButton;
   }

    public void clickSubscribeButton() {
        getSubscribeButton().click();
    }


    //Functional
    public void skipFromWindows() throws InterruptedException{
         String parentWindow = driver.getWindowHandle();
         Set<String> handles = driver.getWindowHandles();
    for (String windowHandle : handles) {
        if (!windowHandle.equals(parentWindow)) {
            driver.switchTo().window(windowHandle);
            Thread.sleep(2000);
            driver.close(); //closing child window
            driver.switchTo().window(parentWindow);
            Thread.sleep(2000);
        }
    }
}

     public void clickColl1() throws InterruptedException {
             clickCollCourier1Button();
             Thread.sleep(1000);

    }

    public void clickColl2() throws InterruptedException {
            scrollToElement(collCourier2Button);
            clickCollCourier2Button();
            Thread.sleep(1000);
    }

    //Business logic
    public UBSCourierPage navigateGreenCity() {
        getUBSCourierPopUp().clickGreenCityPage();
        return new UBSCourierPage(driver);
    }


    public void gotoLinkPages() throws InterruptedException {
        scrollToElement(userAgreement);
        Thread.sleep(3000);
        clickUserAgreement();
        skipFromWindows();
        scrollToElement(publicOffer);
        Thread.sleep(3000);
        clickPublicOffer();
        skipFromWindows();
        scrollToElement(helpProject);
        Thread.sleep(3000);
        clickHelpProject();
        skipFromWindows();
        scrollToElement(getThere);
        Thread.sleep(3000);
        clickGetThere();
        skipFromWindows();
        scrollToElement(preciousPlastic);
        clickPreciousPlastic();
        Thread.sleep(3000);
        skipFromWindows();
        Thread.sleep(3000);
    }

    public void getNews(String userMail){
        scrollToElement(subscribeToNewsletter);
        clickSubscribeToNewsletter();
        sendKeysSubscribeToNewsletter(userMail);
        clickSubscribeButton();
    }
}
