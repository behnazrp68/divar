package com.rajabi.divarapplication.data.model.advertising


import com.google.gson.annotations.SerializedName

data class Widget(
    @SerializedName("data")
    val `data`: DataX,
    @SerializedName("widget_type")
    val widgetType: String
)