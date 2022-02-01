package Zhemela;



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Sign_UpTest {
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
    public void firstNameTest() throws InterruptedException {
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
        Thread.sleep(1000);
        driver.findElement(By.className("header_sign-in-link")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("sign-up-link")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("example@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("firstName")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("firstName")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("firstName")).sendKeys("dfs");
        Thread.sleep(1000);


        WebElement alert = driver.findElement(By.id("firstname-err-msg"));
        String expected = "Ім'я повинно містити 6-30 символів і може складатись" +
                " з літер(a-z), цифр(0-9) та крапки(.), крапка на початку імені, в кінці " +
                "та послідовність крапок заборонена";
        Assert.assertEquals(expected, alert.getText());
    }
    @Test
    public void Password_1_Test() throws InterruptedException {
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
        Thread.sleep(1000);
        driver.findElement(By.className("header_sign-in-link")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("sign-up-link")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("example@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("12");
        Thread.sleep(1000);
        WebElement alert = driver.findElement(By.id("pass-err-msg"));
        String expected = "Пароль повинен містити принаймі 8 символів";
        Assert.assertEquals(expected, alert.getText());
    }
    @Test
    public void Password_2_Test() throws InterruptedException {
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
        Thread.sleep(500);
        driver.findElement(By.className("header_sign-in-link")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("sign-up-link")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("example@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("123456789");
        Thread.sleep(1000);
        WebElement alert = driver.findElement(By.id("pass-err-msg"));
        String expected = "Пароль має містити хоча б один символ латинського" +
                " алфавіту верхнього (A-Z) та нижнього регістру (a-z), " +
                "число (0-9) та спеціальний символ (~`!@#$%^&*()+=_-{}[]|:;”’?/<>,.)";
        Assert.assertEquals(expected, alert.getText());
    }
    @Test
    public void Password_3_Test() throws InterruptedException {
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
        Thread.sleep(500);
        driver.findElement(By.className("header_sign-in-link")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("sign-up-link")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("example@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("Student!123456789");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='password'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='password'])[2]")).sendKeys("123456");
        Thread.sleep(1000);
        WebElement alert = driver.findElement(By.id("pass-err-msg"));
        String expected = "Пароль не співпадає";
        Assert.assertEquals(expected, alert.getText());
    }
    @Test
    public void Password_4_Test() throws InterruptedException {
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
        Thread.sleep(1000);
        driver.findElement(By.className("header_sign-in-link")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("sign-up-link")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("example@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("firstName")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("firstName")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("firstName")).sendKeys("Volodja");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("Student!123456789");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='password'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='password'])[2]")).sendKeys("Student!123456789");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".primary-global-button > span")).click();

    }

    @Test
    public void singUpLinkToStart() throws InterruptedException {
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
        Thread.sleep(1000);
        driver.findElement(By.className("header_sign-in-link")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("sign-up-link")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("exist-sign-in")).click();
        Thread.sleep(1000);
    }

    @After
    public void close() {
        System.out.println("Test close");
        driver.quit();

    }}

