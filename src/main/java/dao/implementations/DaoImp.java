package dao.implementations;

import dao.interfaces.Dao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.postgresql.shaded.com.ongres.scram.common.util.Preconditions;
import utils.HibernateSessionFactoryUtil;

import java.io.Serializable;

public class DaoImp<T> implements Dao<T> {

    public void save(T entity) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(entity);
        tx1.commit();
        session.close();
    }

    public void update(T entity) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(entity);
        tx1.commit();
        session.close();
    }

    public void delete(T entity) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(entity);
        tx1.commit();
        session.close();
    }


}
