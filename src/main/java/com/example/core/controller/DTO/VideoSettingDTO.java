package com.example.core.controller.DTO;

public class VideoSettingDTO {
    private Integer sId;
    private String setting;
    private String value;
    private String dataType;

    public VideoSettingDTO() {
    }

    public VideoSettingDTO(Integer sId, String setting, String value, String dataType) {
        this.sId = sId;
        this.setting = setting;
        this.value = value;
        this.dataType = dataType;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @Override
    public String toString() {
        return "VideoSettingsDTO{" +
                "sId=" + sId +
                ", setting='" + setting + '\'' +
                ", value='" + value + '\'' +
                ", dataType='" + dataType + '\'' +
                '}';
    }
}
