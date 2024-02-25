package com.example.core.mapper;

import com.example.core.controller.DTO.VideoSettingDTO;
import com.example.core.model.VideoSetting;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VideoSettingMapper {
    VideoSettingDTO videoSettingToDTO(VideoSetting videoSetting);

    VideoSetting videoSettingDTOToVideoSetting(VideoSettingDTO videoSettingDTO);

    List<VideoSettingDTO> videoSettingsToVideoSettingsDTO(List<VideoSetting> videos);
}