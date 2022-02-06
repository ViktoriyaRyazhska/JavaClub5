package GreenCity.tests;


import GreenCity.peges.HomePage;
import org.junit.Test;
import org.testng.annotations.DataProvider;

public class TestHomePage extends GreenCityRunner {
    @DataProvider
    public Object [][] validDataProvider() {
        return new Object[][]{

        };
    }

    @Test
    public void Check() throws Exception{
        System.out.println("");
        HomePage homePage = new HomePage(driver);
        Thread.sleep(1000);
    }


}
