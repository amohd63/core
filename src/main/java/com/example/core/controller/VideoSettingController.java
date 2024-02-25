package com.example.core.controller;

import com.example.core.controller.DTO.VideoSettingDTO;
import com.example.core.mapper.VideoSettingMapper;
import com.example.core.service.VideoSettingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/core/settings")
public class VideoSettingController {
    @Autowired
    private VideoSettingService videoSettingService;
    @Autowired
    private VideoSettingMapper videoSettingMapper;

    @GetMapping
    public ResponseEntity<List<VideoSettingDTO>> getAllSettings() {
        return new ResponseEntity<>(
                videoSettingMapper.videoSettingsToVideoSettingsDTO(videoSettingService.getAllSettings()),
                HttpStatus.OK
        );
    }


}
