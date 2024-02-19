package com.example.core.DTO;

import com.example.core.model.VideoSettings;
import jakarta.persistence.*;
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
    private Integer vId;
    private String title;
    private String URL;
    private Time length;
    private List<VideoSettings> sId;
}

