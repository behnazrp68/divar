package com.rajabi.divarapplication.data.model.advertising


import com.google.gson.annotations.SerializedName

data class Advertisings(
    @SerializedName("last_post_date")
    val lastPostDate: Long,
    @SerializedName("posts")
    val posts: List<Post>
)