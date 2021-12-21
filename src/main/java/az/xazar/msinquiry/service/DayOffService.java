package az.xazar.msinquiry.service;

import az.xazar.msinquiry.entity.DayOffEntity;
import az.xazar.msinquiry.model.DayOffDto;

import java.util.List;

public interface DayOffService {
    DayOffEntity createDayOff(DayOffDto dayOffDto);

    DayOffEntity editDayOff(DayOffDto dayOffDto);

    DayOffEntity getDayOffById(Long id);

    List<DayOffEntity> getDayOffs();

    List<DayOffEntity> getDayOffsByUserId(Long userid);

    void deleteDayOff(Long id);
}
