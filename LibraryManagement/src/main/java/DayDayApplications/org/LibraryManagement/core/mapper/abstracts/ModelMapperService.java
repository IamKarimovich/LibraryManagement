package DayDayApplications.org.LibraryManagement.core.mapper.abstracts;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {

    ModelMapper forResponse();

    ModelMapper forRequest();
}
