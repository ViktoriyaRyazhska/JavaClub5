package GreenCity.tests;

import GreenCity.peges.HomePage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.time.Duration;

// io.github.bonigarcia.wdm.WebDriverManager;

public abstract class GreenCityRunner {

    public final Logger logger = LoggerFactory.getLogger(this.getClass());
    protected static WebDriver driver;
    private final Long ONE_SECOND_DELAY = 1000L;

    @BeforeSuite
    public void BeforeSuite() {
        System.setProperty("webdriver.chrome.driver", "src\\resources\\chromedriver.exe");

    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Open page");
        System.setProperty("webdriver.chrome.driver", "src\\resources\\chromedriver_9804.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        if (driver != null) {
            driver.quit();
        }
    }

    @BeforeMethod
    public void setUp() throws Exception {
        System.out.println("BeforeMethod");
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
        // driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(480, 640));
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws Exception {
        System.out.println("AfterMethod");
        if (!result.isSuccess()) {
            logger.warn("Test " + result.getName() + " Error");
            // System.out.println("Test " + result.getName() + " Error");
        }
    }

    public HomePage LoadApplication() {
        System.out.println("LoadApplication");
        return new HomePage(driver);
        // return new HomePage(driver);
    }

    protected void PresentationSleep() {
        presentationSleep(1);
    }

    private void presentationSleep(int seconds) {
        try {
            Thread.sleep(seconds * ONE_SECOND_DELAY);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
