package GreenCity.data;

public class SingInData {
    private String email;
    private String password;
    private String userName;



    public SingInData(){
        email = "gmp00565@boofx.com";
        password = "1234567890!Qaz";
        userName = "UserNameJava";
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

    @Override
    public String toString() {
        return "User [email=" + email +"userName="+ userName+ ", password=" + password + "]";
    }
}

