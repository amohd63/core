//package com.example.core.model;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.util.List;
//
//@Entity
//@Table(name = "user_2_video_setting")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//public class User2VideoSettings {
//
//    @OneToMany(mappedBy = "user_id", cascade = CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name="user_id")
//    private List<User> uId;
//
//    @Column(name = "value")
//    private String value;
//
//    @OneToMany(mappedBy = "video_setting_id", cascade = CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name="video_setting_id")
//    private List<VideoSettings> sId;
//}
