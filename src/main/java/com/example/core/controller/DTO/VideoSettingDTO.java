package com.example.core.controller.DTO;

import lombok.*;

import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class VideoSettingDTO {
    private Integer id;
    private String setting;
    private String default_value;
    private String data_type;
}
