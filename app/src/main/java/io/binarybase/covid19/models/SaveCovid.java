package io.binarybase.covid19.models;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class SaveCovid {

    @SerializedName("covid")
    private Covid covid;

    @SerializedName("message")
    private String message;

    public Covid getCovid() {
        return covid;
    }

    public void setCovid(Covid covid) {
        this.covid = covid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return
                "SaveCovid{" +
                        "covid = '" + covid + '\'' +
                        ",message = '" + message + '\'' +
                        "}";
    }
}