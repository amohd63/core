package com.example.core.service;

import com.example.core.controller.DTO.CustomVideoDTO;
import com.example.core.controller.VideoException;
import com.example.core.model.Video;
import com.example.core.repository.VideoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VideoService {
    private final VideoRepository videoRepository;

    public List<Video> getAll(){
        return videoRepository.findAll();
    }

    public Video getVideoById(Integer id){

        // Java Optional
        Video video = videoRepository.findVideoById(id);
        if (video == null){
            throw new VideoException("Video not found");
        }
        return video;
    }

    @Transactional
    public int deleteVideoById(Integer id){
        int isDeleted = videoRepository.deleteVideoById(id);
        if (isDeleted == 0){
            throw new VideoException("Video not found");
        }
        return isDeleted;
    }

    public Video updateVideo(Video video){
        Video videoObj = videoRepository.findVideoById(video.getId());
        return videoObj != null ? videoRepository.save(video) : null;
    }

    public Video addVideo(Video video){



        return videoRepository.save(video);
    }

    public List<Video> findVideosBySettingId(Integer id){
        return videoRepository.findVideosBySettingId(id);
    }

    public Video findLongestVideo(){
        Video t = videoRepository.findLongestVideo();
        return videoRepository.findLongestVideo();
    }
}
