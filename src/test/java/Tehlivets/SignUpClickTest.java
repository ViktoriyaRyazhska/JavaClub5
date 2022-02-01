package test.java.Tehlivets;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SignUpClickTest {
    public WebDriver driver;

    @Before
    public void openWindow() {

        System.setProperty("webdriver.chrome.driver",
                "./lib/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");

        driver.findElement(By.cssSelector(".header_sign-up-btn")).click();

        WebDriverWait driverWait = new WebDriverWait(driver, 30);
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.className("cdk-overlay-container")));
    }

    @Test
    public void signUp() {
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("tehlivetsolesia@gmail.com");
        //
        driver.findElement(By.id("firstName")).click();
        driver.findElement(By.id("firstName")).clear();
        driver.findElement(By.id("firstName")).sendKeys("Olesia");
        //
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("aaaaaa");
        //
        driver.findElement(By.xpath("(//input[@id='password'])[2]")).click();
        driver.findElement(By.xpath("(//input[@id='password'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@id='password'])[2]")).sendKeys("aaaaaa");
        //
        driver.findElement(By.cssSelector(".primary-global-button > span")).click();
        //
        driver.findElement(By.className("google-sign-in")).click();
    }

    @Test
    public void singUpLinkToIn() {
        driver.findElement(By.className("exist-sign-in")).click();
    }

    @Test
    public void singUpClose() {
        driver.findElement(By.className("close-modal-window")).click();
    }

    @After
    public void close() {
        if (this.driver != null)
            driver.quit();
    }
}