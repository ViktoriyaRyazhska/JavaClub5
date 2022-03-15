package GreenCity.peges;

import GreenCity.data.Languages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TipsTricksPage extends TopPage {

    @FindBy(xpath = "//div[@id='nav-row']/button[2]/em")
    private WebElement findTipsTricks;

    public TipsTricksPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public TipsTricksPage switchLanguage(Languages languages) {
        clicklanguageButton2(languages);
        return new TipsTricksPage(driver);
    }

    public WebElement getFindTipsTricks() {
        scrollToElement(findTipsTricks);
        return findTipsTricks;
    }

    public void clickFindTipsTricks() {
        scrollToElement(findTipsTricks);
        getFindTipsTricks().click();
    }

    public String getFindTipsTricksText() {
        scrollToElement(findTipsTricks);
        return getFindTipsTricks().getText();
    }

    public boolean isDisplayedFindTipsTricks() {
        return findTipsTricks.isDisplayed();
    }

    public TipsTricksPage backFromTipsTricks() {
        navigateMenuTipsTricks();
        return new TipsTricksPage(driver);
    }
}