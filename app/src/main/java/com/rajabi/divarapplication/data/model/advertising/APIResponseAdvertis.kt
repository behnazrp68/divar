package com.rajabi.divarapplication.data.model.advertising


import com.google.gson.annotations.SerializedName

data class APIResponseAdvertis(
    @SerializedName("last_post_date")
    val lastPostDate: Long,
    @SerializedName("widget_list")
    val posts: List<Widget>
)
enum class Type {
    TITLE_ROW,
    SUBTITLE_ROW,
    POST_ROW,
    UNKNOWN
}
