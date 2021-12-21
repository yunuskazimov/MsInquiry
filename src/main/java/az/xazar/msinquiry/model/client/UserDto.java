package az.xazar.msinquiry.model.client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    //TODO -> search that!! is that true???

    private Long userId;
    private String name;
    private String surname;
    private String fatherName;
    private LocalDate birthday;
    private String position;
    private String department;
    private String phoneNumber;
}
