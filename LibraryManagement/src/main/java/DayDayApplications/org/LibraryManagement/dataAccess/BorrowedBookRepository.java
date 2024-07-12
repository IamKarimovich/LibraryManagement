package DayDayApplications.org.LibraryManagement.dataAccess;

import DayDayApplications.org.LibraryManagement.entities.BorrowedBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowedBookRepository extends JpaRepository<BorrowedBook,Long> {
}
