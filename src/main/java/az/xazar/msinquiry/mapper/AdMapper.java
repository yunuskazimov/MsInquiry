package az.xazar.msinquiry.mapper;

import az.xazar.msinquiry.entity.AdEntity;
import az.xazar.msinquiry.model.Ad.AdDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper
public interface AdMapper {

    AdMapper INSTANCE = Mappers.getMapper(AdMapper.class);

    AdDto entityToDto(AdEntity entity);

//    @Mapping(target = "createdAt", ignore = true)
//    @Mapping(target = "updatedAt", ignore = true)
//    AdEntity dtoToEntity(AdDto dto);
}
