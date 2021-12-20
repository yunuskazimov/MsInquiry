package az.xazar.msinquiry.model.Ad;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("Advertisement Data")
public class AdDto {
    @ApiModelProperty("Unique id of Ad. Not used in post requests.")
    private Long id;

    @ApiModelProperty(value = "Enter valid User ID of Ad.", example = "1")
    private Long userId;

    @ApiModelProperty(value = "Enter valid Ad name.",example = "Bayram")
    private String name;

    @ApiModelProperty(value = "Enter valid description for Ad",example = "31 dekabr Milli Hemreylik gunudur")
    private String description;

    @ApiModelProperty(value = "Ad actual type",example = "ACCEPT")
    private AdTypeEnum adType;

    @ApiModelProperty(value = "Ad deletion status",example = "false")
    private String isDeleted;

    @ApiModelProperty(value = "Enter Ad Status",example = "ACTIVE")
    private AdStatusEnum status;
}
