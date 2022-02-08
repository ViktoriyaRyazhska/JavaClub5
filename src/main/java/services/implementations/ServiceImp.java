package services.implementations;

import dao.interfaces.Dao;
import dao.interfaces.UserDao;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import services.interfaces.Service;

public class ServiceImp<T> implements Service<T> {
    private Dao<T> dao;

    public ServiceImp() {
    }

    @Autowired
    public ServiceImp(Dao<T> dao) {
        this.dao = dao;
    }

    public void saveUser(T user) {
        dao.save(user);
    }

    public void deleteUser(T user) {
        dao.delete(user);
    }

    public void updateUser(T user) {
        dao.update(user);
    }
}
