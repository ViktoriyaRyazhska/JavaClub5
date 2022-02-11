package GreenCity.peges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TipsTricksPage extends TopPage {
    public TipsTricksPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

}
