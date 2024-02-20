package com.example.core.service;

import com.example.core.repository.VideoSettingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VideoSettingService {
    private final VideoSettingRepository videoSettingRepository;

}
