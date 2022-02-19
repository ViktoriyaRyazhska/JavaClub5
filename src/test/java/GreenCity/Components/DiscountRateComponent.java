package GreenCity.Components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DiscountRateComponent {
    private WebDriver driver;

    public DiscountRateComponent(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
}
