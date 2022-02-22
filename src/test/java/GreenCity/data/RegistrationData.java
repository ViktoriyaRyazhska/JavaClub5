package GreenCity.data;

import java.util.ArrayList;

public class RegistrationData {
/*
    public static ArrayList<String> getGuestData(){
    ArrayList<String> guestData = new ArrayList<>();
    guestData.add("nastacy@yahoo.com");
    guestData.add("1q2w3e4r5t6y&U");
    guestData.add("Anastasiia");
    return guestData;
    }
 */

    private String email;
    private String password;
    private String userName;



    public RegistrationData(){
        email = "nastacy@yahoo.com";
        password = "1q2w3e4r5t6y&U";
        userName = "Anastasiia";
    }

    // setters

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

     public void setUserName(String userName) {this.userName = userName;}

    // getters

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName(){return userName;}

   /* @Override
    public String toString() {
    return "User [email=" + email +"userName="+ userName+ ", password=" + password + "]";
    }

    */
}


