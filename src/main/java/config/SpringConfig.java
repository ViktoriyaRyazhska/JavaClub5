package config;

import dao.implementations.UserDaoImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import services.implementations.UserServiceImp;
import services.interfaces.UserService;

@Configuration
@ComponentScan(basePackages = {"dao", "services"})
public class SpringConfig { }