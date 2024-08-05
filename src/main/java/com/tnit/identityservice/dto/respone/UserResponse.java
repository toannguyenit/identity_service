package com.tnit.identityservice.dto.respone;

import com.tnit.identityservice.entity.Role;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {
    String id;
    String username;
//    String password;
    String firstname;
    String lastname;
    LocalDate dob;
    Set<RoleResponse> roles;
}
