package GreenCity.tests;


import GreenCity.PopUpMenu.guest.SingUpPopUp;
import GreenCity.data.Languages;
import GreenCity.data.RegistrationData;
import GreenCity.peges.GoogleAccountPage;
import GreenCity.peges.HomePage;
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
    public void register(){
        SingUpPopUp singUpPopUp = new SingUpPopUp(driver);
        singUpPopUp.gotoSingUpPopUp();
        singUpPopUp.singUp("nastacia@yahoo.com", "Anastasiia", "1q2w3e4r5t6y&U", "1q2w3e4r5t6y&U" );
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
