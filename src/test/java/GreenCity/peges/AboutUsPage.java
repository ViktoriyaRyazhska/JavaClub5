package GreenCity.peges;

import GreenCity.data.Languages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUsPage extends TopPage {

    @FindBy(css = ".full-text-block:nth-child(1) > .primary-global-button")
    private WebElement fromHabit;
    @FindBy(css = ".card-store .card-link")
    private WebElement findEcoPlases;
    @FindBy(css = ".card-eco-place .card-link")
    private WebElement tipsTricks;


    public AboutUsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    //Functional
    public AboutUsPage switchLanguage(Languages languages) {
        clicklanguageButton2(languages);
        return new AboutUsPage(driver);
    }


//FromHabit

    public WebElement getFromHabit() {
        scrollToElement(fromHabit);
        return fromHabit;
    }

    public void clickFromHabit() {
        scrollToElement(fromHabit);
        getFromHabit().click();
        if (SingInDropdoun().isDisplayedcloseWindow()) {
            SingInDropdoun().clickcloseWindow();
            navigateMenuAboutUs();
        }
    }

    public String getFromHabitText() {
        scrollToElement(fromHabit);
        return getFromHabit().getText();
    }

    public boolean isDisplayedFromHabits() {
        return fromHabit.isDisplayed();
    }

    //findEcoPlases

    public WebElement getFindEcoPlases() {
        scrollToElement(findEcoPlases);
        return findEcoPlases;
    }

    public void clickFindEcoPlases() throws InterruptedException {
        Thread.sleep(5000);
        scrollToElement(findEcoPlases);
        getFindEcoPlases().click();
    }

    public String getFindEcoPlasesText() {
        scrollToElement(findEcoPlases);
        return getFindEcoPlases().getText();
    }

    public boolean isDisplayedFindEcoPlases() {
        return findEcoPlases.isDisplayed();
    }

    //tipsTricks

    public WebElement getTipsTricks() {
        scrollToElement(tipsTricks);
        return tipsTricks;
    }

    public void clickTipsTricks() {
        scrollToElement(tipsTricks);
        getTipsTricks().click();
    }

    public String getTipsTricsText() {
        scrollToElement(tipsTricks);
        return getTipsTricks().getText();
    }

    public boolean isDisplayedTipsTricks() {
        return tipsTricks.isDisplayed();
    }

    //Business logic

    /**
     * Go To PlacesPage.
     *
     * @return PlacesPage
     */
    public PlacesPage goToPlacesPage() throws InterruptedException {
        clickFindEcoPlases();
        return new PlacesPage(driver);
    }

    /**
     * Back From PlacePage.
     *
     * @return AboutUsPage
     */

    public AboutUsPage backFromPlace() {
        SingInDropdoun();
        navigateMenuAboutUs();
        return new AboutUsPage(driver);
    }

    /**
     * Go To TipsTricksPage
     *
     * @return TipsTricksPage
     */
    public TipsTricksPage goToTipsTricks() {
        clickTipsTricks();
        return new TipsTricksPage(driver);
    }

    /**
     * Back From TipsTricks.
     *
     * @return AboutUsPage
     */
    public AboutUsPage backFromTipsTricks() {
        navigateMenuAboutUs();
        return new AboutUsPage(driver);
    }
}