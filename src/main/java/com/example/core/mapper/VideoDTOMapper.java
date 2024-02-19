package com.example.core.mapper;
import com.example.core.DTO.VideoDTO;
import com.example.core.model.Video;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.Mapping;


@Component
public class VideoDTOMapper {

    public VideoDTO videoToVideoDTO(Video video){
        return new VideoDTO();
    }

    public Video videoDTOToVideo(VideoDTO videoDTO){
        return new Video();
    }
}
