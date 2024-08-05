package com.tnit.identityservice.dto.request;

import com.tnit.identityservice.validator.DobContraint;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    @Size(min = 3, message = "USERNAME_INVALID")
    String username;
    @Size(min = 8, message = "PASSWORD_INVALID")
    String password;
    String firstname;
    String lastname;

    @DobContraint(min = 2, message = "INVALID_DOB")
    LocalDate dob;

}
