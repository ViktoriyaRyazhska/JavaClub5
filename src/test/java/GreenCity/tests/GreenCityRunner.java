package GreenCity.tests;

import io.netty.channel.DelegatingChannelPromiseNotifier;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class GreenCityRunner {
    protected WebDriver driver;
    @Before
    public void BeforeSuite() {
        System.setProperty("webdriver.chrome.driver", "src\\resources\\chromedriver.exe");
    }
    @BeforeClass
        public void BeforeClass() throws Exception{
        //System.out.println("Open page");
        System.out.println("BeforeClass");
        driver = new ChromeDriver();
        // webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        @AfterClass(alwaysRun = true)
        public void tearDownAfterClass() throws Exception {
            if (driver != null) {
                driver.quit();
            }
        }
        @BeforeMethod
        public void setUp() throws Exception{
            System.out.println("BeforeMethod");
            driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
            driver.manage().window().maximize();
        }
        @AfterMethod
        public void tearDown(ITestResult result) throws Exception{
            System.out.println("AfterMethod");
            if(!result.isSuccess()){
                System.out.println("Test "+result.getName()+" Error");
            }
            driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
        }




        /*driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");

        System.out.println("Open dialogue window");
        driver.findElement(By.className("header_sign-in-link")).click();

        System.out.println("Wait for dialogue window");
        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.className("cdk-overlay-container")));


         */



}
