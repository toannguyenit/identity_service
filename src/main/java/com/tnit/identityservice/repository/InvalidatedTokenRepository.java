package com.tnit.identityservice.repository;

import com.tnit.identityservice.entity.InvalidatedToken;
import com.tnit.identityservice.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvalidatedTokenRepository extends JpaRepository<InvalidatedToken, String> {
}
