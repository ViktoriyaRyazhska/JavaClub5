package GreenCity.peges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UBSCourierPage extends TopPage{
    public UBSCourierPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public UBSCourierPage navigateGreenCity() {
        getUBSCourierPopUp().clickGreenCityPage();
        return new UBSCourierPage(driver);
    }
}
