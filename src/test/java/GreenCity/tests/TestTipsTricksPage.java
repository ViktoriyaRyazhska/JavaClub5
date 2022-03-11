package GreenCity.tests;


import GreenCity.data.Languages;
import GreenCity.peges.HomePage;
import GreenCity.peges.TipsTricksPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestTipsTricksPage extends GreenCityRunner {

    @Test
    public void CheckTipsTricksPage () throws InterruptedException {
        TipsTricksPage TipsTricks = new TipsTricksPage(driver);
        TipsTricks = TipsTricks
                .navigateMenuTipsTricks();
        TipsTricks.clickFindTipsTricks();
        TipsTricks.backFromTipsTricks();

    }

}
