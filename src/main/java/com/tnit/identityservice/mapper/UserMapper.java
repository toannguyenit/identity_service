package com.tnit.identityservice.mapper;

import com.tnit.identityservice.dto.request.UserCreationRequest;
import com.tnit.identityservice.dto.request.UserUpdateRequest;
import com.tnit.identityservice.dto.respone.UserResponse;
import com.tnit.identityservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);

}
