package GreenCity.Components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TopUserComponent {
    private WebDriver driver;

    public TopUserComponent(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

}
