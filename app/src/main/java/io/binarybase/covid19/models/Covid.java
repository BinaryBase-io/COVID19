package io.binarybase.covid19.models;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Covid {

    @SerializedName("p_sex")
    private int pSex;

    @SerializedName("p_age")
    private int pAge;

    @SerializedName("gps_admin_area")
    private String gpsAdminArea;

    @SerializedName("gps_admin_sub_area")
    private String gpsAdminSubArea;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("p_mobile")
    private String pMobile;

    @SerializedName("s_mobile")
    private String sMobile;

    @SerializedName("p_address")
    private String pAddress;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("gps_address")
    private String gpsAddress;

    @SerializedName("p_name")
    private String pName;

    @SerializedName("lan")
    private double lan;

    @SerializedName("id")
    private int id;

    @SerializedName("lat")
    private double lat;

    public int getPSex() {
        return pSex;
    }

    public void setPSex(int pSex) {
        this.pSex = pSex;
    }

    public int getPAge() {
        return pAge;
    }

    public void setPAge(int pAge) {
        this.pAge = pAge;
    }

    public String getGpsAdminArea() {
        return gpsAdminArea;
    }

    public void setGpsAdminArea(String gpsAdminArea) {
        this.gpsAdminArea = gpsAdminArea;
    }

    public String getGpsAdminSubArea() {
        return gpsAdminSubArea;
    }

    public void setGpsAdminSubArea(String gpsAdminSubArea) {
        this.gpsAdminSubArea = gpsAdminSubArea;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getPMobile() {
        return pMobile;
    }

    public void setPMobile(String pMobile) {
        this.pMobile = pMobile;
    }

    public String getSMobile() {
        return sMobile;
    }

    public void setSMobile(String sMobile) {
        this.sMobile = sMobile;
    }

    public String getPAddress() {
        return pAddress;
    }

    public void setPAddress(String pAddress) {
        this.pAddress = pAddress;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getGpsAddress() {
        return gpsAddress;
    }

    public void setGpsAddress(String gpsAddress) {
        this.gpsAddress = gpsAddress;
    }

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        this.pName = pName;
    }

    public double getLan() {
        return lan;
    }

    public void setLan(double lan) {
        this.lan = lan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return
                "Covid{" +
                        "p_sex = '" + pSex + '\'' +
                        ",p_age = '" + pAge + '\'' +
                        ",gps_admin_area = '" + gpsAdminArea + '\'' +
                        ",gps_admin_sub_area = '" + gpsAdminSubArea + '\'' +
                        ",created_at = '" + createdAt + '\'' +
                        ",p_mobile = '" + pMobile + '\'' +
                        ",s_mobile = '" + sMobile + '\'' +
                        ",p_address = '" + pAddress + '\'' +
                        ",updated_at = '" + updatedAt + '\'' +
                        ",gps_address = '" + gpsAddress + '\'' +
                        ",p_name = '" + pName + '\'' +
                        ",lan = '" + lan + '\'' +
                        ",id = '" + id + '\'' +
                        ",lat = '" + lat + '\'' +
                        "}";
    }
}