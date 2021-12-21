package az.xazar.msinquiry.service;

import az.xazar.msinquiry.entity.AdEntity;
import az.xazar.msinquiry.mapper.AdMapper;
import az.xazar.msinquiry.model.Ad.AdDto;
import az.xazar.msinquiry.repository.AdRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdServiceImpl implements AdService {
    private final AdRepository adRepository;
    private final AdMapper adMapper;

    public AdServiceImpl(AdRepository adRepository, AdMapper adMapper) {
        this.adRepository = adRepository;
        this.adMapper = adMapper;
    }

    @Override
    public AdDto createAd(AdDto adDto) {
        AdEntity entity = adRepository.save(adMapper.dtoToEntity(adDto));
        adDto.setId(entity.getId());
        return adDto;
    }

    @Override
    public AdDto editAd(AdDto adDto) {
        adRepository.findById(adDto.getId());
        adRepository.save(adMapper.dtoToEntity(adDto));
        return adDto;
    }

    @Override
    public AdDto getAdById(Long id) {
        return adMapper.entityToDto(adRepository.findById(id).get());
    }

    @Override
    public List<AdDto> getAds() {
        return adMapper.entitiesToDto(adRepository.findAll());
    }

    @Override
    public List<AdDto> getAdsByUserId(Long userid) {
        return adMapper.entitiesToDto(adRepository.findAllByUserId(userid));
    }

    @Override
    public void deleteAd(Long id) {
        AdEntity entity = adRepository.findById(id).get();
        entity.setDeleted(true);
        adRepository.save(entity);
    }
}
