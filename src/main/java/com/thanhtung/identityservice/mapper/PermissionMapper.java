package com.thanhtung.identityservice.mapper;

import org.mapstruct.Mapper;

import com.thanhtung.identityservice.dto.request.PermissionRequest;
import com.thanhtung.identityservice.dto.response.PermissionResponse;
import com.thanhtung.identityservice.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
