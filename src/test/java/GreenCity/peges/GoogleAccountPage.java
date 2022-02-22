package GreenCity.peges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleAccountPage {
    private WebDriver driver;

    @FindBy(xpath = "//mat-dialog-container[@id='mat-dialog-0']/app-auth-modal/div/div/div[2]/div/app-sign-up/form/app-google-btn/button/span")
    protected WebElement singInGoogle;
    @FindBy(className="VfPpkd-vQzf8d")
    protected WebElement furtherBotton;


    public GoogleAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getSingInGoogle() {
        return singInGoogle;
    }

    public void clickSingInGoogle() {
        getSingInGoogle().click();
    }

    public WebElement getFurtherBotton() {
        return furtherBotton;
    }

    public void clickFurtherBotton() {getFurtherBotton().click();}
}

