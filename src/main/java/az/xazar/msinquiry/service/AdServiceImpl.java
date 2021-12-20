package az.xazar.msinquiry.service;

import az.xazar.msinquiry.model.Ad.AdDto;
import az.xazar.msinquiry.repository.AdRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdServiceImpl implements AdService {
    private final AdRepository adRepository;

    public AdServiceImpl(AdRepository adRepository) {
        this.adRepository = adRepository;
    }

    @Override
    public AdDto createAd(AdDto adDto) {
        return null;
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
        return null;
    }

    @Override
    public List<AdDto> getAdsByUserId(Long userid) {
        return null;
    }

    @Override
    public void deleteAd(Long Id) {

    }
}
