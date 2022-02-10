package dao.implementations;

import dao.interfaces.BookDao;
import models.Book;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImp extends DaoImp<Book> implements BookDao { }
