package az.xazar.msinquiry.model;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@Data
@ApiModel("Day Off Data")
public class DayOffDto {
    private Long id;
    private Long userId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private DayOffStatus status;
    private DayOffType type;
    private String result;
    private boolean isDeleted;

}
