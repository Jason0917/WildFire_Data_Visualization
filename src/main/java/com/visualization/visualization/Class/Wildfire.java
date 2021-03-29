package com.visualization.visualization.Class;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "wildfire")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Wildfire {
    @Id
    @GeneratedValue
    @Column(name = "FID")
    private Integer FID;

    private String SRC_AGENCY;

    private String FIRE_ID;

    private double LATITUDE;

    private double LONGITUDE;

    private Integer YEAR;

    private Integer MONTH;

    private Integer DAY;

    private String DECADE;

    @Column(name = "SIZE_HA")
    private double SIZE;

    public Integer getFID() {
        return FID;
    }

    public void setFID(Integer FID) {
        this.FID = FID;
    }

    public String getSRC_AGENCY() {
        return SRC_AGENCY;
    }

    public void setSRC_AGENCY(String SRC_AGENCY) {
        this.SRC_AGENCY = SRC_AGENCY;
    }

    public String getFIRE_ID() {
        return FIRE_ID;
    }

    public void setFIRE_ID(String FIRE_ID) {
        this.FIRE_ID = FIRE_ID;
    }

    public double getLATITUDE() {
        return LATITUDE;
    }

    public void setLATITUDE(double LATITUDE) {
        this.LATITUDE = LATITUDE;
    }

    public double getLONGITUDE() {
        return LONGITUDE;
    }

    public void setLONGITUDE(double LONGITUDE) {
        this.LONGITUDE = LONGITUDE;
    }

    public Integer getYEAR() {
        return YEAR;
    }

    public void setYEAR(Integer YEAR) {
        this.YEAR = YEAR;
    }

    public Integer getMONTH() {
        return MONTH;
    }

    public void setMONTH(Integer MONTH) {
        this.MONTH = MONTH;
    }

    public Integer getDAY() {
        return DAY;
    }

    public void setDAY(Integer DAY) {
        this.DAY = DAY;
    }

    public String getDECADE() {
        return DECADE;
    }

    public void setDECADE(String DECADE) {
        this.DECADE = DECADE;
    }

    public double getSIZE() {
        return SIZE;
    }

    public void setSIZE(double SIZE) {
        this.SIZE = SIZE;
    }
}
