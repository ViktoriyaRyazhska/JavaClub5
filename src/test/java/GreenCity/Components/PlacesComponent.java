package GreenCity.Components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PlacesComponent {
    private WebDriver driver;

    public PlacesComponent(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

}
