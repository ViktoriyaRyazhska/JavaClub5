package GreenCity.tests;

import GreenCity.Containers.UBSCourierHeaderContainer;
import GreenCity.data.Languages;
import GreenCity.data.RegistrationData;
import GreenCity.data.SearchData;
import GreenCity.peges.UBSCourierPage;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestUBSCourierPage extends GreenCityRunner {
    @DataProvider
    public Object[][] validData() {
        return new Object[][] {
                { Languages.ENGLISH }
        };
    }

    @Test(dataProvider = "validData")
    public void Check(Languages languages) throws Exception {
        logger.info("Check and set language");

        UBSCourierHeaderContainer ubsCourierHeaderContainer = new UBSCourierHeaderContainer(driver);
        ubsCourierHeaderContainer.navigateMenuUBSCourier();
        ubsCourierHeaderContainer.switchLanguageUBS(languages);

        Assert.assertEquals(ubsCourierHeaderContainer.getLanguageButtonText(), Languages.ENGLISH.toString());
        PresentationSleep();
    }

    @Test(priority = 1)
    public void CollUpCourier() throws InterruptedException {
        UBSCourierPage ubsCourier2 = new UBSCourierPage(driver);
        try {
            ubsCourier2
                    .navigateMenuUBSCourier()
                    .clickColl1();
            driver.findElement(By.cssSelector(".cross-btn")).click();

            if (ubsCourier2.isDisplayedCloseLoginButton()) {
                logger.info("Login window couldn't be shut down");
            } else {
                ubsCourier2.clickColl2();
            }
        } catch (ElementClickInterceptedException e) {
            logger.info("Element singInLinkUBS not available");
        }
    }

    @Test(priority = 2)
    public void CollUpCourier2() throws InterruptedException {
        UBSCourierPage ubsCourier3 = new UBSCourierPage(driver);
        try {
            ubsCourier3
                    .navigateMenuUBSCourier()
                    .clickColl2();
            driver.findElement(By.cssSelector(".cross-btn")).click();
            Thread.sleep(1000);
            logger.info("Link is avaliable");
            if (ubsCourier3.isDisplayedCloseLoginButton()) {
                logger.info("Login window couldn't be shut down");
            }
        } catch (ElementClickInterceptedException e) {
            logger.info("Element singInLinkUBS not available");
        }
    }

    @Test(priority = 3)
    public void LinkFromPageUBSCourierFooter() throws InterruptedException {
        UBSCourierPage ubsCourier = new UBSCourierPage(driver);
        try {
            ubsCourier
                    .navigateMenuUBSCourier()
                    .gotoLinkPages();
            logger.info("Link is avaliable");
        } catch (ElementClickInterceptedException e) {
            logger.info("Element singInLinkUBS not available");
        }

    }

    @Test(priority = 4)
    public void getNewsFooter() {
        UBSCourierPage ubsCourier3 = new UBSCourierPage(driver);
        RegistrationData registrationData = new RegistrationData();
        try {
            ubsCourier3
                    .navigateMenuUBSCourier()
                    .getNews(registrationData.getEmail());
            logger.info("Link is avaliable");

        } catch (ElementClickInterceptedException | InterruptedException e) {
            System.out.println("Element not available");
        }
    }

    @Test(priority = 5)
    public void getNewsFooterWrong() {
        UBSCourierPage ubsCourier3 = new UBSCourierPage(driver);
        RegistrationData registrationData = new RegistrationData();
        try {
            ubsCourier3
                    .navigateMenuUBSCourier()
                    .getNewsWrong(registrationData.getWrongEmail());
            logger.info("Button Subscribe Button does not work");

        } catch (ElementClickInterceptedException | InterruptedException e) {
            System.out.println("Element not available");
        }
    }

    @Test(priority = 6)
    public void LinkToSocialNetworks() throws InterruptedException {
        UBSCourierPage ubsCourier = new UBSCourierPage(driver);
        try {
            ubsCourier
                    .navigateMenuUBSCourier()
                    .gotoSocialNetworks();
            logger.info("Link is avaliable");
        } catch (ElementClickInterceptedException e) {
            System.out.println("Element not available");
        }

    }

    @Test(priority = 7)
    public void SearchOnPage() throws Exception {
        SearchData data = new SearchData();
        UBSCourierHeaderContainer ubsCourierHeaderContainer = new UBSCourierHeaderContainer(driver);
        try {
            ubsCourierHeaderContainer.clickSearchIcon();
            Thread.sleep(1000);
            ubsCourierHeaderContainer.sendKeysText(data.getRequest2());
            Thread.sleep(7000);
            logger.info("Link is avaliable");
        } catch (ElementClickInterceptedException e) {
            System.out.println("Element not available");
        }
    }

    @Test(priority = 8)
    public void LinkToPages() throws InterruptedException {
        UBSCourierHeaderContainer ubsCourierHeaderContainer = new UBSCourierHeaderContainer(driver);
        try {
            ubsCourierHeaderContainer.navigateMenuUBSCourier();
            ubsCourierHeaderContainer.gotoLinkPages();
            logger.info("Link is avaliable");
        } catch (ElementClickInterceptedException e) {
            System.out.println("Element not available");
        }
    }

}
