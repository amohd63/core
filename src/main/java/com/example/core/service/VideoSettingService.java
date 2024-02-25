package com.example.core.service;

import com.example.core.model.VideoSetting;
import com.example.core.repository.VideoSettingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VideoSettingService {
    private final VideoSettingRepository videoSettingRepository;

    public List<VideoSetting> getAllSettings() {
        return videoSettingRepository.findAll();
    }
}
