package com.example.core.controller;

import com.example.core.DTO.VideoDTO;
import com.example.core.service.VideoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/video")
public class VideoController {
    private final VideoService videoService;

    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("/video/all")
    public List<VideoDTO> getAllVideos(){
        return videoService.getAll();
    }
}
