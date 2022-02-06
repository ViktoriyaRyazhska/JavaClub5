package GreenCity.PopUpMenu.guest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public class MainManuPopUp {

    private WebDriver driver;
    @FindBy(css="span.menu-icon-wrapper")
    private WebElement naviconButton;
    @FindBy(css=".header_logo > img")
    private WebElement homePage;
    @FindBy(xpath="//a[contains(text(),'Eco news')]")
    private WebElement menuEcoNews;

    public MainManuPopUp(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }



//Atimic logic
    //naviconButton
    private WebElement getNaviconButton() {
        return naviconButton;
    }

    public String getNaviconButtonText(){
        return getNaviconButton().getText();
    }

    public void clickNaviconButton(){
        getNaviconButton().click();
    }

    public boolean isDisplayedNaviconButton(){
       return getNaviconButton().isDisplayed();
    }

    //homePage
    private WebElement getHomePage() {
        return homePage;
    }

    public String getHomePageText(){
        return getHomePage().getText();
    }

    public void clickHomePage(){
        getHomePage().click();
    }

    public boolean isDisplayedHomePage(){
        return getHomePage().isDisplayed();
    }

    //menuEcoNews

    private WebElement getMenuEcoNews() {
        return menuEcoNews;
    }

    public String getMenuEcoNewsText(){
        return getMenuEcoNews().getText();
    }

    public void clickMenuEcoNews(){
        getMenuEcoNews().click();
    }

    public boolean isDisplayedMenuEcoNews(){
        return getMenuEcoNews().isDisplayed();
    }
}
