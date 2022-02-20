package GreenCity.tests;


import GreenCity.PopUpMenu.guest.SingUpPopUp;
import GreenCity.data.Languages;
import GreenCity.data.RegistrationData;
import GreenCity.peges.GoogleAccountPage;
import GreenCity.peges.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSingUp extends GreenCityRunner{

    @DataProvider
    public Object[][] validRegistrationData() {
        return new Object[][]{
                {RegistrationData.getGuestData()}
        };
    }

    @Test
    public void registration(){
        SingUpPopUp singUpPopUp = new SingUpPopUp(driver);
        singUpPopUp.gotoSingUpPopUp();
        singUpPopUp.singUp("nastacia@yahoo.com", "Anastasiia", "1q2w3e4r5t6y&U");
        System.out.println("Registration was successful");
    }
    @Test
    public void WrongEmail(){
        SingUpPopUp singUpPopUp = new SingUpPopUp(driver);
        singUpPopUp.gotoSingUpPopUp();
        singUpPopUp.singUpWrongEmail("Gbhj.googlecom");
        String expected;
               if(singUpPopUp.getLanguageButtonText().equals("Ua") ){
                   expected="Перевірте, чи правильно вказано вашу адресу електронної пошти";
               }
               else if(singUpPopUp.getLanguageButtonText().equals("Ru")){
                   expected="Пожалуйста, убедитесь, что ваш адрес электронной почты указан правильно";
               }
               else {expected = "Please check that your e-mail address is indicated correctly";}
        Assert.assertEquals(expected, singUpPopUp.getWrongEmailText());
        System.out.println("test was successful:" + expected);
    }
    @Test
    public void WrongName(){
        SingUpPopUp singUpPopUp = new SingUpPopUp(driver);
        singUpPopUp.gotoSingUpPopUp();
        singUpPopUp.singUpErrorSymbolName("nastacia@yahoo.com", "F");
        String expected;
        if(singUpPopUp.getLanguageButtonText().equals("Ua") ){
            expected="Ім'я повинно містити 6-30 символів і може складатись з літер(a-z), цифр(0-9) та крапки(.), крапка на початку імені, в кінці та послідовність крапок заборонена";
        }
        else if(singUpPopUp.getLanguageButtonText().equals("Ru")){
            expected="Имя должно содержать 6-30 символов и может состоять из букв(a-z), цифр(0-9) и точки(.), точка в начале имени, в конце, а также последовательность точек запрещена";
        }
        else {expected = "The name must contain 6-30 characters and can contain letters(a-z), numbers(0-9) and a dot(.), dot at the start, at the end and consecutive dot is forbidden";}
        Assert.assertEquals(expected, singUpPopUp.getErrorSymbolNameText());
        System.out.println("test was successful:" + expected);
    }

    @Test
    public void WrongAmountPassword(){
        SingUpPopUp singUpPopUp = new SingUpPopUp(driver);
        singUpPopUp.gotoSingUpPopUp();
        singUpPopUp.singUpAmountPassword("nastacia@yahoo.com", "Anastasiia", "1q2w3e");
        String expected;
        if(singUpPopUp.getLanguageButtonText().equals("Ua") ){
            expected="Пароль повинен містити принаймі 8 символів";
        }
        else if(singUpPopUp.getLanguageButtonText().equals("Ru")){
            expected="Пароль должен содержать по крайней мере 8 символов";
        }
        else {expected = "Password must be at least 8 characters long";}
        Assert.assertEquals(expected, singUpPopUp.getErrorAmountPasswordText());
        System.out.println("test was successful:" + expected);
    }
    @Test
    public void WrongSymbolPassword(){
        SingUpPopUp singUpPopUp = new SingUpPopUp(driver);
        singUpPopUp.gotoSingUpPopUp();
        singUpPopUp.singUpErrorSymbolPassword("nastacia@yahoo.com", "Anastasiia","1q2w3ehhhhhh");
        String expected;
        if(singUpPopUp.getLanguageButtonText().equals("Ua") ){
            expected="Пароль має містити хоча б один символ латинського алфавіту верхнього (A-Z) та нижнього регістру (a-z), число (0-9) та спеціальний символ (~`!@#$%^&*()+=_-{}[]|:;”’?/<>,.)";
        }
        else if(singUpPopUp.getLanguageButtonText().equals("Ru")){
            expected="Пароль должен содержать хотя бы один символ латинского алфавита верхнего (A-Z) и нижнего регистра (a-z), а также число (0-9) и специальный символ (~`!@#$%^&*()+=_-{}[]|:;”’?/<>,.)";
        }
        else {expected = "Password has contain at least one character of Uppercase letter (A-Z), Lowercase letter (a-z), Digit (0-9), Special character (~`!@#$%^&*()+=_-{}[]|:;”’?/<>,.)";}
        Assert.assertEquals(expected, singUpPopUp.getErrorSymbolPasswordText());
        System.out.println("test was successful:" + expected);
    }

    @Test
    public void WrongCoincidePassword(){
        SingUpPopUp singUpPopUp = new SingUpPopUp(driver);
        singUpPopUp.gotoSingUpPopUp();
        singUpPopUp.singUpErrorCoincidePassword("nastacia@yahoo.com", "Anastasiia", "1q2w3e4r5t6y&U", "1q2w3ehhhhhh");
        String expected;
        if(singUpPopUp.getLanguageButtonText().equals("Ua") ){
            expected="Пароль не співпадає";
        }
        else if(singUpPopUp.getLanguageButtonText().equals("Ru")){
            expected="Пароли не совпадают";
        }
        else {expected = "Passwords do not match";}
        Assert.assertEquals(expected, singUpPopUp.getErrorCoincidePasswordText());
        System.out.println("test was successful:" + expected);
    }

    @Test
    public void  NoPassword(){
        SingUpPopUp singUpPopUp = new SingUpPopUp(driver);
        singUpPopUp.gotoSingUpPopUp();
        singUpPopUp.singUpNoPassword("nastacia@yahoo.com", "Anastasiia");
        String expected;
        if(singUpPopUp.getLanguageButtonText().equals("Ua") ){
            expected="Введіть пароль";
        }
        else if(singUpPopUp.getLanguageButtonText().equals("Ru")){
            expected="Введите пароль";
        }
        else {expected = "Password is required";}
        Assert.assertEquals(expected, singUpPopUp.getErrorNoPasswordText());
        System.out.println("test was successful:" + expected);
    }


    @Test
    public void gotoSingIn(){
        SingUpPopUp singUpPopUp = new SingUpPopUp(driver);
        singUpPopUp.gotoSingUpPopUp();
        singUpPopUp.clickTurnToSingIn();
    }


    @Test
    public void registerGoogleAccount(){
        SingUpPopUp singUpPopUp = new SingUpPopUp(driver);
        singUpPopUp.gotoSingUpPopUp();
        //singUpPopUp.regGoogleAccount();
        GoogleAccountPage googleAccountPage =new GoogleAccountPage(driver);
        googleAccountPage.clickSingInGoogle();
    }

}
