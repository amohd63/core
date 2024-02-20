package com.example.core.controller;

import com.example.core.controller.DTO.VideoDTO;
import com.example.core.mapper.VideoDTOMapper;
import com.example.core.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/video")

public class VideoController {
    private final VideoService videoService;
    private final VideoDTOMapper videoDTOMapper;

    @GetMapping("/list")
    public List<VideoDTO> getAllVideos(){
        return videoService.getAll().stream().map(
                videoDTOMapper::videoToVideoDTO
        ).collect(Collectors.toList());
    }

    @GetMapping(path = "/search", params = "title")
    public VideoDTO getVideoByTitle(@RequestParam(value = "title") String title){
        return videoDTOMapper.videoToVideoDTO(
                videoService.getVideoByTitle(title)
        );
    }
}
