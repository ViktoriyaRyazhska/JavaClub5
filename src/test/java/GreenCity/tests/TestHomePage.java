package GreenCity.tests;


import GreenCity.data.Languages;
import GreenCity.peges.HomePage;
//import org.junit.Assert;
import org.testng.Assert;
//import org.junit.Test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestHomePage extends GreenCityRunner {
    @DataProvider
    public Object [][] validDataProvider() {
        return new Object[][]{

        };
    }

    @Test
    public void Check() throws Exception{
        System.out.println("Check and set language");

        HomePage homePage = LoadApplication()
        .switchLanguage(Languages.UKRAINIAN);
        System.out.println("assert");
        homePage = homePage
                .navigateHomePage()
                .navigateAboutPage()
                .navigateEcoNewsPage()
                .navigateTipsTricksPage()
                .navigateMySpacePage();

        Assert.assertEquals(homePage.getLanguageButtonText(), Languages.UKRAINIAN.toString());
        PresentationSleep();
    }

}
