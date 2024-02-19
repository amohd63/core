package com.example.core.model;

import jakarta.persistence.*;

@Table(name = "User2VideoSettings")
public class User2VideoSettings {

    @OneToMany(mappedBy = "u_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private Integer uId;

    @Column(name = "value")
    private String value;

    @OneToMany(mappedBy = "s_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private Integer sId;
}
