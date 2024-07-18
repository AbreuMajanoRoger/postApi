package com.example.postapi.utils

import com.example.postapi.data.RetrofitService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitProvider {

    companion object {
        fun getRetrofit(): RetrofitService {
            val retrofit = Retrofit.Builder()
                .baseUrl(Constants.API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.create(RetrofitService::class.java)
        }
    }
}