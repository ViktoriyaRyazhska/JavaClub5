package services.implementations;

import dao.interfaces.BookDao;
import models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.interfaces.BookService;


@Service
public class BookServiceImp implements BookService {
    private BookDao bookDao;

    public BookServiceImp() {
    }

    @Autowired
    public BookServiceImp(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void saveBook(Book book) {
        bookDao.save(book);
    }

    public void deleteBook(Book book) {
        bookDao.delete(book);
    }

    public void updateBook(Book book) {
        bookDao.update(book);
    }
}
