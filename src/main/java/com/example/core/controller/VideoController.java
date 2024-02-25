package com.example.core.controller;

import com.example.core.controller.DTO.CreateVideoRequest;
import com.example.core.controller.DTO.CustomVideoDTO;
import com.example.core.controller.DTO.VideoDTO;
import com.example.core.mapper.VideoMapper;
import com.example.core.model.Video;
import com.example.core.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/core/videos")
public class VideoController {
    @Autowired
    private VideoService videoService;
    @Autowired
    private VideoMapper videoMapper;

    // Add exception handling
    // When the ID is not found
    @GetMapping
    public ResponseEntity<List<VideoDTO>> getAllVideos() {
        return new ResponseEntity<>(
                videoMapper.videosToVideoDTOs(videoService.getAll()),
                HttpStatus.OK
        );
    }

    // Change title to ID
    @GetMapping(path = "/{id}")
    public ResponseEntity<VideoDTO> getVideoById(@PathVariable Integer id) {
        try {
            Video video = videoService.getVideoById(id);
            return new ResponseEntity<>(
                    videoMapper.videoToVideoDTO(video),
                    HttpStatus.OK
            );

            // use spring solution
        } catch (VideoException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<VideoDTO> deleteVideoById(@PathVariable Integer id) {
        try {
            videoService.deleteVideoById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (VideoException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path = "/longest")
    public VideoDTO findLongestVideo() {
        return videoMapper.videoToVideoDTO(videoService.findLongestVideo());
    }

    // Update
    @PutMapping
    public VideoDTO updateVideo(@RequestBody VideoDTO videoDTO) {
        return videoMapper.videoToVideoDTO(
                videoService.updateVideo(videoMapper.videoDTOToVideo(videoDTO))
        );
    }

    // CreateVideoRequest -
    // VideoDto

    // Create - done, but how to add video settings?
    @PostMapping
    public ResponseEntity<Video> addVideo(@RequestBody CreateVideoRequest videoRequest) {
        return new ResponseEntity<>(
                videoService.addVideo(videoMapper.videoRequestToVideo(videoRequest)),
                HttpStatus.CREATED
        );
    }

    @GetMapping(path = "/setting/{id}")
    public List<VideoDTO> findVideosBySettingId(@PathVariable Integer id) {
        return videoMapper.videosToVideoDTOs(videoService.findVideosBySettingId(id));
    }
}
