package io.binarybase.covid19.api;

import io.binarybase.covid19.models.Covid;
import io.binarybase.covid19.models.SaveCovid;
import io.binarybase.covid19.models.StatusBDNow;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface TheRoad {

    @POST("covids")
    Call<SaveCovid> addCovid(@Body Covid covids);

    @GET("status")
    Call<StatusBDNow> getStatus();
}
