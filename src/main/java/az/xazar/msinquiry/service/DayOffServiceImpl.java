package az.xazar.msinquiry.service;

import az.xazar.msinquiry.entity.DayOffEntity;
import az.xazar.msinquiry.model.DayOffDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DayOffServiceImpl implements DayOffService {
    @Override
    public DayOffEntity createDayOff(DayOffDto dayOffDto) {
        return null;
    }

    @Override
    public DayOffEntity editDayOff(DayOffDto dayOffDto) {
        return null;
    }

    @Override
    public DayOffEntity getDayOffByid(Long id) {
        return null;
    }

    @Override
    public List<DayOffEntity> getDayOffs() {
        return null;
    }

    @Override
    public List<DayOffEntity> getDayOffsByUserId(Long userid) {
        return null;
    }

    @Override
    public void deleteDayOff(Long id) {

    }
}
