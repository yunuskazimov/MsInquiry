package az.xazar.msinquiry.util;

import az.xazar.msinquiry.entity.DayOffEntity;
import az.xazar.msinquiry.model.exception.DayOffErrorCodes;
import az.xazar.msinquiry.model.exception.DayOffNotFoundException;
import az.xazar.msinquiry.repository.DayOffRepository;
import org.springframework.stereotype.Component;

@Component
public class DayOffUtil {
private final DayOffRepository dayOffRepository;

    public DayOffUtil(DayOffRepository dayOffRepository) {
        this.dayOffRepository = dayOffRepository;
    }
    public DayOffEntity findDayOff(Long id){
        return dayOffRepository.findById(id)
                .orElseThrow(()->new DayOffNotFoundException(DayOffErrorCodes.NOT_FOUND));
    }
}
