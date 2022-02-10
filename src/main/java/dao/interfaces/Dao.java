package dao.interfaces;

public interface Dao<T> {
    void save(T entity);
    void update(T entity);
    void delete(T entity);
}