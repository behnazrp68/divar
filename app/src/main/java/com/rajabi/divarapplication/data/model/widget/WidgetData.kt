package com.rajabi.divarapplication.data.model.widget


import com.google.gson.annotations.SerializedName

data class WidgetData(
    @SerializedName("image_url")
    val imageUrl: String,
    @SerializedName("items")
    val items: List<Item>,
    @SerializedName("show_thumbnail")
    val showThumbnail: Boolean,
    @SerializedName("subtitle")
    val subtitle: String,
    @SerializedName("text")
    val text: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("value")
    val value: String
)