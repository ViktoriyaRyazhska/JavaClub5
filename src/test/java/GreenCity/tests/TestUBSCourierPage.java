package GreenCity.tests;

import GreenCity.Components.TopGuestComponent;
import GreenCity.data.RegistrationData;
import GreenCity.peges.AboutUsPage;
import GreenCity.peges.UBSCourierPage;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class TestUBSCourierPage extends GreenCityRunner{

    @Test(priority = 1)
    public void CollUpCourier() throws InterruptedException {
        UBSCourierPage ubsCourier2 = new UBSCourierPage(driver);
        try {
            ubsCourier2
                    .navigateMenuUBSCourier()
                    .clickColl1();
            driver.findElement(By.cssSelector(".cross-btn")).click();
            Thread.sleep(1000);
            if(ubsCourier2.isDisplayedCloseLoginButton()){
                System.out.println("Login window couldn't be shut down");
            }
            else{ubsCourier2.clickColl2();}
        }catch (ElementClickInterceptedException e){
            System.out.println("Element not available");}
    }

    @Test(priority = 2)
    public void CollUpCourier2() throws InterruptedException {
        UBSCourierPage ubsCourier3 = new UBSCourierPage(driver);
        try{
            ubsCourier3
                    .navigateMenuUBSCourier()
                    .clickColl2();
            driver.findElement(By.cssSelector(".cross-btn")).click();
            Thread.sleep(1000);
            if(ubsCourier3.isDisplayedCloseLoginButton()){
                System.out.println("Login window couldn't be shut down");
            }
        }catch (ElementClickInterceptedException e){
            System.out.println("Element not available");
        }
    }

    @Test(priority = 3)
    public void LinkFromPageUBSCourierFooter() throws InterruptedException{
        UBSCourierPage ubsCourier = new UBSCourierPage(driver);
        try {
        ubsCourier
                .navigateMenuUBSCourier()
                .gotoLinkPages();
        }catch (ElementClickInterceptedException e){
            System.out.println("Element not available");}

    }

    @Test(priority = 4)
    public void getNewsFooter() {
        UBSCourierPage ubsCourier3 = new UBSCourierPage(driver);
        RegistrationData registrationData = new RegistrationData();
        try {
            ubsCourier3
                    .navigateMenuUBSCourier()
                    .getNews(registrationData.getEmail());

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
            System.out.println("Button Subscribe Button does not work");

        } catch (ElementClickInterceptedException | InterruptedException e) {
            System.out.println("Element not available");
        }
    }
    @Test(priority = 6)
    public void LinkToSocialNetworks() throws InterruptedException{
        UBSCourierPage ubsCourier = new UBSCourierPage(driver);
        try {
            ubsCourier
                    .navigateMenuUBSCourier()
                    .gotoSocialNetworks();
        }catch (ElementClickInterceptedException e){
            System.out.println("Element not available");}

    }

}
