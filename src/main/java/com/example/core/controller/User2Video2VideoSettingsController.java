package com.example.core.controller;

import com.example.core.controller.DTO.User2Video2VideoSettingsDTO;
import com.example.core.mapper.User2Video2VideoSettingsMapper;
import com.example.core.service.User2Video2VideoSettingsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/core/user-settings")
public class User2Video2VideoSettingsController {
    @Autowired
    private User2Video2VideoSettingsService user2Video2VideoSettingsService;
    @Autowired
    private User2Video2VideoSettingsMapper user2Video2VideoSettingsMapper;

    @PostMapping
    public ResponseEntity<String> addUserVideoSettings(@RequestBody User2Video2VideoSettingsDTO user2Video2VideoSettingsDTO) {
        user2Video2VideoSettingsService.saveUserSettings(
                user2Video2VideoSettingsMapper.dtoToUser2Video2VideoSettings(user2Video2VideoSettingsDTO));
        return new ResponseEntity<>(
                "",
                HttpStatus.CREATED
        );
    }
}
