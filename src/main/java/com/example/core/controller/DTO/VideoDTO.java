package com.example.core.controller.DTO;

import com.example.core.model.VideoSetting;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VideoDTO {
    private Integer id;
    private String title;
    private String url;
    private Time length;
}

