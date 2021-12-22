package az.xazar.msinquiry.controller;

import az.xazar.msinquiry.model.DayOffDto;
import az.xazar.msinquiry.service.DayOffService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dayoff")
public class DayOffController {
    private final DayOffService service;

    public DayOffController(DayOffService service) {
        this.service = service;
    }

    @PostMapping()
    public ResponseEntity<DayOffDto> createDayOff(@RequestBody DayOffDto dto) {
        return new ResponseEntity<>(
                service.createDayOff(dto), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DayOffDto> editDayOff(@RequestBody DayOffDto dto,
                                                @PathVariable Long id) {
        dto.setId(id);
        return new ResponseEntity<>(
                service.editDayOff(dto), HttpStatus.OK);
    }

    @GetMapping()
    public List<DayOffDto> getDayOffs() {
        return service.getDayOffs();
    }

    @GetMapping("id/{id}")
    public DayOffDto getById(@PathVariable Long id) {
        return service.getDayOffById(id);
    }

    @GetMapping("/uid/{uId}")
    public List<DayOffDto> getByUserId(@PathVariable Long uId) {
        return service.getDayOffsByUserId(uId);
    }

    @DeleteMapping("/{id}")
    public void deleteDayOff(@PathVariable Long id) {
        service.deleteDayOff(id);
    }
}
