package DayDayApplications.org.LibraryManagement.controller;

import DayDayApplications.org.LibraryManagement.business.abstracts.BookService;
import DayDayApplications.org.LibraryManagement.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping
    public List<Book> getAllBooks()
    {
        return service.getAllBooks();
    }




}
