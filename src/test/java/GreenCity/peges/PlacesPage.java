package GreenCity.peges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PlacesPage extends TopPage{
    public PlacesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


}
