package GreenCity.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BeforeAndAfter {
    public WebDriver driver;
    @Before
    public void open(){
        System.out.println("Open page");
        System.setProperty("webdriver.chrome.driver", "src\\resources\\chromedriver.exe" );
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        // webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");

        System.out.println("Open dialogue window");
        driver.findElement(By.className("header_sign-in-link")).click();

        System.out.println("Wait for dialogue window");
        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.className("cdk-overlay-container")));

        @After
        public void off(){
            System.out.println("Close window");
            if(driver!=null) {
                driver.quit();
            }
        }

    }
}
