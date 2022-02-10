package GreenCity.peges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EventsPage extends TopPage{
    public EventsPage(WebDriver driver) {
            super(driver);
            PageFactory.initElements(driver, this);
    }
}
