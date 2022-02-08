package dao.interfaces;

import models.User;

import java.util.*;

public interface Dao<T> {
    void save(T t);
    void update(T t);
    void delete(T t);
}