package GreenCity.tests;


import GreenCity.data.Languages;
import GreenCity.peges.AboutUsPage;
import GreenCity.peges.HomePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestAboutUsPage extends GreenCityRunner {

    @Test
    public void CheckAboutUsPage () throws InterruptedException {
        AboutUsPage aboutUs = new AboutUsPage(driver);
        aboutUs = aboutUs
                .navigateMenuAboutUs();
        aboutUs.clickFromHabit();
        aboutUs.goToPlacesPage();
        aboutUs.backFromPlace();
        aboutUs.goToTipsTricks();
        aboutUs.backFromTipsTricks();

    }

}
