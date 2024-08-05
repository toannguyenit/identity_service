package com.tnit.identityservice.repository;

import com.tnit.identityservice.entity.Permission;
import com.tnit.identityservice.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
}
