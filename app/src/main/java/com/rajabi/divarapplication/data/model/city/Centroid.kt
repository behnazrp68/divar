package com.rajabi.divarapplication.data.model.city


import com.google.gson.annotations.SerializedName

data class Centroid(
    @SerializedName("latitude")
    val latitude: Double,
    @SerializedName("longitude")
    val longitude: Double
)