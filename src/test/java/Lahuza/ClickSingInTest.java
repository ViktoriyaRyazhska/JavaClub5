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

import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.By.id;

public class ClickSingInTest {

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

        System.out.println("Open dialogue window");
        webDriver.findElement(By.className("header_sign-in-link")).click();

        System.out.println("Wait for dialogue window");
        WebDriverWait driverWait = new WebDriverWait(webDriver, 30);
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.className("cdk-overlay-container")));
    }

    @Test
    public void singIn() {
        System.out.println("Enter email");
        webDriver.findElement(id("email")).click();
        webDriver.findElement(id("email")).sendKeys("asenka88@gmail.com");

        System.out.println("Enter password");
        webDriver.findElement(id("password")).click();
        webDriver.findElement(id("password")).sendKeys("123456");

        System.out.println("Show hide password");
        webDriver.findElement(By.className("image-show-hide-password")).click();

        System.out.println("Sing in");
        webDriver.findElement(By.xpath ("//button[@type='submit']")).click();

       assertTrue( webDriver.findElement(By.cssSelector("form.sign-in-form .alert-general-error")).getText().contains("Неправильна пошта або пароль"));
    }

    @Test
    public void singInMail() {
        System.out.println("Enter by google account");
        webDriver.findElement(By.className("google-sign-in")).click();
    }

    @Test
    public void singInForgotPass() {
        System.out.println("Forgot password");
        webDriver.findElement(By.className("forgot-password")).click();

        System.out.println("Enter email");
        webDriver.findElement(id("email")).click();
        webDriver.findElement(id("email")).sendKeys("asenka88@gmail.com");

        System.out.println("Send login link");
        webDriver.findElement(By.cssSelector(".primary-global-button > span")).click();

        System.out.println("Enter by google account");
        webDriver.findElement(By.className("google-sign-in")).click();
    }
    @Test
    public void singInLinkToUp() {
        System.out.println("Return to sing up");
        webDriver.findElement(By.xpath("//a[contains(text(),'Зареєструватись')]")).click();
    }

    @Test
    public void singInClose() {
        System.out.println("Close dialogue window");
        webDriver.findElement(By.className("close-modal-window")).click();
    }

    @After
    public void off(){
        System.out.println("Close window");
        if(webDriver!=null) {
            webDriver.quit();
        }
    }
}
