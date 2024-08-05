package com.tnit.identityservice.mapper;

import com.tnit.identityservice.dto.request.PermissionRequest;
import com.tnit.identityservice.dto.respone.PermissionResponse;
import com.tnit.identityservice.entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

  PermissionResponse toPermissionResponse(Permission permission);


}
