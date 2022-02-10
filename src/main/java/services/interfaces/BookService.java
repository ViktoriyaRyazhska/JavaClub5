package services.interfaces;

import models.Book;

public interface BookService {
    void saveBook(Book book);
    void deleteBook(Book book);
    void updateBook(Book book);
}
