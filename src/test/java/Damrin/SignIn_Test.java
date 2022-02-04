package test.java.Damrin;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignIn_Test {
    public WebDriver driver;

    @Before
    public void OpenWindow(){
        System.out.println("Open Page");
        System.setProperty("webdriver.chrome.driver",
                "D:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
        WebDriverWait driverWait = new WebDriverWait(driver, 30);
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.className("cdk-overlay-container")));
    }

    @Test
    public void SignIn() {
        System.out.println("Please Enter e-mail");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("yevhendamrin@gmail.com");
        //
        System.out.println("Please Enter password");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("qwerty123");
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
        driver.findElement(By.id("email")).sendKeys("yevhendamrin@gmail.com");
        //
        driver.findElement(By.xpath("//span[contains(.,'Надіслати посилання для входу')]")).click();

    }
    @Test
    public void singInClose() {
        System.out.println("Close dialogue window");
        driver.findElement(By.className("close-modal-window")).click();}

        @After
        public void close() {
            if (this.driver != null)
                driver.quit();
    }
}
