package com.example.core.repository;

import com.example.core.model.User2Video2VideoSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface User2Video2VideoSettingsRepository extends JpaRepository<User2Video2VideoSettings, Integer> {

}