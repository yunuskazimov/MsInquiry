package az.xazar.msinquiry.service;

import az.xazar.msinquiry.entity.AdEntity;
import az.xazar.msinquiry.mapper.AdMapper;
import az.xazar.msinquiry.model.Ad.AdDto;
import az.xazar.msinquiry.repository.AdRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdServiceImpl implements AdService {
    private final AdRepository repo;
    private final AdMapper adMapper;

    public AdServiceImpl(AdRepository repo,
                         AdMapper adMapper) {
        this.repo = repo;
        this.adMapper = adMapper;
    }

    @Override
    public AdDto createAd(AdDto adDto) {
        AdEntity entity = repo.save(
                adMapper.toEntity(adDto));
        adDto.setId(entity.getId());
        return adDto;
    }

    @Override
    public AdDto editAd(AdDto adDto) {
        repo.findById(adDto.getId());
        repo.save(adMapper.toEntity(adDto));
        return adDto;
    }

    @Override
    public AdDto getAdById(Long id) {
        return adMapper.toDto(
                repo.findById(id).get());
    }

    @Override
    public List<AdDto> getAds() {
        return adMapper.toDtos(
                repo.findAll());
    }

    @Override
    public List<AdDto> getAdsByUserId(Long userid) {
        return adMapper.toDtos(
                repo.findAllByUserId(userid));
    }

    @Override
    public void deleteAd(Long id) {
        AdEntity entity = repo.findById(id).get();
        entity.setDeleted(true);
        repo.save(entity);
    }
}
