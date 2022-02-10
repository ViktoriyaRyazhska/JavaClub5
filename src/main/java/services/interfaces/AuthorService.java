package services.interfaces;

import models.Author;

public interface AuthorService {
        void saveAuthor(Author author);
        void deleteAuthor(Author author);
        void updateAuthor(Author author);
}
