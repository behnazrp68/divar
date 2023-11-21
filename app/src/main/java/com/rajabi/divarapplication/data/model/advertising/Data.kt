package com.rajabi.divarapplication.data.model.advertising


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("city")
    val city: String,
    @SerializedName("district")
    val district: String,
    @SerializedName("price")
    val price: String,
    @SerializedName("subtitle")
    val subtitle: String,
    @SerializedName("thumbnail")
    val thumbnail: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("token")
    val token: String
)