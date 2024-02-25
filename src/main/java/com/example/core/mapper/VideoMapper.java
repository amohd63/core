package com.example.core.mapper;

import com.example.core.controller.DTO.CreateVideoRequest;
import com.example.core.controller.DTO.VideoDTO;
import com.example.core.model.Video;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VideoMapper {
    VideoDTO videoToVideoDTO(Video video);

    Video videoDTOToVideo(VideoDTO videoDTO);

    Video videoRequestToVideo(CreateVideoRequest videoRequest);

    List<VideoDTO> videosToVideoDTOs(List<Video> videos);
}
