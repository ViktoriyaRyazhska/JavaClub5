package GreenCity.peges;

import GreenCity.data.Languages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EcoNewsPage extends TopPage {
    public EcoNewsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


     //Business Logic
    public EcoNewsPage switchLanguage(Languages languages){
       // chooseLanguage(languages);
        return new EcoNewsPage(driver);
    }
}
