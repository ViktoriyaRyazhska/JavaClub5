package GreenCity.PopUpMenu.guest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePopUp {

    private WebDriver driver;
    @FindBy()
    private WebElement settings;
    @FindBy()
    private WebElement singOut;
    @FindBy()
    private WebElement UBSCUser;

    public ProfilePopUp(WebDriver driver) {
       this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
