package GreenCity.peges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TipsAndTricksPage extends TopPage {
    public TipsAndTricksPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

}
