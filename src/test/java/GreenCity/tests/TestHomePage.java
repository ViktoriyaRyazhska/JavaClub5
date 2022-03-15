package GreenCity.tests;

import GreenCity.data.Languages;
import GreenCity.peges.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestHomePage extends GreenCityRunner {
    @DataProvider
    public Object[][] validData() {
        return new Object[][] {
                { Languages.ENGLISH }
        };
    }

    @Test(dataProvider = "validData")
    public void Check(Languages languages) throws Exception {
        System.out.println("Check and set language");

        HomePage homePage = LoadApplication()
                .switchLanguage(languages);

        homePage = homePage
                .navigateMenuEcoNews()
                .navigateMenuTipsTricks()
                .navigateMenuEvents()
                .navigateMenuPlaces()
                .navigateMenuAboutUs()
                .navigateMenuMySpace()
                .navigateMenuUBSCourier()
                .navigateSingInDropdown()
                .navigateMenuHome();

        Assert.assertEquals(homePage.getLanguageButtonText(), Languages.ENGLISH.toString());
        PresentationSleep();

    }

    @Test(dataProvider = "validData")
    public void CheckElementsFooter(Languages languages) throws Exception {
        HomePage homePage1 = LoadApplication();
        // EcoNewsPage
        // homePage2=loadApplicationHomePage().ScrollDown2().navigateMenuEcoNewsFooter();
        PresentationSleep();
        homePage1 = homePage1
                .navigateMenuEcoNews()
                .navigateMenuEcoNewsFooter()
                .navigateMenuTripandTricksFooter()
                .navigateMenuMySpace()
                .navigateMenuEventsFooter()
                .navigateMenuPlacesFooter()
                .navigateMenuAboutUsFooter()
                .navigateMyhabitsPageFooter()
                .navigateMenuHomeFooter();

        PresentationSleep();

    }

    @Test(dataProvider = "validData")
    public void CheckElementsEnterSingIn(Languages languages) throws Exception {
        HomePage homePage1 = LoadApplication();
        PresentationSleep();
        homePage1 = homePage1
                .navigateMenuEcoNews()
                .navigateSingInDropdownEnter()
                .navigateMenuEcoNews()
                // .navigateMenuTipsTricks()
                // .navigateMenuEvents()
                // .navigateMenuMySpace()
                // .navigateMenuAboutUs()
                // .navigateMenuMySpace()
                // .navigateMenuEcoNewsFooter()
                // .navigateMenuTripandTricksFooter()
                // .navigateMenuPlacesFooter()
                // .navigateMenuAboutUsFooter()
                // .navigateMyhabitsPageFooter()
                .navigateSingOut()
                .navigateMenuHome();
        PresentationSleep();

    }

    @Test(dataProvider = "validData")
    public void CheckElementsEnterRightSingIn(Languages languages) throws Exception {
        HomePage homePage3 = LoadApplication();
        PresentationSleep();
        homePage3 = homePage3
                .navigateMenuEcoNews()
                .navigateSingInRightEnter()
                .navigateMenuEcoNews()
                // .navigateMenuTipsTricks()
                // .navigateMenuEvents()
                // .navigateMenuMySpace()
                // .navigateMenuAboutUs()
                // .navigateMenuMySpace()
                // .navigateMenuEcoNewsFooter()
                // .navigateMenuTripandTricksFooter()
                // .navigateMenuPlacesFooter()
                // .navigateMenuAboutUsFooter()
                // .navigateMyhabitsPageFooter()
                .navigateSingOut()
                .navigateMenuHome();
        PresentationSleep();

    }

}
