package dao.implementations;

import dao.interfaces.AuthorDao;
import models.Author;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorDaoImp extends DaoImp<Author> implements AuthorDao { }
