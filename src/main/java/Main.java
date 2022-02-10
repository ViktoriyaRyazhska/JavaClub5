import config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import models.*;
import services.implementations.*;
import services.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserService userService = context.getBean("userServiceImp", UserServiceImp.class);
        AuthorService authorService = context.getBean("authorServiceImp", AuthorServiceImp.class);
        BookService bookService = context.getBean("bookServiceImp", BookServiceImp.class);

        User user1 = new User("Danylo", "Hlynskyi", "danylohlynsky@gmail.com", "1111", 17, new Role(RoleEnum.ADMIN));
        userService.saveUser(user1);
        User user2 = new User("name", "surname", "name.surname@gmail.com", "0000", 25, new Role(RoleEnum.USER));
        userService.saveUser(user2);
        userService.saveUser(user2);

        Author author = new Author("Dan", "Brown");
        authorService.saveAuthor(author);
        Author author1 = new Author("Taras", "Shevchenko");
        authorService.saveAuthor(author1);

        Book book = new Book("Origin", 20);
        List<Author> coAuthors = new ArrayList<>();
        coAuthors.add(author1);
        book.setCoAuthors(coAuthors);
        book.setMainAuthor(author);
        bookService.saveBook(book);


        User foundUser = userService.findById(1);
        System.out.println(foundUser.getFirstname() + " " + foundUser.getLastname());
        context.close();
    }
}
