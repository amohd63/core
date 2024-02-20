package com.example.core.repository;

import com.example.core.model.VideoSetting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoSettingRepository extends JpaRepository<VideoSetting, Integer> {
}