package DayDayApplications.org.LibraryManagement.business.abstracts;

import DayDayApplications.org.LibraryManagement.entities.Book;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

//
//GET /api/books: Get a list of all books.
//        GET /api/books/{id}: Get details of a specific book by ID.
//        POST /api/books: Add a new book.
//        PUT /api/books/{id}: Update details of a specific book by ID.
//        DELETE /api/books/{id}: Delete a specific book by ID.
public interface BookService {

    public List<Book> getAllBooks();
    public Optional<Book> getBookById(Long id);
    public ResponseEntity<Book> addBook();
    public ResponseEntity<Book> updateBook();
    public ResponseEntity<Book> deleteBook();




}
