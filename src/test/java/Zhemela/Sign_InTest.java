package Zhemela;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Sign_InTest {
    private ChromeDriver driver;

    @Before
    public  void SetUp(){
        System.setProperty("webdriver.chrome.driver","D:\\Java clab\\Test Automotion\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Start");
    }
    @Test
    public void first() {
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
        String title=driver.getTitle();
        Assert.assertEquals("GreenCity", title);

    }
    @Test
    public void find_Element() throws InterruptedException {
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
        Thread.sleep(1000);
        driver.findElement(By.className("header_sign-in-link")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("example@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("password")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("dfsdf");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement alert=driver.findElement(By.cssSelector("div.alert-general-error.ng-star-inserted"));
        String expected="Неправильна пошта або пароль";
        Assert.assertEquals(expected,alert.getText());

    }
    @Test
    public void find_Element_Google_Sign_In() throws InterruptedException {
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
        Thread.sleep(1000);
        driver.findElement(By.className("header_sign-in-link")).click();
        Thread.sleep(1000);
        System.out.println("1");
        driver.findElement(By.cssSelector("button.google-sign-in")).click();
        Thread.sleep(1000);
        System.out.println("2");
        WebElement alert = driver.findElement(By.tagName("body"));
        Thread.sleep(1000);
        System.out.println("3");
        Assert.assertFalse(alert.getText().equals("Вход – Google Аккаунты"));
    }

    @Test
    public void Forgot_PaswordTest() throws InterruptedException {
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
        Thread.sleep(1000);
        driver.findElement(By.className("header_sign-in-link")).click();
        Thread.sleep(1000);
        System.out.println("1");
        driver.findElement(By.className("forgot-password")).click();
        Thread.sleep(1000);
        System.out.println("2");
        WebElement alert=driver.findElement(By.tagName("body"));
        Thread.sleep(1000);
        System.out.println("3");
        Assert.assertFalse(alert.getText().equals("GreenCity"));
    }

    @Test
    public void registerTest() throws InterruptedException {
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
        Thread.sleep(1000);
        driver.findElement(By.className("header_sign-in-link")).click();
        Thread.sleep(1000);
        System.out.println("1");
        driver.findElement(By.className("sign-up-link")).click();
        Thread.sleep(1000);
        System.out.println("2");
        WebElement alert = driver.findElement(By.tagName("body"));
        Thread.sleep(1000);
        System.out.println("3");
        Assert.assertFalse(alert.getText().equals("GreenCityClient"));


    }
    @After
    public void close() {
        System.out.println("Test close");
        driver.quit();

    }

}

