package com.example.core.model;

import jakarta.persistence.*;

import java.sql.Time;

@Entity
@Table(name = "videosettings")
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
}
