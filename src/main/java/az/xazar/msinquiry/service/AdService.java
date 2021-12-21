package az.xazar.msinquiry.service;

import az.xazar.msinquiry.model.Ad.AdDto;

import java.util.List;

public interface AdService {
    AdDto createAd(AdDto adDto);

    AdDto editAd(AdDto adDto);

    AdDto getAdByid(Long id);

    List<AdDto> getAds();

    List<AdDto> getAdsByUserId(Long userid);

    void deleteAd(Long id);
}
