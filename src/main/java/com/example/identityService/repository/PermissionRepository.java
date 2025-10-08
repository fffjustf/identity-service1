package com.example.identityService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.identityService.entity.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, String> {}
