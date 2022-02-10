package dao.implementations;

import dao.interfaces.UserDao;
import models.User;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import utils.HibernateSessionFactoryUtil;


@Repository
public class UserDaoImp extends DaoImp<User> implements UserDao {
    public User findById(long id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        User user = session.get(User.class, id);
        session.close();
        return user;
    }
}
