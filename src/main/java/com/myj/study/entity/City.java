package com.myj.study.entity;

/**
 * Created by MYJ on 2018/1/16.
 */
public class City {

    private Integer id;
    private Integer cityId;
    private String cityName;
    private String cityPy;
    private Integer provId;
    private String cityState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityPy() {
        return cityPy;
    }

    public void setCityPy(String cityPy) {
        this.cityPy = cityPy;
    }

    public Integer getProvId() {
        return provId;
    }

    public void setProvId(Integer provId) {
        this.provId = provId;
    }

    public String getCityState() {
        return cityState;
    }

    public void setCityState(String cityState) {
        this.cityState = cityState;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", cityPy='" + cityPy + '\'' +
                ", provId=" + provId +
                ", cityState='" + cityState + '\'' +
                '}';
    }
}
