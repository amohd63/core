package com.example.core.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "video_setting")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VideoSetting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "video_setting_id", updatable = false, nullable = false, unique = true)
    private Integer video_setting_id;

    @Column(name = "setting")
    private String setting;

    @Column(name = "value")
    private String value;

    @Column(name = "data_type")
    private String data_type;
}
