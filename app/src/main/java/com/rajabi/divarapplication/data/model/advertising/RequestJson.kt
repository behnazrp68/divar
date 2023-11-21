package com.rajabi.divarapplication.data.model.advertising


import com.google.gson.annotations.SerializedName

data class RequestJson(
    @SerializedName("last_post_date")
    val lastPostDate: Int,
    @SerializedName("page")
    val page: Int
)