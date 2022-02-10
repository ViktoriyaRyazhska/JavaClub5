package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "books")
@Getter
@Setter
public class Book {
    public Book() { }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    @Column(name = "available_amount")
    private int availableAmount;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "main_author_id", nullable = false)
    private Author mainAuthor;

    public Book(String title, int availableAmount) {
        this.title = title;
        this.availableAmount = availableAmount;
    }

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "books_authors",
            joinColumns = { @JoinColumn(name = "book_id") },
            inverseJoinColumns = { @JoinColumn(name = "author_id") }
    )
    private List<Author> coAuthors;

}
