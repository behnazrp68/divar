package com.rajabi.divarapplication.data.model.widget


import com.google.gson.annotations.SerializedName

data class Widget(
    @SerializedName("data")
    val `data`: WidgetData,
    @SerializedName("widget_type")
    val widgetType: String
)