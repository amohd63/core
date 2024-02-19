package com.example.core.repository;

import com.example.core.model.VideoSettings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoSettingsRepository extends JpaRepository<VideoSettings, Integer> {
}
