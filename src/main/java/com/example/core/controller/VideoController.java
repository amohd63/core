package com.example.core.controller;

import com.example.core.controller.DTO.VideoDTO;
import com.example.core.mapper.VideoDTOMapper;
import com.example.core.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/core/v1/videos")
public class VideoController {
    @Autowired
    private VideoService videoService;
    @Autowired
    private VideoDTOMapper videoDTOMapper;

    @GetMapping
    public List<VideoDTO> getAllVideos(){
        return videoService.getAll().stream().map(
                videoDTOMapper::videoToVideoDTO
        ).collect(Collectors.toList());
    }

    @GetMapping(path = "/{title}")
    public VideoDTO getVideoByTitle(@PathVariable String title){
        return videoDTOMapper.videoToVideoDTO(
                videoService.getVideoByTitle(title)
        );
    }

//    @GetMapping(params = "title")
//    public VideoDTO getVideoByTitle(@RequestParam(value = "title") String title){
//        return videoDTOMapper.videoToVideoDTO(
//                videoService.getVideoByTitle(title)
//        );
//    }
}
