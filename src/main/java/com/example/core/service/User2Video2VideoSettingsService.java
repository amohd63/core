package com.example.core.service;

import com.example.core.model.User2Video2VideoSettings;
import com.example.core.repository.User2Video2VideoSettingsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class User2Video2VideoSettingsService {
    private final User2Video2VideoSettingsRepository user2Video2VideoSettingsRepository;

    public void saveUserSettings(User2Video2VideoSettings user2Video2VideoSettings){
        user2Video2VideoSettingsRepository.save(user2Video2VideoSettings);
    }
}
