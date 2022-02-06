package GreenCity.peges;

import GreenCity.data.Languages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TopPage {


    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //Functional
    public HomePage switchLanguage(Languages languages){
        chooseLanguage(languages);
        return new HomePage(driver);
    }
}
