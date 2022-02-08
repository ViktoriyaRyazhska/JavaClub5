package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {
    public Book() { }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    @Column(name = "available_amount")
    private int availableAmount;

    // main author ?
    /*
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "main_author_id", nullable = false)
    private Author mainAuthor;
    */

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "books_authors",
            joinColumns = { @JoinColumn(name = "book_id") },
            inverseJoinColumns = { @JoinColumn(name = "author_id") }
    )
    private List<Author> coAuthors;
}
