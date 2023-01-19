package com.cengizhanyagiz.kriptoApp.service;

import com.cengizhanyagiz.kriptoApp.model.CryptoModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

 //   @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
 //   Call<List<CryptoModel>> getData();

    @GET("v1/ticker")
    Call<List<CryptoModel>> getData();

}
