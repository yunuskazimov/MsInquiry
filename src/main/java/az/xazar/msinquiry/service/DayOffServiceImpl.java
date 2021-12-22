package az.xazar.msinquiry.service;

import az.xazar.msinquiry.entity.DayOffEntity;
import az.xazar.msinquiry.mapper.DayOffMapper;
import az.xazar.msinquiry.model.DayOffDto;
import az.xazar.msinquiry.repository.DayOffRepository;
import az.xazar.msinquiry.util.DayOffUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DayOffServiceImpl implements DayOffService {

    private final DayOffRepository repo;
    private final DayOffMapper dayOffMapper;
    private final DayOffUtil dayOffUtil;

    public DayOffServiceImpl(DayOffRepository repo,
                             DayOffMapper dayOffMapper,
                             DayOffUtil dayOffUtil) {
        this.repo = repo;
        this.dayOffMapper = dayOffMapper;
        this.dayOffUtil = dayOffUtil;
    }

    @Override
    public DayOffDto createDayOff(DayOffDto dayOffDto) {
        DayOffEntity entity = repo.save(
                dayOffMapper.toEntity(dayOffDto));

        dayOffDto.setId(entity.getId());
        return dayOffDto;
    }

    @Override
    public DayOffDto editDayOff(DayOffDto dayOffDto) {
        getDayOffById(dayOffDto.getId());
        repo.save(dayOffMapper.toEntity(dayOffDto));
        return dayOffDto;
    }

    @Override
    public DayOffDto getDayOffById(Long id) {
        return dayOffMapper.toDto(
                dayOffUtil.findDayOff(id));

    }

    @Override
    public List<DayOffDto> getDayOffs() {
        return dayOffMapper.toDtos(
                repo.findAll());
    }

    @Override
    public List<DayOffDto> getDayOffsByUserId(Long userid) {
        return dayOffMapper.toDtos(
                dayOffUtil.findAllByUserId(userid));
    }

    @Override
    public void deleteDayOff(Long id) {
        DayOffEntity entity = dayOffUtil.findDayOff(id);
        entity.setDeleted(true);
        repo.save(entity);
    }
}
