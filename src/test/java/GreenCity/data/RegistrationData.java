package GreenCity.data;

public class RegistrationData {

    private String email;
    private String password;
    private String userName;
    private String wrongEmail;
    private String wrongName;
    private String amountPassword;
    private String errorSymbolPassword;

    public RegistrationData() {
        email = "nastacy@yahoo.com";
        password = "1q2w3e4r5t6y&U";
        userName = "Anastasiia";
        wrongEmail = "Gbhj.googlecom";
        wrongName = "F";
        amountPassword = "1q2w3e";
        errorSymbolPassword = "1q2w3ehhhhhh";
    }

    // setters

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    // getters

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public String getWrongEmail() {
        return wrongEmail;
    }

    public String getWrongName() {
        return wrongName;
    }

    public String getAmountPassword() {
        return amountPassword;
    }

    public String getErrorSymbolPassword() {
        return errorSymbolPassword;
    }

    @Override
    public String toString() {
        return "User [email=" + email + "userName=" + userName + ", password=" + password + "]";
    }

}
