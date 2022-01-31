package Lahuza;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.By.id;

public class ClickSingUp {
    public WebDriver webDriver;

    @Before
    public void open(){
        System.out.println("Open page");
        System.setProperty("webdriver.chrome.driver","src\\resources\\chromedriver.exe" );
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
        webDriver.findElement(By.cssSelector(".header_sign-up-btn")).click();

        System.out.println("Open dialogue window");
        WebDriverWait driverWait = new WebDriverWait(webDriver, 30);
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".header_sign-up-btn")));
    }

    @Test
    public void singUp() {
        System.out.println("Enter email");
        webDriver.findElement(id("email")).click();
        webDriver.findElement(id("email")).sendKeys("asenka88@gmail.com");

        System.out.println("Enter your name");
        webDriver.findElement(id("firstName")).click();
        webDriver.findElement(id("firstName")).sendKeys("Ann Lug");

        System.out.println("Enter password");
        webDriver.findElement(id("password")).click();
        webDriver.findElement(id("password")).sendKeys("123456");

        System.out.println("Show hide password");
        webDriver.findElement(By.className("image-show-hide-password")).click();

        System.out.println("Repeat password");
        webDriver.findElement(By.xpath("(//input[@id='password'])[2]")).click();
        webDriver.findElement(By.xpath("(//input[@id='password'])[2]")).sendKeys("123456");

        System.out.println("Show hide password");
        webDriver.findElement(By.className("image-show-hide-password")).click();

        System.out.println("Sing up");
        webDriver.findElement(By.cssSelector(".primary-global-button > span")).click();
    }
    @Test
    public void singUpMail() {
        System.out.println("Sing up by google account");
        webDriver.findElement(By.className("google-sign-in")).click();
    }

    @Test
    public void singUpLinkToIn() {
        System.out.printf("Return to sing in");
        webDriver.findElement(By.className("exist-sign-in")).click();
    }

    @Test
    public void singUpClose() {
        System.out.println("Close dialogue window");
        webDriver.findElement(By.className("close-modal-window")).click();
    }

    @After
      public void off(){
        System.out.println("Close window");
        if(webDriver!=null);
        webDriver.quit();
    }
}
