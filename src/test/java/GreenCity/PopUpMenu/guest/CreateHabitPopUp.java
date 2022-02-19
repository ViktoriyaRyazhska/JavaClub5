package GreenCity.PopUpMenu.guest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateHabitPopUp {
    private WebDriver driver;

    public CreateHabitPopUp(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
}
