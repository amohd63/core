package com.example.core.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User2VideoSettingsDTO {
    private Integer uId;
    private String value;
    private Integer sId;
}
