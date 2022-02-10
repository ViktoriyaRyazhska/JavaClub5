package GreenCity.peges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MySpacePage extends TopPage{
    public MySpacePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
