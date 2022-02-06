package GreenCity.peges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends TopPage {
    public RegisterPage(WebDriver driver) {
        super(driver, singUpLink, singInLink, languageSwitcher);
        PageFactory.initElements(driver, this);
    }
}
