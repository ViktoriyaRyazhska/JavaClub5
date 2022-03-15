package GreenCity.Components;

import GreenCity.PopUpMenu.guest.MainManuPopUp;
import GreenCity.PopUpMenu.guest.SingUpPopUp;
import GreenCity.peges.SingInPopUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopGuestComponent extends MainManuPopUp {

    @FindBy(className = "cdk-overlay-container")
    private WebElement singInLink;
    @FindBy(css = "div.header_sign-up-btn>span")
    private WebElement singUpLink;
    @FindBy(css = "li.header_mobile-menu-sign-up>div.header_sign-up-btn.secondary-global-button")
    private WebElement singUpLinkPopUp;

    public TopGuestComponent(WebDriver driver) {
        // this.driver=driver;
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // singInLink

    public WebElement getSingInLink() {
        return singInLink;
    }

    public String getSingInLinkText() {
        return getSingInLink().getText();
    }

    public void clickSingInLink() {
        getSingInLink().click();
    }

    // singUpLink

    public WebElement getSingUpLink() {
        return singUpLink;
    }

    public String getSingUpLinkText() {
        return getSingUpLink().getText();
    }

    public void clickSingUpLink() {
        getSingUpLink().click();
    }

    public boolean isDisplayedSingUp() {
        return getSingUpLink().isDisplayed();
    }

    // singUpLinkPopUp
    public WebElement getSingUpLinkPopUp() {
        return singUpLinkPopUp;
    }

    public String getSingUpLinkPopUpText() {
        return getSingUpLinkPopUp().getText();
    }

    public void clickSingUpLinkPopUp() {
        if (isDisplayedSingUpLinkPopUp()) {
            getSingUpLinkPopUp().click();
        }
    }

    public boolean isDisplayedSingUpLinkPopUp() {
        return getSingUpLinkPopUp().isDisplayed();
    }
}
