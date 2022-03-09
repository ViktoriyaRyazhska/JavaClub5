package GreenCity.PopUpMenu.guest;

import GreenCity.peges.TopPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UBSCourierPopUp extends MainManuPopUp {
    @FindBy(css=".menu-icon-wrapper")
    protected WebElement naviconButtonUBS;
    @FindBy(css = ".ubs > li:nth-child(1) > a")
    protected WebElement aboutUsUBSPopUp;
    @FindBy(css = ".ubs > li:nth-child(2) > a")
    protected WebElement storingRulesPopUp;
    @FindBy(css = ".ubs > li:nth-child(3) > a")
    private WebElement ecoShopPopUp;
    @FindBy(css = ".ubs > li:nth-child(4) > a")
    protected WebElement greenCityPagePopUp;
    @FindBy(css="a.tertiary-global-button")
    private WebElement singInUBSPopUp;
    @FindBy(css = "li.header_mobile-menu-sign-up>div.ubs-header_sign-up-btn")
    private WebElement singUpUBSPopUp;

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

    //AboutUsUBSPopUp
    public WebElement getAboutUsUBSPopUp() {
        return aboutUsUBSPopUp;
    }

    public void clickAboutUsUBSPopUp() {getAboutUsUBSPopUp().click();}

    public boolean isDisplayedAboutUsUBSPopUp() {return aboutUsUBSPopUp.isDisplayed();}

    //StoringRulesPopUp
    public WebElement getStoringRulesPopUp() {
        return storingRulesPopUp;
    }

    public void clickStoringRulesPopUp() {getStoringRulesPopUp().click();}

    public boolean isDisplayedStoringRulesPopUp() {return storingRulesPopUp.isDisplayed();}

    //EcoShop
    public WebElement getEcoShopPopUp() {
        return ecoShopPopUp;
    }

    public void clickEcoShopPopUp() {getEcoShopPopUp().click();}

    public boolean isDisplayedEcoShopPopUp() {return ecoShopPopUp.isDisplayed();}

    //HomePage(GreenCity)

    protected WebElement getGreenCityPagePopUp(){
        return greenCityPagePopUp;
    }
    protected String getGreenCityPagePopUpText(){
        return getGreenCityPagePopUp().getText();
    }

    public void clickGreenCityPage(){
        clickNaviconButtonUBS();
        if(isDisplayedGreenCityPagePopUp()) {
            getGreenCityPagePopUp().click();
        }
    }
    protected boolean isDisplayedGreenCityPagePopUp(){
        return getGreenCityPagePopUp().isDisplayed();
    }



}


