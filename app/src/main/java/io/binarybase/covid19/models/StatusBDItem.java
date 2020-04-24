package io.binarybase.covid19.models;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class StatusBDItem {

    @SerializedName("last_24_hour_infected")
    private String last24HourInfected;

    @SerializedName("total_death")
    private String totalDeath;

    @SerializedName("world_total_infected")
    private String worldTotalInfected;

    @SerializedName("total_infected")
    private String totalInfected;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("total_test")
    private String totalTest;

    @SerializedName("total_recover")
    private String totalRecover;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("world_total_recover")
    private String worldTotalRecover;

    @SerializedName("id")
    private int id;

    @SerializedName("world_total_death")
    private String worldTotalDeath;

    @SerializedName("last_24_hour_test")
    private String last24HourTest;

    public String getLast24HourInfected() {
        return last24HourInfected;
    }

    public void setLast24HourInfected(String last24HourInfected) {
        this.last24HourInfected = last24HourInfected;
    }

    public String getTotalDeath() {
        return totalDeath;
    }

    public void setTotalDeath(String totalDeath) {
        this.totalDeath = totalDeath;
    }

    public String getWorldTotalInfected() {
        return worldTotalInfected;
    }

    public void setWorldTotalInfected(String worldTotalInfected) {
        this.worldTotalInfected = worldTotalInfected;
    }

    public String getTotalInfected() {
        return totalInfected;
    }

    public void setTotalInfected(String totalInfected) {
        this.totalInfected = totalInfected;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getTotalTest() {
        return totalTest;
    }

    public void setTotalTest(String totalTest) {
        this.totalTest = totalTest;
    }

    public String getTotalRecover() {
        return totalRecover;
    }

    public void setTotalRecover(String totalRecover) {
        this.totalRecover = totalRecover;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getWorldTotalRecover() {
        return worldTotalRecover;
    }

    public void setWorldTotalRecover(String worldTotalRecover) {
        this.worldTotalRecover = worldTotalRecover;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWorldTotalDeath() {
        return worldTotalDeath;
    }

    public void setWorldTotalDeath(String worldTotalDeath) {
        this.worldTotalDeath = worldTotalDeath;
    }

    public String getLast24HourTest() {
        return last24HourTest;
    }

    public void setLast24HourTest(String last24HourTest) {
        this.last24HourTest = last24HourTest;
    }

    @Override
    public String toString() {
        return
                "StatusBDItem{" +
                        "last_24_hour_infected = '" + last24HourInfected + '\'' +
                        ",total_death = '" + totalDeath + '\'' +
                        ",world_total_infected = '" + worldTotalInfected + '\'' +
                        ",total_infected = '" + totalInfected + '\'' +
                        ",updated_at = '" + updatedAt + '\'' +
                        ",total_test = '" + totalTest + '\'' +
                        ",total_recover = '" + totalRecover + '\'' +
                        ",created_at = '" + createdAt + '\'' +
                        ",world_total_recover = '" + worldTotalRecover + '\'' +
                        ",id = '" + id + '\'' +
                        ",world_total_death = '" + worldTotalDeath + '\'' +
                        ",last_24_hour_test = '" + last24HourTest + '\'' +
                        "}";
    }
}