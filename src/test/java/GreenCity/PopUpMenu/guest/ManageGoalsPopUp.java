package GreenCity.PopUpMenu.guest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ManageGoalsPopUp {
    private WebDriver driver;

    public ManageGoalsPopUp(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
