package config;

import dao.implementations.DaoImp;
import dao.implementations.UserDaoImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import services.implementations.ServiceImp;
import services.implementations.UserServiceImp;

@Configuration
public class SpringConfig {
    @Bean
    public UserDaoImp userDaoImp() {
        return new UserDaoImp();
    }
    @Bean
    public UserServiceImp userService() {
        return new UserServiceImp(userDaoImp());
    }
    @Bean
    public DaoImp daoImp() {
        return new DaoImp();
    }
    @Bean
    public ServiceImp service() {
        return new ServiceImp(daoImp());
    }
}