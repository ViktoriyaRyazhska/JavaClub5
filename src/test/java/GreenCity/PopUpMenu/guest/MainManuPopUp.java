package GreenCity.PopUpMenu.guest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainManuPopUp {
    private WebDriver driver;
    @FindBy(css="span.menu-icon-wrapper")
    private WebElement naviconButton;
    @FindBy(xpath="//a[contains(text(),'Eco news')]")
    private WebElement menuEcoNews;

    public MainManuPopUp (WebDriver driver){
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

    //menuEcoNews

    private WebElement getmenuEcoNews() {
        return menuEcoNews;
    }

    public String getMenuEcoNews(){
        return getmenuEcoNews().getText();
    }


    public void clickMenuEcoNews(){
        getmenuEcoNews().click();
    }

    public boolean isDisplayedMenuEcoNews(){
        return getmenuEcoNews().isDisplayed();
    }
}
