package DayDayApplications.org.LibraryManagement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
//
//GET /api/books: Get a list of all books.
//        GET /api/books/{id}: Get details of a specific book by ID.
//        POST /api/books: Add a new book.
//        PUT /api/books/{id}: Update details of a specific book by ID.
//        DELETE /api/books/{id}: Delete a specific book by ID.

@Entity
@Table(name = "books")
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String title;

    @Column(nullable = false, length = 255)
    private String author;

    @Column(nullable = false, unique = true, length = 20)
    private String isbn;

    @Column(name = "published_date")
    private Date publishedDate;

    @Column(nullable = false)
    private int quantity;

    @OneToMany(mappedBy = "book")
    private List<BorrowedBook> borrowedBooks;

    @OneToMany(mappedBy = "book")
    private List<Fine> fines;

    public Book() {
    }

    // Getters and Setters
}

