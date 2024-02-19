package com.example.core.service;

import com.example.core.controller.DTO.VideoDTO;
import com.example.core.mapper.VideoDTOMapper;
import com.example.core.model.Video;
import com.example.core.repository.VideoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VideoService {
    private final VideoRepository videoRepository;

    public List<Video> getAll(){
        return videoRepository.findAll();
    }
}
