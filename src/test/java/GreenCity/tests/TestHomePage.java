package GreenCity.tests;


import GreenCity.data.Languages;
import GreenCity.peges.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.DataProvider;

import java.util.List;

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
        .switchLanguage(Languages.RUSSIAN);

        Assert.assertEquals(homePage.getLanguageButtonText(), Languages.RUSSIAN.toString());
        PresentationSleep();
    }

}
