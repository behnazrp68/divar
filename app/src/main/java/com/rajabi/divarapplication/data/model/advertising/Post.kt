package com.rajabi.divarapplication.data.model.advertising


import com.google.gson.annotations.SerializedName

data class Post(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("text")
    val text: String,
    @SerializedName("widget_type")
    val widgetType: String
)