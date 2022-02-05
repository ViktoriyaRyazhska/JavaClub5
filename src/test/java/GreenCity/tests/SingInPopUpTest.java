package GreenCity.tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import GreenCity.PopUpMenu.guest.SingInPopUp;

import static org.junit.Assert.assertTrue;

public class SingInPopUpTest extends BeforeAndAfter{

       SingInPopUp objLogin;
    // WebDriver driver must be in TopPage
       public WebDriver driver;

//We need to do new class Before in TopPage

   /* @Before
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

    */



    @Test
    public void singIn() {
        //New Object
        objLogin = new SingInPopUp(driver);
        System.out.println("Enter your mail and password");
        //login to application
        objLogin.loginToGuest("asenka88@gmail.com", "123456");
        objLogin.clickLogin();
       //додати помилку при майл
        assertTrue(objLogin.getLoginText().contains("Неправильна пошта або пароль"));
    }

    @Test
    public void singInMail() {
        System.out.println("Enter by google account");
        objLogin.singInMail();
    }

    @Test
    public void linkToLogUp() {
        System.out.println("Return to sing up");
        objLogin.linkToLogUp();
    }

    @Test
    public void close() {
        System.out.println("Close dialogue window");
        objLogin.closeWindow();
    }
    /*

    //We need to do new class After in TopPage
    @After
    public void off(){
        System.out.println("Close window");
        if(driver!=null) {
            driver.quit();
        }
    }

     */
}
