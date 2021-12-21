package az.xazar.msinquiry.mapper;

import az.xazar.msinquiry.entity.DayOffEntity;
import az.xazar.msinquiry.model.DayOffDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
public interface DayOffMapper {
    AdMapper INSTANCE = Mappers.getMapper(AdMapper.class);

    @Mapping(target = "createdAt",ignore = true)
    @Mapping(target = "updatedAt",ignore = true)
    @Mapping(target = "isDeleted", source = "deleted")
    DayOffEntity dtoToEntity(DayOffDto dto);


    DayOffDto entityToDto(DayOffEntity entity);

    List<DayOffDto> entitiesToDto (List<DayOffEntity> entityList);
}
