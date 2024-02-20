package com.example.core.mapper;

import com.example.core.controller.DTO.VideoDTO;
import com.example.core.model.Video;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
public class VideoDTOMapper {

    public VideoDTO videoToVideoDTO(Video video){
        return new VideoDTO(
                video.getVideo_id(), video.getTitle(), video.getUrl(), video.getLength()
        );
    }

    public Video videoDTOToVideo(VideoDTO videoDTO){
        return new Video(
                videoDTO.getVId(), videoDTO.getTitle(), videoDTO.getURL(), videoDTO.getLength(), null
        );
    }
}