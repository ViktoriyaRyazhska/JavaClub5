package GreenCity.Components;

import GreenCity.PopUpMenu.guest.SingUpPopUp;
import GreenCity.peges.SingInPopUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopGuestComponent {
    private WebDriver driver;

    @FindBy(className="cdk-overlay-container")
    private WebElement singInLink;
    @FindBy(css=".header_sign-up-btn")
    private WebElement singUpLink;


    public TopGuestComponent (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    //singInLink

    public WebElement getSingInLink() {
        return singInLink;
    }

    public String getSingInLinkText() {
        return getSingInLink().getText();
    }

    public void clickSingInLink() {
        getSingInLink().click();
    }

    //singUpLink

    public WebElement getSingUpLink() {
        return singUpLink;
    }

    public String getSingUpLinkText() {
        return getSingUpLink().getText();
    }

    public void clickSingUpLink() {
        getSingUpLink().click();
    }

}
