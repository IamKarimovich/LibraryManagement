package DayDayApplications.org.LibraryManagement.dataAccess;

import DayDayApplications.org.LibraryManagement.entities.Fine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FineRepository extends JpaRepository<Fine,Long> {
}
