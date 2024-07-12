package DayDayApplications.org.LibraryManagement.business.concretes;

import DayDayApplications.org.LibraryManagement.business.abstracts.BookService;
import DayDayApplications.org.LibraryManagement.dataAccess.BookRepository;
import DayDayApplications.org.LibraryManagement.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookManager implements BookService {

    @Autowired
    private BookRepository repository;

    @Override
    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    @Override
    public Optional<Book> getBookById(Long id) {
        return repository.findById(id);
    }

    @Override
    public ResponseEntity<Book> addBook() {
        return null;
    }

    @Override
    public ResponseEntity<Book> updateBook() {
        return null;
    }

    @Override
    public ResponseEntity<Book> deleteBook() {
        return null;
    }
}
