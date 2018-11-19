package com.example.mbarrafirdaus.jadwalsholat.api;


import com.example.mbarrafirdaus.jadwalsholat.model.ModelJadwal;
import com.example.mbarrafirdaus.jadwalsholat.model.ModelJadwal;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("jakarta.json")
    Call<ModelJadwal> getJadwal();

}