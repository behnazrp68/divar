package com.rajabi.divarapplication.data.model.widget


import com.google.gson.annotations.SerializedName

data class Widgets(
    @SerializedName("contact_button_text")
    val contactButtonText: String,
    @SerializedName("enable_contact")
    val enableContact: Boolean,
    @SerializedName("widgets")
    val widgets: List<Widget>
)