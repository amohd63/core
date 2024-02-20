package com.example.core.mapper;

import com.example.core.controller.DTO.VideoDTO;
import com.example.core.model.Video;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface VideoDTOMapper {
//    @Mapping(target = "vId", source = "entity.video_id")
//    @Mapping(target = "title", source = "entity.title")
//    @Mapping(target = "URL", source = "entity.url")
//    @Mapping(target = "length", source = "entity.length")
//    @Mapping(target = "sId", source = "entity.video_setting_id")
    VideoDTO videoToVideoDTO(Video video);

//    @Mapping(source = "dto.vId", target = "video_id")
//    @Mapping(source = "dto.title", target = "title")
//    @Mapping(source = "dto.URL", target = "url")
//    @Mapping(source = "dto.length", target = "length")
//    @Mapping(source = "dto.sId", target = "video_setting_id")
    Video videoDTOToVideo(VideoDTO videoDTO);
}
