package com.visualization.visualization.Class;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "gfs_wind")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Wind {
    @Id
    private Integer FID;

    private Float latitude;

    private Float longitude;

    private Float u;

    private Float v;

    private Integer time;

    public Integer getFID() {
        return FID;
    }

    public Float getLatitude() {return latitude;}

    public Float getLongitude() {return longitude;}

    public Float getU() {return u;}

    public Float getV() {return v;}

    public Integer getTime() {
        return time;
    }
}
