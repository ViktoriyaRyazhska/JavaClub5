package services.interfaces;

import models.User;
import org.springframework.stereotype.Service;

public interface UserService {
    void saveUser(User user);
    void deleteUser(User user);
    void updateUser(User user);
}
