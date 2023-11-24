package com.rajabi.divarapplication.data.model.advertising


import com.google.gson.annotations.SerializedName

data class Widgets(
    @SerializedName("last_post_date")
    val lastPostDate: Long,
    @SerializedName("widget_list")
    val widgetList: List<Widget>
)