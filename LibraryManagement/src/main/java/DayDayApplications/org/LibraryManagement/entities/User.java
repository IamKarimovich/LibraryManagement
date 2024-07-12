package DayDayApplications.org.LibraryManagement.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String username;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false, length = 10)
    private String role;

    @OneToMany(mappedBy = "user")
    private List<BorrowedBook> borrowedBooks;

    @OneToMany(mappedBy = "user")
    private List<Fine> fines;

    // Getters and Setters
}
