import config.SpringConfig;
import models.Role;
import models.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.implementations.ServiceImp;
import services.implementations.UserServiceImp;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserServiceImp userService = context.getBean("userService", UserServiceImp.class);
        User user1 = new User("Danylo", "Hlynskyi", "danylohlynsky@gmail.com", "1111", 17, Role.admin);
        userService.saveUser(user1);
        User user2 = new User("name", "surname", "name.surname@gmail.com", "0000", 25, Role.user);
        userService.saveUser(user2);
        context.close();
    }
}
