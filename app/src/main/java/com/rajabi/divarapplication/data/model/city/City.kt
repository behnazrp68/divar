package com.rajabi.divarapplication.data.model.city


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
//@Entity(tableName = "cities")

data class City(
    @SerializedName("centroid")
    val centroid: Centroid,
    @PrimaryKey(autoGenerate = true)
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("radius")
    val radius: Int,
    @SerializedName("slug")
    val slug: String
)