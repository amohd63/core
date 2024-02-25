package com.example.core.model;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Type;

import java.util.List;

@Entity
@Table(name = "video_setting")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class VideoSetting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "video_setting_id", updatable = false, nullable = false, unique = true)
    private Integer id;

    @Column(name = "setting")
    private String setting;

    @Column(name = "values_list", columnDefinition = "jsonb")
    @Type(value = JsonBinaryType.class)
    private List<String> valuesList;

    @Column(name = "default_value")
    private String defaultValue;

    @Column(name = "data_type")
    private String dataType;

    @ToString.Exclude
    @ManyToMany(mappedBy = "videoSettings")
    private List<Video> videos;
}
