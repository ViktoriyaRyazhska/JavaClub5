package GreenCity.data;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class guestData {

        private String email;
        private String password;


        public guestData(String email, String password) {
            this.email = email;
            this.password = password;

        }

        // setters

        public void setEmail(String email) {
            this.email = email;
        }


        public void setPassword(String password) {
            this.password = password;
        }

        // getters

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }

        @Override
        public String toString() {
            return "User [email=" + email + ", password=" + password + "]";
        }



}
