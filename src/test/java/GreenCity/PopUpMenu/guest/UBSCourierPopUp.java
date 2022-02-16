package GreenCity.PopUpMenu.guest;

import GreenCity.peges.TopPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UBSCourierPopUp extends MainManuPopUp {
    @FindBy(css=".menu-icon-wrapper")
    protected WebElement naviconButtonUBS;
    @FindBy(css = ".ubs > li:nth-child(4) > a")
    protected WebElement greenCityPage;

    public UBSCourierPopUp(WebDriver driver){
        super(driver);
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }


    //naviconButtonUBS
    private WebElement getNaviconButtonUBS() {
        return naviconButtonUBS;
    }

    public String getNaviconButtonUBSText(){
        return getNaviconButtonUBS().getText();
    }

    public void clickNaviconButtonUBS(){
        if(isDisplayedNaviconButtonUBS()){
            getNaviconButtonUBS().click();}
    }
    public boolean isDisplayedNaviconButtonUBS(){
        return getNaviconButtonUBS().isDisplayed();
    }


    //HomePage(GreenCity)

    protected WebElement getGreenCityPage(){
        return greenCityPage;
    }
    protected String getGreenCityPageText(){
        return getGreenCityPage().getText();
    }

    public void clickGreenCityPage(){
        clickNaviconButtonUBS();
        if(isDisplayedGreenCityPage()) {
            getGreenCityPage().click();
        }
    }
    protected boolean isDisplayedGreenCityPage(){
        return getGreenCityPage().isDisplayed();
    }


}


