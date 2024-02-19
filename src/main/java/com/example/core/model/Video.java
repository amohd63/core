package com.example.core.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.List;

@Entity
@Table(name = "video", schema="core_schema")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "v_id", updatable = false, nullable = false, unique = true)
    private Integer vId;

    @Column(name = "title")
    private String title;

    @Column(name = "url")
    private String URL;

    @Column(name = "length")
    private Time length;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="s_id")
    private List<VideoSettings> sId;
}
