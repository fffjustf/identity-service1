package com.example.identityService.mapper;

import org.mapstruct.Mapper;

import com.example.identityService.dto.request.PermissionRequest;
import com.example.identityService.dto.response.PermissionResponse;
import com.example.identityService.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
