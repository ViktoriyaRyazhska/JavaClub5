package services.implementations;

import dao.interfaces.AuthorDao;
import models.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.interfaces.AuthorService;


@Service
public class AuthorServiceImp implements AuthorService {
    private AuthorDao authorDao;

    public AuthorServiceImp() {
    }

    @Autowired
    public AuthorServiceImp(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    public void saveAuthor(Author author) {
        authorDao.save(author);
    }

    public void deleteAuthor(Author author) {
        authorDao.delete(author);
    }

    public void updateAuthor(Author author) {
        authorDao.update(author);
    }
}
