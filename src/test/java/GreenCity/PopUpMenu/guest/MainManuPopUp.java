package GreenCity.PopUpMenu.guest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainManuPopUp {

    private WebDriver driver;

    @FindBy(css = ".menu-icon")
    private WebElement naviconButton;
    @FindBy(css = ".header_navigation-menu-left li:nth-child(3) > a")
    private WebElement homePage;
    @FindBy(css = ".header_navigation-menu-left li:nth-child(1) > a")
    private WebElement menuEcoNews;
    //@FindBy(css = ".header_navigation-menu-left li:nth-child(2) > a")
    @FindBy(css = ".header_navigation-menu-left-col li:nth-child(2) > a")
    private WebElement menuTipsTricks;
    @FindBy(css = ".header_navigation-menu-left li:nth-child(4) > a")
    //@FindBy(css = ".header_navigation-menu-left-col li:nth-child(4) > a")
    private WebElement menuPlaces;
    //@FindBy(css = ".ng-star-inserted:nth-child(5) > a")
    @FindBy(css = ".header_navigation-menu-left li:nth-child(5) > a")
    private WebElement menuAbout;
    //@FindBy(css = ".ng-star-inserted:nth-child(7) > a")
    @FindBy(css = "li:nth-child(7) > a")
    private WebElement menuUSBCourier;
    //@FindBy(css = ".ng-star-inserted:nth-child(6) > a")
    @FindBy(css = ".header_navigation-menu-left li:nth-child(6) > a")
    private WebElement menuMySpace;
    //
    @FindBy(css = ".header_navigation-menu-left-col li:nth-child(3) > a")
    private WebElement homePagePopUp;
    @FindBy(css = ".header_navigation-menu-left-col li:nth-child(1) > a")
    private WebElement menuEcoNewsPopUp;
    @FindBy(css = ".header_navigation-menu-left-col li:nth-child(2) > a")
    private WebElement menuTipsTricksPopUp;
    @FindBy(css = ".ng-star-inserted:nth-child(4) > a")
    private WebElement menuPlacesPopUp;
    @FindBy(css = ".header_navigation-menu-left-col li:nth-child(5) > a")
    private WebElement menuAboutPopUp;
    @FindBy(css = "li:nth-child(7) > a")
    private WebElement menuUSBCourierPopUp;
    @FindBy(css = ".header_navigation-menu-left-col li:nth-child(6) > a")
    private WebElement menuMySpacePopUp;


    public MainManuPopUp(WebDriver driver) {
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
        System.out.println("********");
    }

    //naviconButton

    public WebElement getNaviconButton() {
        return naviconButton;
    }

    public String getNaviconButtonText() {
        return getNaviconButton().getText();
    }

    public void clickNaviconButton() {
        if (isDisplayedNaviconButton()) {
            getNaviconButton().click();
        }
    }

    public boolean isDisplayedNaviconButton() {
        return getNaviconButton().isDisplayed();
    }

    //homePage

    public WebElement getHomePage() {
        if (!isDisplayedHomePage()) {
            clickNaviconButton();
            return getHomePagePopUp();
        }
        return homePage;
    }

    public String getHomePageText() {
        return getHomePage().getText();
    }

    public void clickHomePage() {
        getHomePage().click();
    }

    public boolean isDisplayedHomePage() {
        return homePage.isDisplayed();
    }

    //menuEcoNews

    public WebElement getMenuEcoNews() {
        if (!isDisplayedMenuEcoNews()) {
            clickNaviconButton();
            return getMenuEcoNewsPopUp();
        }
        return menuEcoNews;
    }

    public String getMenuEcoNewsText() {
        return getMenuEcoNews().getText();
    }

    public void clickMenuEcoNews() {
        getMenuEcoNews().click();
    }

    public boolean isDisplayedMenuEcoNews() {
        return menuEcoNews.isDisplayed();
    }

    //menuTipsTricks

    public WebElement getMenuTipsTricks() {
        if (!isDisplayedMenuTipsTricks()) {
            clickNaviconButton();
            return getMenuTipsTricksPopUp();
        }
        return menuTipsTricks;
    }

    public String getMenuTipsTricksText() {
        return getMenuEcoNews().getText();
    }

    public void clickMenuTipsTricks() {
        getMenuEcoNews().click();
    }

    public boolean isDisplayedMenuTipsTricks() {
        return menuTipsTricks.isDisplayed();
    }

    //menuPlaces

    public WebElement getMenuPlaces() {
        if (!isDisplayedMenuPlaces()) {
            clickNaviconButton();
            return getMenuPlacesPopUp();
        }
        return menuPlaces;
    }

    public String getMenuPlacesText() {
        return getMenuPlaces().getText();
    }

    public void clickMenuPlaces() {
        getMenuPlaces().click();
    }

    public boolean isDisplayedMenuPlaces() {
        return menuPlaces.isDisplayed();
    }

    //menuAbout

    public WebElement getMenuAbout() {
        if (!isDisplayedMenuAbout()) {
            clickNaviconButton();
            return getMenuAboutPopUp();
        }
        return menuAbout;
    }

    public String getMenuAboutText() {
        return getMenuAbout().getText();
    }

    public void clickMenuAbout() {
        getMenuAbout().click();
    }

    public boolean isDisplayedMenuAbout() {
        return menuAbout.isDisplayed();
    }

    //menuUSBCourier

    public WebElement getMenuUSBCourier() {
        if (!isDisplayedMenuUSBCourier()) {
            clickNaviconButton();
            return getMenuUSBCourierPopUp();
        }
        return menuUSBCourier;
    }

    public String getMenuUSBCourierText() {
        return getMenuUSBCourier().getText();
    }

    public void clickMenuUSBCourier() {
        getMenuUSBCourier().click();
    }

    public boolean isDisplayedMenuUSBCourier() {
        return menuUSBCourier.isDisplayed();
    }

    //menuMySpace

    public WebElement getMenuMySpace() {
        if (!isDisplayedMenuMySpace()) {
            clickNaviconButton();
            return getMenuMySpacePopUp();
        }
        return menuMySpace;
    }

    public String getMenuMySpaceText() {
        return getMenuMySpace().getText();
    }

    public void clickMenuMySpace() {
        getMenuMySpace().click();
    }

    public boolean isDisplayedMenuMySpace() {
        return menuMySpace.isDisplayed();
    }

    //homePagePopUp

    public WebElement getHomePagePopUp() {
        return homePagePopUp;
    }

    public String getHomePagePopUpText() {
        return getHomePagePopUp().getText();
    }

    public void clickHomePagePopUp() {
        getHomePagePopUp().click();
    }
//
//    public boolean isDisplayedHomePagePopUp() {
//        return getHomePagePopUp().isDisplayed();
//    }

    //menuEcoNewsPopUp

    public WebElement getMenuEcoNewsPopUp() {
        return menuEcoNewsPopUp;
    }

    public String getMenuEcoNewsPopUpText() {
        return getMenuEcoNewsPopUp().getText();
    }

    public void clickMenuEcoNewsPopUp() {
        getMenuEcoNewsPopUp().click();
    }

//    public boolean isDisplayedMenuEcoNewsPopUp() {
//        return menuEcoNewsPopUp.isDisplayed();
//    }

    //menuTipsTricksPopUp

    public WebElement getMenuTipsTricksPopUp() {
        return menuTipsTricksPopUp;
    }

    public String getMenuTipsTricksPopUpText() {
        return getMenuEcoNewsPopUp().getText();
    }

    public void clickMenuTipsTricksPopUp() {
        getMenuEcoNewsPopUp().click();
    }
//
//    public boolean isDisplayedMenuTipsTricksPopUp() {
//        return menuTipsTricksPopUp.isDisplayed();
//    }

    //menuPlacesPopUp

    public WebElement getMenuPlacesPopUp() {
        return menuPlacesPopUp;
    }

    public String getMenuPlacesPopUpText() {
        return getMenuPlacesPopUp().getText();
    }

    public void clickMenuPlacesPopUp() {
        getMenuPlacesPopUp().click();
    }
//
//    public boolean isDisplayedMenuPlacesPopUp() {
//        return menuPlacesPopUp.isDisplayed();
//    }

    //menuAboutPopUp

    public WebElement getMenuAboutPopUp() {
        return menuAboutPopUp;
    }

    public String getMenuAboutPopUpText() {
        return getMenuAboutPopUp().getText();
    }

    public void clickMenuAboutPopUp() {
        getMenuAboutPopUp().click();
    }

//    public boolean isDisplayedMenuAboutPopUp() {
//        return menuAboutPopUp.isDisplayed();
//    }

    //menuUSBCourierPopUp

    public WebElement getMenuUSBCourierPopUp() {
        return menuUSBCourierPopUp;
    }

    public String getMenuUSBCourierPopUpText() {
        return getMenuUSBCourierPopUp().getText();
    }

    public void clickMenuUSBCourierPopUp() {
        getMenuUSBCourierPopUp().click();
    }

//    public boolean isDisplayedMenuUSBCourierPopUp() {
//        return menuUSBCourierPopUp.isDisplayed();
//    }

    //menuMySpacePopUp

    public WebElement getMenuMySpacePopUp() {
        return menuMySpacePopUp;
    }

    public String getMenuMySpacePopUpText() {
        return getMenuMySpacePopUp().getText();
    }

    public void clickMenuMySpacePopUp() {
        getMenuMySpacePopUp().click();
    }

//    public boolean isDisplayedMenuMySpacePopUp() {
//        return menuMySpacePopUp.isDisplayed();
//    }

}
