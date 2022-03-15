package GreenCity.tests;

import GreenCity.Components.TopGuestComponent;
import GreenCity.Containers.UBSCourierHeaderContainer;
import GreenCity.PopUpMenu.guest.SingUpPopUpUBS;
import GreenCity.PopUpMenu.guest.UBSCourierPopUp;
import GreenCity.data.RegistrationData;
import GreenCity.peges.GoogleAccountPage;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSingUpUBS extends GreenCityRunner {
    private final RegistrationData registrationData = new RegistrationData();
    public final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test(priority = 1)
    public void registration() throws InterruptedException {

        SingUpPopUpUBS singUpPopUp = new SingUpPopUpUBS(driver);
        UBSCourierHeaderContainer ubsCourier = new UBSCourierHeaderContainer(driver);
        try {
            ubsCourier.navigateMenuUBSCourier();
            if (ubsCourier.isDisplayedSingUpUBS()) {
                ubsCourier.gotoRegistration();
                singUpPopUp.singUp(registrationData.getEmail(), registrationData.getUserName(),
                        registrationData.getPassword());
                PresentationSleep();

                logger.info("Registration was successful");

            } else {
                ubsCourier.gotoRegistration();
                singUpPopUp.singUp(registrationData.getEmail(),
                        registrationData.getUserName(), registrationData.getPassword());
                PresentationSleep();

                logger.info("Registration was successful");

            }
        } catch (ElementClickInterceptedException e) {

            logger.info("Element singInLinkUBS not available");
        }

    }

    @Test(priority = 2)
    public void WrongEmail() {
        SingUpPopUpUBS singUpPopUp = new SingUpPopUpUBS(driver);
        UBSCourierHeaderContainer ubsCourier = new UBSCourierHeaderContainer(driver);
        try {
            ubsCourier.navigateMenuUBSCourier();
            if (ubsCourier.isDisplayedSingUpUBS()) {
                ubsCourier.gotoRegistration();
                singUpPopUp.singUpWrongEmail(registrationData.getWrongEmail());
                String expected;
                if (singUpPopUp.getLanguageButtonText().equals("Ua")) {
                    expected = "Перевірте, чи правильно вказано вашу адресу електронної пошти";
                } else if (singUpPopUp.getLanguageButtonText().equals("Ru")) {
                    expected = "Пожалуйста, убедитесь, что ваш адрес электронной почты указан правильно";
                } else {
                    expected = "Please check that your e-mail address is indicated correctly";
                }
                Assert.assertEquals(expected, singUpPopUp.getWrongEmailText());
                logger.info(expected);

            } else {
                UBSCourierPopUp ubs = new UBSCourierPopUp(driver);
                ubs.clickSingUpUBSPopUp();
                singUpPopUp.singUpWrongEmail(registrationData.getWrongEmail());
                String expected;
                if (singUpPopUp.getLanguageButtonText().equals("Ua")) {
                    expected = "Перевірте, чи правильно вказано вашу адресу електронної пошти";
                } else if (singUpPopUp.getLanguageButtonText().equals("Ru")) {
                    expected = "Пожалуйста, убедитесь, что ваш адрес электронной почты указан правильно";
                } else {
                    expected = "Please check that your e-mail address is indicated correctly";
                }
                Assert.assertEquals(expected, singUpPopUp.getWrongEmailText());
                logger.info(expected);
            }
        } catch (ElementClickInterceptedException e) {
            logger.info("Element singInLinkUBS not available");
        }
    }

    @Test(priority = 3)
    public void WrongName() {
        SingUpPopUpUBS singUpPopUp = new SingUpPopUpUBS(driver);
        UBSCourierHeaderContainer ubsCourier = new UBSCourierHeaderContainer(driver);
        try {
            ubsCourier.navigateMenuUBSCourier();
            if (ubsCourier.isDisplayedSingUpUBS()) {
                ubsCourier.gotoRegistration();
                singUpPopUp.singUpErrorSymbolName(registrationData.getEmail(), registrationData.getWrongName());
                String expected;
                if (singUpPopUp.getLanguageButtonText().equals("Ua")) {
                    expected = "Ім'я повинно містити 6-30 символів і може складатись з літер(a-z), цифр(0-9) та крапки(.), крапка на початку імені, в кінці та послідовність крапок заборонена";
                } else if (singUpPopUp.getLanguageButtonText().equals("Ru")) {
                    expected = "Имя должно содержать 6-30 символов и может состоять из букв(a-z), цифр(0-9) и точки(.), точка в начале имени, в конце, а также последовательность точек запрещена";
                } else {
                    expected = "The name must contain 6-30 characters and can contain letters(a-z), numbers(0-9) and a dot(.), dot at the start, at the end and consecutive dot is forbidden";
                }
                Assert.assertEquals(expected, singUpPopUp.getErrorSymbolNameText());
                logger.info(expected);
            } else {
                UBSCourierPopUp ubs = new UBSCourierPopUp(driver);
                ubs.clickSingUpUBSPopUp();
                singUpPopUp.singUpErrorSymbolName(registrationData.getEmail(), registrationData.getWrongName());
                String expected;
                if (singUpPopUp.getLanguageButtonText().equals("Ua")) {
                    expected = "Ім'я повинно містити 6-30 символів і може складатись з літер(a-z), цифр(0-9) та крапки(.), крапка на початку імені, в кінці та послідовність крапок заборонена";
                } else if (singUpPopUp.getLanguageButtonText().equals("Ru")) {
                    expected = "Имя должно содержать 6-30 символов и может состоять из букв(a-z), цифр(0-9) и точки(.), точка в начале имени, в конце, а также последовательность точек запрещена";
                } else {
                    expected = "The name must contain 6-30 characters and can contain letters(a-z), numbers(0-9) and a dot(.), dot at the start, at the end and consecutive dot is forbidden";
                }
                Assert.assertEquals(expected, singUpPopUp.getErrorSymbolNameText());
                logger.info(expected);
            }
        } catch (ElementClickInterceptedException e) {
            logger.info("Element singInLinkUBS not available");
        }
    }

    @Test(priority = 4)
    public void WrongAmountPassword() {
        SingUpPopUpUBS singUpPopUp = new SingUpPopUpUBS(driver);
        UBSCourierHeaderContainer ubsCourier = new UBSCourierHeaderContainer(driver);
        try {
            ubsCourier.navigateMenuUBSCourier();
            if (ubsCourier.isDisplayedSingUpUBS()) {
                ubsCourier.gotoRegistration();
                singUpPopUp.singUpAmountPassword(registrationData.getEmail(), registrationData.getUserName(),
                        registrationData.getAmountPassword());
                String expected;
                if (singUpPopUp.getLanguageButtonText().equals("Ua")) {
                    expected = "Пароль повинен містити принаймі 8 символів";
                } else if (singUpPopUp.getLanguageButtonText().equals("Ru")) {
                    expected = "Пароль должен содержать по крайней мере 8 символов";
                } else {
                    expected = "Password must be at least 8 characters long";
                }
                Assert.assertEquals(expected, singUpPopUp.getErrorAmountPasswordText());
                logger.info(expected);
            } else {
                UBSCourierPopUp ubs = new UBSCourierPopUp(driver);
                ubs.clickSingUpUBSPopUp();
                singUpPopUp.singUpAmountPassword(registrationData.getEmail(), registrationData.getUserName(),
                        registrationData.getAmountPassword());
                String expected;
                if (singUpPopUp.getLanguageButtonText().equals("Ua")) {
                    expected = "Пароль повинен містити принаймі 8 символів";
                } else if (singUpPopUp.getLanguageButtonText().equals("Ru")) {
                    expected = "Пароль должен содержать по крайней мере 8 символов";
                } else {
                    expected = "Password must be at least 8 characters long";
                }
                Assert.assertEquals(expected, singUpPopUp.getErrorAmountPasswordText());
                logger.info(expected);
            }
        } catch (ElementClickInterceptedException e) {
            logger.info("Element singInLinkUBS not available");
        }
    }

    @Test(priority = 5)
    public void WrongSymbolPassword() {
        SingUpPopUpUBS singUpPopUp = new SingUpPopUpUBS(driver);
        UBSCourierHeaderContainer ubsCourier = new UBSCourierHeaderContainer(driver);
        try {
            ubsCourier.navigateMenuUBSCourier();
            if (ubsCourier.isDisplayedSingUpUBS()) {
                ubsCourier.gotoRegistration();
                singUpPopUp.singUpErrorSymbolPassword(registrationData.getEmail(), registrationData.getUserName(),
                        registrationData.getErrorSymbolPassword());
                String expected;
                if (singUpPopUp.getLanguageButtonText().equals("Ua")) {
                    expected = "Пароль має містити хоча б один символ латинського алфавіту верхнього (A-Z) та нижнього регістру (a-z), число (0-9) та спеціальний символ (~`!@#$%^&*()+=_-{}[]|:;”’?/<>,.)";
                } else if (singUpPopUp.getLanguageButtonText().equals("Ru")) {
                    expected = "Пароль должен содержать хотя бы один символ латинского алфавита верхнего (A-Z) и нижнего регистра (a-z), а также число (0-9) и специальный символ (~`!@#$%^&*()+=_-{}[]|:;”’?/<>,.)";
                } else {
                    expected = "Password has contain at least one character of Uppercase letter (A-Z), Lowercase letter (a-z), Digit (0-9), Special character (~`!@#$%^&*()+=_-{}[]|:;”’?/<>,.)";
                }
                Assert.assertEquals(expected, singUpPopUp.getErrorSymbolPasswordText());
                logger.info(expected);
            } else {
                UBSCourierPopUp ubs = new UBSCourierPopUp(driver);
                ubs.clickSingUpUBSPopUp();
                singUpPopUp.singUpErrorSymbolPassword(registrationData.getEmail(), registrationData.getUserName(),
                        registrationData.getErrorSymbolPassword());
                String expected;
                if (singUpPopUp.getLanguageButtonText().equals("Ua")) {
                    expected = "Пароль має містити хоча б один символ латинського алфавіту верхнього (A-Z) та нижнього регістру (a-z), число (0-9) та спеціальний символ (~`!@#$%^&*()+=_-{}[]|:;”’?/<>,.)";
                } else if (singUpPopUp.getLanguageButtonText().equals("Ru")) {
                    expected = "Пароль должен содержать хотя бы один символ латинского алфавита верхнего (A-Z) и нижнего регистра (a-z), а также число (0-9) и специальный символ (~`!@#$%^&*()+=_-{}[]|:;”’?/<>,.)";
                } else {
                    expected = "Password has contain at least one character of Uppercase letter (A-Z), Lowercase letter (a-z), Digit (0-9), Special character (~`!@#$%^&*()+=_-{}[]|:;”’?/<>,.)";
                }
                Assert.assertEquals(expected, singUpPopUp.getErrorSymbolPasswordText());
                logger.info(expected);
            }
        } catch (ElementClickInterceptedException e) {
            logger.info("Element singInLinkUBS not available");
        }
    }

    @Test(priority = 6)
    public void WrongCoincidePassword() {
        SingUpPopUpUBS singUpPopUp = new SingUpPopUpUBS(driver);
        UBSCourierHeaderContainer ubsCourier = new UBSCourierHeaderContainer(driver);
        try {
            ubsCourier.navigateMenuUBSCourier();
            if (ubsCourier.isDisplayedSingUpUBS()) {
                ubsCourier.gotoRegistration();
                singUpPopUp.singUpErrorCoincidePassword(registrationData.getEmail(), registrationData.getUserName(),
                        registrationData.getPassword(), registrationData.getErrorSymbolPassword());
                String expected;
                if (singUpPopUp.getLanguageButtonText().equals("Ua")) {
                    expected = "Пароль не співпадає";
                } else if (singUpPopUp.getLanguageButtonText().equals("Ru")) {
                    expected = "Пароли не совпадают";
                } else {
                    expected = "Passwords do not match";
                }
                Assert.assertEquals(expected, singUpPopUp.getErrorCoincidePasswordText());
                logger.info(expected);
            } else {
                UBSCourierPopUp ubs = new UBSCourierPopUp(driver);
                ubs.clickSingUpUBSPopUp();
                singUpPopUp.singUpErrorCoincidePassword(registrationData.getEmail(), registrationData.getUserName(),
                        registrationData.getPassword(), registrationData.getErrorSymbolPassword());
                String expected;
                if (singUpPopUp.getLanguageButtonText().equals("Ua")) {
                    expected = "Пароль не співпадає";
                } else if (singUpPopUp.getLanguageButtonText().equals("Ru")) {
                    expected = "Пароли не совпадают";
                } else {
                    expected = "Passwords do not match";
                }
                Assert.assertEquals(expected, singUpPopUp.getErrorCoincidePasswordText());
                logger.info(expected);
            }
        } catch (ElementClickInterceptedException e) {
            logger.info("Element singInLinkUBS not available");
        }
    }

    @Test(priority = 7)
    public void NoPassword() {
        SingUpPopUpUBS singUpPopUp = new SingUpPopUpUBS(driver);
        UBSCourierHeaderContainer ubsCourier = new UBSCourierHeaderContainer(driver);
        try {
            ubsCourier.navigateMenuUBSCourier();
            if (ubsCourier.isDisplayedSingUpUBS()) {
                ubsCourier.gotoRegistration();
                singUpPopUp.singUpNoPassword(registrationData.getEmail(), registrationData.getUserName());
                String expected;
                if (singUpPopUp.getLanguageButtonText().equals("Ua")) {
                    expected = "Введіть пароль";
                } else if (singUpPopUp.getLanguageButtonText().equals("Ru")) {
                    expected = "Введите пароль";
                } else {
                    expected = "Password is required";
                }
                Assert.assertEquals(expected, singUpPopUp.getErrorNoPasswordText());
                logger.info(expected);
            } else {
                UBSCourierPopUp ubs = new UBSCourierPopUp(driver);
                ubs.clickSingUpUBSPopUp();
                singUpPopUp.singUpNoPassword(registrationData.getEmail(), registrationData.getUserName());
                String expected;
                if (singUpPopUp.getLanguageButtonText().equals("Ua")) {
                    expected = "Введіть пароль";
                } else if (singUpPopUp.getLanguageButtonText().equals("Ru")) {
                    expected = "Введите пароль";
                } else {
                    expected = "Password is required";
                }
                Assert.assertEquals(expected, singUpPopUp.getErrorNoPasswordText());
                logger.info(expected);
            }
        } catch (ElementClickInterceptedException e) {
            logger.info("Element singInLinkUBS not available");
        }
    }

    @Test(priority = 8)
    public void gotoSingIn() {
        SingUpPopUpUBS singUpPopUp = new SingUpPopUpUBS(driver);
        UBSCourierHeaderContainer ubsCourier = new UBSCourierHeaderContainer(driver);
        try {
            ubsCourier.navigateMenuUBSCourier();
            if (ubsCourier.isDisplayedSingUpUBS()) {
                ubsCourier.gotoRegistration();
                singUpPopUp.clickTurnToSingIn();
                logger.info("Successful transition to the page");
            }
        } catch (ElementClickInterceptedException e) {
            logger.info("Element singInLinkUBS not available");
        }
    }

    @Test(priority = 9)
    public void registerGoogleAccount() throws InterruptedException {

        UBSCourierHeaderContainer ubsCourier = new UBSCourierHeaderContainer(driver);
        try {
            ubsCourier.navigateMenuUBSCourier();
            if (ubsCourier.isDisplayedSingUpUBS()) {
                ubsCourier.gotoRegistration();
                GoogleAccountPage googleAccountPage = new GoogleAccountPage(driver);
                googleAccountPage.clickSingInGoogle();
                String parentWindow = driver.getWindowHandle();
                Set<String> handles = driver.getWindowHandles();
                for (String windowHandle : handles) {
                    if (!windowHandle.equals(parentWindow)) {
                        driver.switchTo().window(windowHandle);
                        driver.findElement(By.className("whsOnd")).sendKeys(registrationData.getEmail());
                        googleAccountPage.clickFurtherBotton();
                        driver.close(); // closing child window
                        driver.switchTo().window(parentWindow);

                    }
                }
                logger.info("Successful transition to the page");
            } else {

                logger.info("Successful transition to the page");
            }
        } catch (ElementClickInterceptedException e) {
            logger.info("Element singInLinkUBS not available");
        }

    }

}
