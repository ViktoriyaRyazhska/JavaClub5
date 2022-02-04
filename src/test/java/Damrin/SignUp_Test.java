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

public class SignUp_Test {
    public WebDriver driver;

    @Before
            public void openWindow(){
        System.out.println("Opening page");
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
        driver.findElement(By.cssSelector(".header_sign-up-btn")).click();
        System.out.println("Open dialogue window");
        WebDriverWait driverWait = new WebDriverWait(driver, 30);
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".header_sign-up-btn")));
    }

    @Test
    public void signUp(){
        System.out.println("Please Enter e-mail");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("yevhendamrin@gmail.com");
        System.out.println("Please Enter name");
        driver.findElement(By.id("firstName")).click();
        driver.findElement(By.id("firstName")).sendKeys("Yevhen");
        System.out.println("Please Enter password");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("qwerty123");
        System.out.println("Repeat password");
        driver.findElement(By.xpath("(//input[@id='password'])[2]")).click();
        driver.findElement(By.xpath("(//input[@id='password'])[2]")).sendKeys("qwerty123");
        //
        driver.findElement(By.cssSelector(".primary-global-button > span")).click();
    }
    @Test
    public void signUpGoogle(){
        System.out.println("Sing up by google account");
        driver.findElement(By.className("google-sign-in")).click();
    }
    @Test
    public void signUpLinkToIn() {
        System.out.println("Return to singn in");
        driver.findElement(By.className("exist-sign-in")).click();
    }
    @Test
    public void signUpClose() {
        System.out.println("Close dialogue window");
        driver.findElement(By.className("close-modal-window")).click();
    }
    @After
    public void Close(){
        System.out.println("Close window");
        if(driver!=null) {
            driver.quit();
        }
    }
}
