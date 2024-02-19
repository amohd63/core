package com.example.core.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;

@Entity
@Table(name = "videosettings", schema="core_schema")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VideoSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id", updatable = false, nullable = false, unique = true)
    private Integer sId;

    @Column(name = "setting")
    private String setting;

    @Column(name = "value")
    private String value;

    @Column(name = "datatype")
    private String dataType;

    public VideoSettings(Integer sId) {
        this.sId = sId;
    }
}
