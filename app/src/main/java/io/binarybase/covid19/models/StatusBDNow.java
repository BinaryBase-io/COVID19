package io.binarybase.covid19.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class StatusBDNow {

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("statusBD")
    private List<StatusBDItem> statusBD;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public List<StatusBDItem> getStatusBD() {
        return statusBD;
    }

    public void setStatusBD(List<StatusBDItem> statusBD) {
        this.statusBD = statusBD;
    }

    @Override
    public String toString() {
        return
                "Response{" +
                        "created_at = '" + createdAt + '\'' +
                        ",statusBD = '" + statusBD + '\'' +
                        "}";
    }
}