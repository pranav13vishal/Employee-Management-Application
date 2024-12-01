package GUVI.Project.Mini1.Model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(
    description = "UserDto Model Information"
)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    @Schema(description = "Employee First Name")
    @NotEmpty(message = "firstName should not be empty")
    private String firstName;
    @Schema(description = "Employee Last Name")
    @NotEmpty(message = "lastName should not be empty")
    private String lastName;
    @Schema(description = "Employee Working Department")
    @NotEmpty(message = "department should not be empty")
    private String department;
    @Schema(description = "Employee Salary ")
    private Integer salary;
    @Schema(description = "Employee Email")
    @NotEmpty(message = "email should not be empty")
    @Email(message = "Email should be valid")
    private String email;
    @Schema(description = "Employee Phone Number")
    @NotEmpty(message = "Phone number should not be empty")
    @Pattern(
            regexp = "^[0-9]{10}$",
            message = "Phone number must be 10 digits long"
    )
    private String phoneNumber;
    @Schema(description = "Employee Address")
    @NotEmpty(message = "address should not be empty")
    private String address;
    @Schema(description = "Employee Hired Date")
    @NotEmpty(message = "hireDate should not be empty")
    private String hireDate;
}