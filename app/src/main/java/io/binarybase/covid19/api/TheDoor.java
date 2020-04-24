package io.binarybase.covid19.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TheDoor {

    private static final String ROOT_URL = "https://brosolved.com/covid19/public/api/";

    private static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static TheRoad driveOnRoad() {
        return getRetrofitInstance().create(TheRoad.class);
    }

}
