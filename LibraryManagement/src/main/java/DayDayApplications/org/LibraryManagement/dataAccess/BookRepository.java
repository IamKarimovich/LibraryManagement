package DayDayApplications.org.LibraryManagement.dataAccess;

import DayDayApplications.org.LibraryManagement.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {



}
