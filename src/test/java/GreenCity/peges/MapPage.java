package GreenCity.peges;

import GreenCity.PopUpMenu.guest.TopPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MapPage extends TopPage {
    public MapPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
