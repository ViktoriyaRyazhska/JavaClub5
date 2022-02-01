package Tehlivets;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SignInClickTest {

    public WebDriver driver;

    @Before
    public void openWindow() {

        System.setProperty("webdriver.chrome.driver",
                "./lib/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");

        driver.findElement(By.linkText("Увійти")).click();

        WebDriverWait driverWait = new WebDriverWait(driver, 30);
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.className("cdk-overlay-container")));
    }

    @Test
    public void signIn() {
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("tehlivetsolesia@gmail.com");
        //
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("aaaaaaa");
        //
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //
        driver.findElement(By.className("google-sign-in")).click();

    }

    @Test
    public void forgottenPassword() {

        driver.findElement(By.linkText("Забули пароль?")).click();
        //
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("tehlivetsolesia@gmail.com");
        //
        driver.findElement(By.xpath("//span[contains(.,'Надіслати посилання для входу')]")).click();

    }

    @Test
    public void singInClose() {
        driver.findElement(By.className("close-modal-window")).click();
    }

    @After
    public void close() {
        if (this.driver != null)
            driver.quit();
    }
}