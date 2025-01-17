package com.thanhtung.identityservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.thanhtung.identityservice.dto.request.UserCreationRequest;
import com.thanhtung.identityservice.dto.request.UserUpdateRequest;
import com.thanhtung.identityservice.dto.response.UserResponse;
import com.thanhtung.identityservice.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
