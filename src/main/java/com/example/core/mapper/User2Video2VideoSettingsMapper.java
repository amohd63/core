package com.example.core.mapper;

import com.example.core.controller.DTO.User2Video2VideoSettingsDTO;
import com.example.core.model.User2Video2VideoSettings;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface User2Video2VideoSettingsMapper {
    User2Video2VideoSettings dtoToUser2Video2VideoSettings(User2Video2VideoSettingsDTO user2Video2VideoSettingsDTO);
}
