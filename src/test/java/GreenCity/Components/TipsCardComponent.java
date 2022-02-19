package GreenCity.Components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TipsCardComponent {

        private WebDriver driver;

        public TipsCardComponent(WebDriver driver){
            this.driver=driver;
            PageFactory.initElements(driver, this);
        }
}
