package GreenCity.tests;

import GreenCity.data.Languages;
import GreenCity.peges.HomePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestEcoNewsPage  extends GreenCityRunner {
    @DataProvider
    public Object[][] validData() {
        return new Object[][]{
                {Languages.ENGLISH}
        };
    }
    @Test(dataProvider = "validData")
    public void Check(Languages languages) throws Exception {
        System.out.println("Check and set language");

       HomePage homePage = LoadApplication();


      homePage=homePage
              .navigateMenuEcoNews()
              .navigateMenuEcoNewsfilter()
              .navigateSingInDropdownEnter()
              .navigateMenuEcoNews()
              .navigateMenuEcoNewsfilter()
              .navigateSingOut()
              .navigateMenuHome();


        PresentationSleep();


}}
