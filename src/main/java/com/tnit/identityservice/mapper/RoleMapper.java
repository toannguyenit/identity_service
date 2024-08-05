package com.tnit.identityservice.mapper;

import com.tnit.identityservice.dto.request.RoleRequest;
import com.tnit.identityservice.dto.respone.RoleResponse;
import com.tnit.identityservice.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);


}
