package GreenCity.peges;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AboutUsPage extends TopPage {
    public AboutUsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
    /*
    private void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", getCopyright());
    }

    //Business logic
    @Override
    public HomePage navigateMenuHome() {
        scrollDown();
        return super.navigateMenuHome();
    }

    public EcoNewsPage navigateMenuEcoNews() {
        scrollDown();
        return super.navigateMenuEcoNews();
    }
    @Override
    public TipsTricksPage navigateMenuTipsTricks() {
        scrollDown();
        return super.navigateMenuTipsTricks();
    }
    public EventsPage navigateMenuEvents() {
        scrollDown();
        return super.navigateMenuEvents();
    }

    public PlacesPage navigateMenuPlaces() {
        scrollDown();
        return super.navigateMenuPlaces();
    }

    public AboutUsPage navigateMenuAboutUs() {
        scrollDown();
        return super.navigateMenuAboutUs();
    }

    public MySpacePage navigateMenuMySpace() {
        scrollDown();
        return super.navigateMenuMySpace();
    }

    public UBSCourierPage navigateMenuUBSCourier() {
        scrollDown();
        return super.navigateMenuUBSCourier();
    }
   // public UBSCourierPage navigateGreenCity() {
   //     scrollDown();
    //    return super.navigateGreenCity();
    //}
}

     */
