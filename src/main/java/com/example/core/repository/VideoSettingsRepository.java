package com.example.core.repository;

import com.example.core.model.VideoSetting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoSettingsRepository extends JpaRepository<VideoSetting, Integer> {
}
