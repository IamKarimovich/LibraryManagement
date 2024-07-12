package DayDayApplications.org.LibraryManagement.dataAccess;

import DayDayApplications.org.LibraryManagement.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
