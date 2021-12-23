package az.xazar.msinquiry.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@Data
@ApiModel("Day Off Data")
public class DayOffDto {
    @ApiModelProperty("Unique id of Day Off. Not used in post requests.")
    private Long id;

    @ApiModelProperty(value = "Enter valid User ID of Day Off.", example = "1")
    private Long userId;

    @ApiModelProperty(value = "Enter valid Day Off name.", example = "Butun gun")
    private String name;

    @ApiModelProperty(value = "Start Date of Day Off.", example = "[2021,12,21,14,45,36,777973000]")
    private LocalDateTime startDate;

    @ApiModelProperty(value = "End Date of Day Off.", example = "[2021,12,25,14,45,36,777973000]")
    private LocalDateTime endDate;

    @ApiModelProperty(value = "Enter Day Off Status", example = "waiting")
    private DayOffStatus status;

    @ApiModelProperty(value = "Day Off actual type", example = "full_day")
    private DayOffType type;

    @ApiModelProperty(value = "Enter valid Rresult for Day Off", example = "HR Gondermesi")
    private String result;

    @ApiModelProperty(value = "Day Off deletion status", example = "false")
    private boolean isDeleted;

}
