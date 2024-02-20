package com.example.core.controller;

import com.example.core.controller.DTO.VideoDTO;
import com.example.core.mapper.VideoDTOMapper;
import com.example.core.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/video")


public class VideoController {
    @Autowired
    private VideoService videoService;
    @Autowired
    private VideoDTOMapper videoDTOMapper;

    @GetMapping("/all")
    public List<VideoDTO> getAllVideos(){
        return videoService.getAll().stream().map(
                videoDTOMapper::videoToVideoDTO
        ).collect(Collectors.toList());
    }
}
