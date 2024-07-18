package com.example.postapi.data

import com.google.gson.annotations.SerializedName

data class PostDataResponsive(
    @SerializedName("results") val results: List<ResultPost>
){
}

data class ResultPost(
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("body") val body: String,
) {}