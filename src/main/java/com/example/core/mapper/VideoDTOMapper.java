package com.example.core.mapper;

import com.example.core.controller.DTO.VideoDTO;
import com.example.core.model.Video;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface VideoDTOMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "title", source = "title")
    @Mapping(target = "url", source = "url")
    @Mapping(target = "length", source = "length")
    @Mapping(target = "video_settings", source = "video_settings")
    VideoDTO videoToVideoDTO(Video video);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "title", target = "title")
    @Mapping(source = "url", target = "url")
    @Mapping(source = "length", target = "length")
    @Mapping(source = "video_settings", target = "video_settings")
    Video videoDTOToVideo(VideoDTO videoDTO);
}
