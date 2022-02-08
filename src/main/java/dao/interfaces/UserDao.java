package dao.interfaces;

import models.User;

public interface UserDao extends Dao<User> {
    User findById(int id);
}
