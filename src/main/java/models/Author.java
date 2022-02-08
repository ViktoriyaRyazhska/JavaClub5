package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "authors")
public class Author {
    public Author(){ }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstname;
    private String lastname;

    // list of main books ?
    /*
    @OneToMany
    private List<Book> mainBooks;
    */

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "books_authors",
            joinColumns = { @JoinColumn(name = "author_id") },
            inverseJoinColumns = { @JoinColumn(name = "book_id") }
    )
    private List<Book> coBooks;
}
