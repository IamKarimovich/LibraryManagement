package DayDayApplications.org.LibraryManagement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "borrowed_books")
@AllArgsConstructor
@NoArgsConstructor
public class BorrowedBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @Column(name = "borrow_date", nullable = false)
    private Date borrowDate;

    @Column(name = "due_date", nullable = false)
    private Date dueDate;

    @Column(name = "return_date")
    private Date returnDate;

    // Getters and Setters
}

