package az.xazar.msinquiry.util;

import az.xazar.msinquiry.entity.DayOffEntity;
import az.xazar.msinquiry.model.exception.DayOffErrorCodes;
import az.xazar.msinquiry.model.exception.DayOffNotFoundException;
import az.xazar.msinquiry.repository.DayOffRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DayOffUtil {
    private final DayOffRepository repo;

    public DayOffUtil(DayOffRepository repo) {
        this.repo = repo;
    }

    public DayOffEntity findDayOff(Long id) {
        return repo.findById(id)
                .orElseThrow(() ->
                        new DayOffNotFoundException(DayOffErrorCodes.NOT_FOUND));
    }

    public List<DayOffEntity> findAllByUserId(Long userId) {

        //TODO burda exception atmir bos array gelir. fix it!!!!

        return repo.findAllByUserId(userId)
                .orElseThrow(() ->
                        new DayOffNotFoundException(DayOffErrorCodes.NOT_FOUND));
    }
}
