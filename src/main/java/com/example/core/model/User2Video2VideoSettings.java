package com.example.core.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user_2_video_2_video_setting")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User2Video2VideoSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "video_id")
    private Integer videoId;

    @Column(name = "video_setting_id")
    private Integer videoSettingId;

    @Column(name = "value")
    private String value;
}
