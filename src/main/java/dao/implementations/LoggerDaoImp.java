package dao.implementations;

import dao.interfaces.LoggerDao;
import models.Logger;
import org.springframework.stereotype.Repository;

@Repository
public class LoggerDaoImp extends DaoImp<Logger> implements LoggerDao { }
