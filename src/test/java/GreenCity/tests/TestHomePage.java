package GreenCity.tests;


import GreenCity.data.Languages;
import GreenCity.peges.HomePage;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestHomePage extends GreenCityRunner {
    @DataProvider
    public Object[][] validData() {
        return new Object[][]{
                {Languages.ENGLISH}
        };
    }

    @Test(dataProvider = "validData")
    public void Check(Languages languages) throws Exception {
        System.out.println("Check and set language");

        HomePage homePage = LoadApplication()
                .switchLanguage(languages);

        homePage = homePage
                .navigateMenuAboutUs()
                .navigateMenuEvents()
                .navigateMenuEcoNews()
                .navigateMenuTipsTricks()
                //.navigateMenuMySpace()
                //.navigateMenuUBSCourier()
                .navigateMenuHome();

        Assert.assertEquals(homePage.getLanguageButtonText(), Languages.ENGLISH.toString());
        PresentationSleep();

    }
}
