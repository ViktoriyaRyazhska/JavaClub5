package GreenCity.Components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ItemComponent {
    private WebDriver driver;

    public ItemComponent(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
}
