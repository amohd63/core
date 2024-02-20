package com.example.core.service;

import com.example.core.model.Video;
import com.example.core.repository.VideoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VideoService {
    private final VideoRepository videoRepository;

    public List<Video> getAll(){
        return videoRepository.findAll();
    }

    public Video getVideoByTitle(String title){
        return videoRepository.findVideoByTitle(title);
    }
}
