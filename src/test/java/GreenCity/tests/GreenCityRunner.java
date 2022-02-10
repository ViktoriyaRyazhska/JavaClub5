package GreenCity.tests;

<<<<<<< HEAD
import GreenCity.peges.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

=======

import GreenCity.peges.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
>>>>>>> 1aea14b246d06c034deb959cbe4790c29582498a
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.time.Duration;

public abstract class GreenCityRunner {
    protected static WebDriver driver;
    private final Long ONE_SECOND_DELAY = 1000L;
    

<<<<<<< HEAD
    @BeforeSuite
    public void BeforeSuite() {
        System.setProperty("webdriver.chrome.driver", "src\\resources\\chromedriver.exe");
    }

    /*
    @BeforeSuite
    public void beforeSuite (){
        WebDriverManager.chromedriver().setup();
    }

     */

=======
   //@Before
    //public void BeforeSuite() {
       // System.setProperty("webdriver.chrome.driver", "src\\resources\\chromedriver.exe");

   // }

      @BeforeSuite
         public void beforeSuite (){
             WebDriverManager.chromedriver().setup();
         }
>>>>>>> 1aea14b246d06c034deb959cbe4790c29582498a
    @BeforeClass
        public static void setUpBeforeClass() throws Exception{
        System.out.println("Open page");
        System.setProperty("webdriver.chrome.driver","src\\resources\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
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
            // driver.manage().window().maximize();
        }
        @AfterMethod
        public void tearDown(ITestResult result) throws Exception{
            System.out.println("AfterMethod");
            if(!result.isSuccess()){
                System.out.println("Test "+result.getName()+" Error");
            }
          //  driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
        }
        public HomePage LoadApplication(){
            System.out.println("LoadApplication");
        return new HomePage(driver);
            //return new HomePage(driver);
        }


        protected void PresentationSleep(){
            presentationSleep(1);
        }

    private void presentationSleep(int seconds) {
            try{
                Thread.sleep(seconds*ONE_SECOND_DELAY);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
    }



        /*driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");

        System.out.println("Open dialogue window");
        driver.findElement(By.className("header_sign-in-link")).click();

        System.out.println("Wait for dialogue window");
        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.className("cdk-overlay-container")));


         */



}
