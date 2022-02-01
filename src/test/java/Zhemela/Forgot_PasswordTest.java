package Zhemela;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Forgot_PasswordTest {
    private ChromeDriver driver;
    //private ChromeDriver driver2;

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
        driver.findElement(By.className("forgot-password")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("email")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("example@email.com");
        Thread.sleep(1000);
        System.out.println("1");
        driver.findElement(By.xpath("//span[contains(.,'Надіслати посилання для входу')]")).click();
        Thread.sleep(1000);
        System.out.println("2");
        WebElement alert=driver.findElement(By.cssSelector("div.validation-email-error.ng-star-inserted"));
        System.out.println("3");
        String expected="Посилання на відновлення пароля вже надіслано, перевірте свою електронну адресу : example@email.com";

        Assert.assertEquals(expected,alert.getText());

    }

    @Test
    public void find_Element_not_corect_put() throws InterruptedException {
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
        Thread.sleep(1000);
        driver.findElement(By.className("header_sign-in-link")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("forgot-password")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("email")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("ihuiuh");
        Thread.sleep(1000);
        System.out.println("1");
        driver.findElement(By.xpath("//span[contains(.,'Надіслати посилання для входу')]")).click();
        Thread.sleep(1000);
        System.out.println("2");
        WebElement alert=driver.findElement(By.cssSelector("div.validation-email-error.ng-star-inserted"));
        System.out.println("3");
        String expected="Перевірте, чи правильно вказано вашу адресу електронної пошти";

        Assert.assertEquals(expected,alert.getText());
    }

    @Test
    public void find_Element_Google_Sign_In() throws InterruptedException {
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
        Thread.sleep(1000);
        driver.findElement(By.className("header_sign-in-link")).click();
        Thread.sleep(1000);
        System.out.println("1");
        driver.findElement(By.className("forgot-password")).click();
        Thread.sleep(1000);
        System.out.println("2");
        driver.findElement(By.cssSelector("button.google-sign-in")).click();
        Thread.sleep(1000);
        System.out.println("3");
        WebElement alert=driver.findElement(By.tagName("body"));
        Thread.sleep(1000);
        System.out.println("4");
        Assert.assertFalse(alert.getText().equals("Вход – Google Аккаунты"));
    }

    @Test
    public void Back_to_The_Enter () throws InterruptedException {
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
        Thread.sleep(1000);
        driver.findElement(By.className("header_sign-in-link")).click();
        Thread.sleep(1000);
        System.out.println("1");
        driver.findElement(By.className("forgot-password")).click();
        Thread.sleep(1000);
        System.out.println("2");
        driver.findElement(By.cssSelector(".sign-in-link")).click();
        Thread.sleep(1000);
        System.out.println("3");
        WebElement alert=driver.findElement(By.className("header_sign-in-link"));
        Thread.sleep(1000);
        System.out.println("4");
        String title=driver.getTitle();
        Assert.assertFalse(alert.getText().equals("GreenCity"));
        Assert.assertEquals("GreenCity", title);
    }


    @After
    public void close() {
        System.out.println("Test close");
        driver.quit();

    }

}

