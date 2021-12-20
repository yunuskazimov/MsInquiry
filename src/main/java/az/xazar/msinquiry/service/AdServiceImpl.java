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
        return null;
    }

    @Override
    public AdDto getAd(Long id) {
        return null;
    }

    @Override
    public List<AdDto> getAds() {
        return adMapper.entitiesToDtos(adRepository.findAll());
    }

    @Override
    public List<AdDto> getAdsByUserId(Long userid) {
        return null;
    }

    @Override
    public void deleteAd(Long Id) {

    }
}
