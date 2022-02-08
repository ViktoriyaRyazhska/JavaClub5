package services.interfaces;

public interface Service <T> {
    void saveUser(T user);
    void deleteUser(T user);
    void updateUser(T user);
}
