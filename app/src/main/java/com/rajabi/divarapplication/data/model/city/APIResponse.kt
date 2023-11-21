package com.rajabi.divarapplication.data.model.city


import com.google.gson.annotations.SerializedName

data class APIResponse(
    @SerializedName("cities")
    val cities: List<City>
)