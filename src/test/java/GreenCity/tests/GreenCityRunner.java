package GreenCity.tests;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class GreenCityRunner {
    protected static WebDriver driver;

    @Before
    public void BeforeSuite() {
        System.setProperty("webdriver.chrome.driver", "src\\resources\\chromedriver.exe");

    }
    @BeforeClass
        public static void setUpBeforeClass() throws Exception{
        System.out.println("Open page");
        System.setProperty("webdriver.chrome.driver","src\\resources\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");

       // System.out.println("Open dialogue window");
       // driver.findElement(By.className("header_sign-in-link")).click();

       // System.out.println("Wait for dialogue window");
       // WebDriverWait driverWait = new WebDriverWait(driver, 30);
      //g  driverWait.until(ExpectedConditions.presenceOfElementLocated(By.className("cdk-overlay-container")));
        }

        @AfterClass
        public static void tearDownAfterClass(){
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
          //  driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
        }




        /*driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");

        System.out.println("Open dialogue window");
        driver.findElement(By.className("header_sign-in-link")).click();

        System.out.println("Wait for dialogue window");
        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.className("cdk-overlay-container")));


         */



}
