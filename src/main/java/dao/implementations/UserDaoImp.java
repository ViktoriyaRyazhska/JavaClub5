package dao.implementations;

import dao.interfaces.UserDao;
import models.User;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImp extends DaoImp<User> implements UserDao {
    // !!!
    public User findById(int id) {
        return new User();
    }
}
