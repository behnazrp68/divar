package com.rajabi.divarapplication.data.model.advertising


import com.google.gson.annotations.SerializedName

data class DataX(
    @SerializedName("district")
    val district: String,
    @SerializedName("price")
    val price: String,
    @SerializedName("text")
    val text: String,
    @SerializedName("thumbnail")
    val thumbnail: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("token")
    val token: String
)