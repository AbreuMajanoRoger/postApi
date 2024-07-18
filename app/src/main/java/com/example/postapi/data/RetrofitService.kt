package com.example.postapi.data

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RetrofitService {

    @GET("/")
    suspend fun searchBypost(@Query("posts") query: String): Response<PostDataResponsive>


   // @GET("character/{id}")
   // suspend fun getId(@Path("id") id: Int): ResultCharacters
}