package services.implementations;

import dao.interfaces.UserDao;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.interfaces.UserService;


@Service
public class UserServiceImp implements UserService {
    private UserDao usersDao;

    public UserServiceImp() {
    }

    @Autowired
    public UserServiceImp(UserDao usersDao) {
        this.usersDao = usersDao;
    }

    public User findUser(int id) {
        return usersDao.findById(id);
    }

    public void saveUser(User user) {
        usersDao.save(user);
    }

    public void deleteUser(User user) {
        usersDao.delete(user);
    }

    public void updateUser(User user) {
        usersDao.update(user);
    }

}
