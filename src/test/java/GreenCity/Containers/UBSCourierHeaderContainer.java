package GreenCity.Containers;

import GreenCity.PopUpMenu.guest.UBSCourierPopUp;
import GreenCity.data.Languages;
import GreenCity.peges.UBSCourierPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class UBSCourierHeaderContainer extends UBSCourierPage {
    private UBSCourierPopUp ubs = new UBSCourierPopUp(driver);

    @FindBy(css = "div.header_container a.header_logo.active-link")
    private WebElement ubsHome;
    @FindBy(css = "div.header_navigation-menu-ubs>nav>ul.ubs>li:nth-child(1)>a")
    private WebElement aboutUsUBS;
    @FindBy(css = "div.header_navigation-menu-ubs>nav>ul.ubs>li:nth-child(2)>a")
    private WebElement storingRules;
    @FindBy(css = "div.header_navigation-menu-ubs>nav>ul.ubs>li:nth-child(3)>a")
    private WebElement ecoShop;
    @FindBy(css = "div.header_navigation-menu-ubs>nav>ul.ubs>li:nth-child(4)>a")
    private WebElement greenCity;
    @FindBy(css = "li.search-icon")
    private WebElement searchIcon;
    @FindBy(css = ".search_search-field")
    private WebElement searchWindow;
    @FindBy(css = "ul.header_lang-switcher-wrp.header_navigation-menu-right-list")
    private WebElement languageUBS;
    @FindBy(className = "ubs-header-sign-in")
    private WebElement singInUBS;
    @FindBy(className = "ubs-header_sign-up-btn")
    private WebElement singUpUBS;

    public UBSCourierHeaderContainer(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // UBSHome
    public WebElement getUBSHome() {
        return ubsHome;
    }

    public void clickUBSHome() {
        getUBSHome().click();
    }

    public boolean isDisplayedUBSHome() {
        return ubsHome.isDisplayed();
    }

    // AboutUsUBS
    public WebElement getAboutUsUBS() {
        return aboutUsUBS;
    }

    public void clickAboutUsUBS() {
        getAboutUsUBS().click();
    }

    public boolean isDisplayedAboutUsUBS() {
        return aboutUsUBS.isDisplayed();
    }

    // StoringRules
    public WebElement getStoringRules() {
        return storingRules;
    }

    public void clickStoringRules() {
        getStoringRules().click();
    }

    public boolean isDisplayedStoringRules() {
        return storingRules.isDisplayed();
    }

    // EcoShop
    public WebElement getEcoShop() {
        return ecoShop;
    }

    public void clickEcoShop() {
        getEcoShop().click();
    }

    public boolean isDisplayedEcoShop() {
        return ecoShop.isDisplayed();
    }

    // GreenCity
    public WebElement getGreenCity() {
        return greenCity;
    }

    public void clickGreenCity() {
        getGreenCity().click();
    }

    public boolean isDisplayedGreenCity() {
        return greenCity.isDisplayed();
    }

    // SearchIcon
    public WebElement getSearchIcon() {
        return searchIcon;
    }

    public void clickSearchIcon() {
        getSearchIcon().click();
    }

    public boolean isDisplayedSearchIcon() {
        return searchIcon.isDisplayed();
    }

    // SearchWindow
    public WebElement getSearchWindow() {
        return searchWindow;
    }

    public void clickSearchWindow() {
        getSearchWindow().click();
    }

    public void sendKeysText(String text) {
        getSearchWindow().sendKeys(text);
    }

    public boolean isDisplayedSearchWindow() {
        return searchWindow.isDisplayed();
    }

    // LanguageUBS
    public WebElement getLanguageUBS() {
        return languageUBS;
    }

    public void clickLanguageUBS() {
        getLanguageUBS().click();
    }

    public boolean isDisplayedLanguageUBS() {
        return languageUBS.isDisplayed();
    }

    // SingInUBS
    public WebElement getSingInUBS() {
        return singInUBS;
    }

    public void clickSingInUBS() {
        getSingInUBS().click();
    }

    public boolean isDisplayedSingInUBS() {
        return singInUBS.isDisplayed();
    }

    // SingUpUBS
    public WebElement getSingUpUBS() {
        return singUpUBS;
    }

    public void clickSingUpUBS() {
        getSingUpUBS().click();
    }

    public boolean isDisplayedSingUpUBS() {
        return singUpUBS.isDisplayed();
    }

    // Functional logic

    public UBSCourierPage switchLanguageUBS(Languages languages) {
        clickLanguageButtonUBS(languages);
        return new UBSCourierPage(driver);
    }

    // Switch Language
    public void clickLanguageButtonUBS(Languages languages) {
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        clickLanguageUBS();
        List<WebElement> allOptions = driver.findElements(
                By.xpath("//ul[@class='add-shadow header_lang-switcher-wrp header_navigation-menu-right-list']/li/."));

        for (WebElement ele : allOptions) {
            String lang_name = ele.getText();
            System.out.println(lang_name);
            System.out.println(languages);
            if (ele.getText().equals(languages.toString())) {
                ele.click();
                break;
            } else {
                System.out.println("Do not work");
            }
        }
    }

    // Business Logic

    /**
     * Open links to another pages
     * 
     * @throws InterruptedException
     */
    public void gotoLinkPages() throws InterruptedException {

        if (!ubs.isDisplayedNaviconButtonUBS()) {
            clickStoringRules();
            Thread.sleep(1000);
            skipFromWindows();
            clickEcoShop();
            Thread.sleep(1000);
            skipFromWindows();
            clickGreenCity();
            Thread.sleep(1000);
        } else
            ubs.clickNaviconButtonUBS();
        ubs.clickAboutUsUBSPopUp();
        Thread.sleep(1000);
        skipFromWindows();
        ubs.clickNaviconButtonUBS();
        ubs.clickStoringRulesPopUp();
        Thread.sleep(1000);
        skipFromWindows();
        ubs.clickEcoShopPopUp();
        Thread.sleep(1000);
        skipFromWindows();
        ubs.clickNaviconButtonUBS();
        ubs.clickGreenCityPage();
        Thread.sleep(1000);

    }

    public void gotoRegistration() {
        ubs.clickNaviconButtonUBS();
        clickSingUpUBS();
    }

}
