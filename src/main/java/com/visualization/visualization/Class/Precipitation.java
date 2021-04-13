package com.visualization.visualization.Class;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "precipitation")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Precipitation {
    @Id
    @GeneratedValue
    @Column(name = "FID")
    private Integer FID;

    private String SRC_AGENCY;

    private String CLIMATE_ID;

    private double LATITUDE;

    private double LONGITUDE;

    private Integer YEAR;

    private Integer MONTH;

    private Integer DAY;

    @Column(name = "TOTAL_PRECIPITATION")
    private double PRECIPITATION;

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

    public String getCLIMATE_ID() {
        return CLIMATE_ID;
    }

    public void setCLIMATE_ID(String CLIMATE_ID) {
        this.CLIMATE_ID = CLIMATE_ID;
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

    public double getPRECIPITATION() {
        return PRECIPITATION;
    }

    public void setPRECIPITATION(double TOTAL_PRECIPITATION) {
        this.PRECIPITATION = PRECIPITATION;
    }
}
