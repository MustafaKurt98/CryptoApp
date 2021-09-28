package com.mustafakurt.cryptoapp.service;

import com.mustafakurt.cryptoapp.model.CryptoModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {
    //GET, POST, UPDATE, DELETE

    //https://api.nomics.com/v1/prices?key=f941ec3cf00ec8663761f81ab5e2cab07a3ecdda

    @GET("prices?key=f941ec3cf00ec8663761f81ab5e2cab07a3ecdda")
    Call<List<CryptoModel>> getData();

}
