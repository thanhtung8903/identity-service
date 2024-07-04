package com.thanhtung.identityservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.thanhtung.identityservice.dto.request.RoleRequest;
import com.thanhtung.identityservice.dto.response.RoleResponse;
import com.thanhtung.identityservice.entity.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}