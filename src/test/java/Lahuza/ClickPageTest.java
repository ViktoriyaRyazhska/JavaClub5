package Lahuza;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class ClickPageTest {
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
    }

    @Test
    public void testActualPage() {
        System.out.println("Check pageURL");
        assertEquals("https://ita-social-projects.github.io/GreenCityClient/#/", webDriver.getCurrentUrl());

        System.out.println("Check page title");
        assertEquals("GreenCity", webDriver.getTitle());
    }
    @After
    public void off(){
        System.out.println("Close window");
        if(webDriver!=null){
            webDriver.quit();
        }
    }
}
