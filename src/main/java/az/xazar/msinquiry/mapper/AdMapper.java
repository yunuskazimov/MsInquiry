package az.xazar.msinquiry.mapper;

import az.xazar.msinquiry.entity.AdEntity;
import az.xazar.msinquiry.model.Ad.AdDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
public interface AdMapper {

    AdMapper INSTANCE = Mappers.getMapper(AdMapper.class);

    AdDto entityToDto(AdEntity entity);

    List<AdDto> entitiesToDtos(List<AdEntity> entities);

    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    AdEntity dtoToEntity(AdDto dto);
}
