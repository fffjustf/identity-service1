package com.example.identityService.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.identityService.dto.request.RoleRequest;
import com.example.identityService.dto.response.RoleResponse;
import com.example.identityService.entity.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
