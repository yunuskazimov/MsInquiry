package az.xazar.msinquiry.service;

import az.xazar.msinquiry.entity.DayOffEntity;
import az.xazar.msinquiry.model.DayOffDto;

import java.util.List;

public interface DayOffService {
    DayOffDto createDayOff(DayOffDto dayOffDto);

    DayOffDto editDayOff(DayOffDto dayOffDto);

    DayOffDto getDayOffById(Long id);

    List<DayOffDto> getDayOffs();

    List<DayOffDto> getDayOffsByUserId(Long userid);

    void deleteDayOff(Long id);
}
