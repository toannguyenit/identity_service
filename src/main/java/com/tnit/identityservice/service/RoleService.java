package com.tnit.identityservice.service;

import com.tnit.identityservice.dto.request.RoleRequest;
import com.tnit.identityservice.dto.respone.RoleResponse;
import com.tnit.identityservice.entity.Role;
import com.tnit.identityservice.mapper.RoleMapper;
import com.tnit.identityservice.repository.PermissionRepository;
import com.tnit.identityservice.repository.RoleRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class RoleService {

    RoleRepository roleRepository;
    RoleMapper roleMapper;
    PermissionRepository permissionRepository;

    public RoleResponse create(RoleRequest request) {
        Role role = roleMapper.toRole(request);

        var permissions = permissionRepository.findAllById(request.getPermissions());

        role.setPermissions(new HashSet<>(permissions));


        role = roleRepository.save(role);

        return roleMapper.toRoleResponse(role);
    }


    public List<RoleResponse> getAll() {

        var role = roleRepository.findAll();

        return role.stream().map(roleMapper::toRoleResponse).toList();
    }

    public void delete(String role) {
        roleRepository.deleteById(role);
    }
}
