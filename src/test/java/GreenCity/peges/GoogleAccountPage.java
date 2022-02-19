package GreenCity.peges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleAccountPage {
    private WebDriver driver;

    public GoogleAccountPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
}
