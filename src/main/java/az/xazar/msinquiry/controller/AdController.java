package az.xazar.msinquiry.controller;

import az.xazar.msinquiry.model.Ad.AdDto;
import az.xazar.msinquiry.service.AdService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ads")
public class AdController {
    private final AdService adService;
    private static final Logger logger = LoggerFactory.getLogger(AdController.class);

    public AdController(AdService adService) {
        this.adService = adService;
    }

    @PostMapping
    public ResponseEntity<AdDto> createAd (@RequestBody AdDto adDto){
        logger.info("Log Controller Ad : create Dto ->",adDto.toString());
        return new ResponseEntity<>(adService.createAd(adDto), HttpStatus.CREATED);
    }

    @GetMapping
    public List<AdDto> getAds (){
        logger.info("Log Controller Ad : get Dtos ->");
        return adService.getAds();
    }

}
