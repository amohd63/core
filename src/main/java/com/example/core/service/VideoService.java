package com.example.core.service;

import com.example.core.DTO.VideoDTO;
import com.example.core.mapper.VideoDTOMapper;
import com.example.core.repository.VideoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class VideoService {
    private final VideoDTOMapper videoDTOMapper;
    private final VideoRepository videoRepository;

    public List<VideoDTO> getAll(){
        return videoRepository.findAll().stream().map(
                video -> {
                    return videoDTOMapper.videoToVideoDTO(video);
                }
        ).collect(Collectors.toList());
    }
}
