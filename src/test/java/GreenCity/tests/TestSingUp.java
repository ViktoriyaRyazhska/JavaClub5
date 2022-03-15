package GreenCity.tests;

import GreenCity.Components.TopGuestComponent;
import GreenCity.PopUpMenu.guest.SingUpPopUp;
import GreenCity.data.RegistrationData;
import GreenCity.peges.GoogleAccountPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class TestSingUp extends GreenCityRunner {
    private final RegistrationData registrationData = new RegistrationData();

    @Test(priority = 1)
    public void registration() {
        // logger.info("Ligin user = " + registrationData.toString());
        SingUpPopUp singUpPopUp = new SingUpPopUp(driver);
        TopGuestComponent topGuestComponent = new TopGuestComponent(driver);
        if (topGuestComponent.isDisplayedSingUp()) {
            singUpPopUp.gotoSingUpPopUp();
            singUpPopUp.singUp(registrationData.getEmail(), registrationData.getUserName(),
                    registrationData.getPassword());
            logger.info("Registration was successful");
        } else {
            singUpPopUp.gotoSingUpPopUp();
            // singUpPopUp.singUp(registrationData.getEmail(),
            // registrationData.getUserName(), registrationData.getPassword());
        }
    }

    @Test(priority = 2)
    public void WrongEmail() {
        SingUpPopUp singUpPopUp = new SingUpPopUp(driver);
        TopGuestComponent topGuestComponent = new TopGuestComponent(driver);
        if (topGuestComponent.isDisplayedSingUp()) {
            singUpPopUp.gotoSingUpPopUp();
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
            logger.info("test was successful:" + expected);
        } else {
            singUpPopUp.gotoSingUpPopUp();
            logger.info("Link is not available");
        }
    }

    @Test(priority = 3)
    public void WrongName() {
        SingUpPopUp singUpPopUp = new SingUpPopUp(driver);
        TopGuestComponent topGuestComponent = new TopGuestComponent(driver);
        if (topGuestComponent.isDisplayedSingUp()) {
            singUpPopUp.gotoSingUpPopUp();
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
            logger.info("test was successful:" + expected);
        } else {
            singUpPopUp.gotoSingUpPopUp();
            logger.info("Link is not available");
        }
    }

    @Test(priority = 4)
    public void WrongAmountPassword() {
        SingUpPopUp singUpPopUp = new SingUpPopUp(driver);
        TopGuestComponent topGuestComponent = new TopGuestComponent(driver);
        if (topGuestComponent.isDisplayedSingUp()) {
            singUpPopUp.gotoSingUpPopUp();
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
            logger.info("test was successful:" + expected);
        } else {
            singUpPopUp.gotoSingUpPopUp();
            logger.info("Link is not available");
        }
    }

    @Test(priority = 5)
    public void WrongSymbolPassword() {
        SingUpPopUp singUpPopUp = new SingUpPopUp(driver);
        TopGuestComponent topGuestComponent = new TopGuestComponent(driver);
        if (topGuestComponent.isDisplayedSingUp()) {
            singUpPopUp.gotoSingUpPopUp();
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
            logger.info("test was successful:" + expected);
        } else {
            singUpPopUp.gotoSingUpPopUp();
            logger.info("Link is not available");
        }
    }

    @Test(priority = 6)
    public void WrongCoincidePassword() {
        SingUpPopUp singUpPopUp = new SingUpPopUp(driver);
        TopGuestComponent topGuestComponent = new TopGuestComponent(driver);
        if (topGuestComponent.isDisplayedSingUp()) {
            singUpPopUp.gotoSingUpPopUp();
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
            logger.info("test was successful:" + expected);
        } else {
            singUpPopUp.gotoSingUpPopUp();
            logger.info("Link is not available");
        }
    }

    @Test(priority = 7)
    public void NoPassword() {
        SingUpPopUp singUpPopUp = new SingUpPopUp(driver);
        TopGuestComponent topGuestComponent = new TopGuestComponent(driver);
        if (topGuestComponent.isDisplayedSingUp()) {
            singUpPopUp.gotoSingUpPopUp();
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
            logger.info("test was successful:" + expected);
        } else {
            singUpPopUp.gotoSingUpPopUp();
            logger.info("Link is not available");
        }
    }

    @Test(priority = 8)
    public void gotoSingIn() {
        SingUpPopUp singUpPopUp = new SingUpPopUp(driver);
        TopGuestComponent topGuestComponent = new TopGuestComponent(driver);
        if (topGuestComponent.isDisplayedSingUp()) {
            singUpPopUp.gotoSingUpPopUp();
            singUpPopUp.clickTurnToSingIn();
        } else {
            singUpPopUp.gotoSingUpPopUp();
            logger.info("Link is not available");
        }
    }

    @Test(priority = 9)
    public void registerGoogleAccount() throws InterruptedException {
        SingUpPopUp singUpPopUp = new SingUpPopUp(driver);
        TopGuestComponent topGuestComponent = new TopGuestComponent(driver);
        if (topGuestComponent.isDisplayedSingUp()) {
            singUpPopUp.gotoSingUpPopUp();
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
            logger.info("Google registration was saccessful");
        } else {
            singUpPopUp.gotoSingUpPopUp();
            logger.info("Link is not available");
        }

    }

}
