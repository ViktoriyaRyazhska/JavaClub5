package GreenCity.peges;

import GreenCity.PopUpMenu.guest.MainManuPopUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyhabitsPage extends  TopPage {
     private MainManuPopUp mainManuPopUp;

    public  MyhabitsPage(WebDriver driver) {
        super(driver);
        //This initElements method will create all WebElements
        initElements();
        PageFactory.initElements(driver, this);
        mainManuPopUp =new MainManuPopUp(driver);
    }

    private void initElements() {
    }
}
