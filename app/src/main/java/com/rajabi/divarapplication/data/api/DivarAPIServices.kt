package com.rajabi.divarapplication.data.api

import com.rajabi.divarapplication.data.model.advertising.Advertisings
import com.rajabi.divarapplication.data.model.advertising.RequestJson
import com.rajabi.divarapplication.data.model.city.APIResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface DivarAPIServices {
    @Headers(
        "x-access-token: Basic",
        "x-access-token: YXBpa2V5OjY5Y1dxVW8wNGhpNFdMdUdBT2IzMmRXZXQjsllsVzBtSkNiwU9yLUxEamNDUXFMSzJnR29mS3plZg=="
    )
    @GET("/api/v1/place/list")
    suspend fun getAllCities(): Response<APIResponse>

    @POST("/api/v1/post/list")
    suspend fun getAllAdvertising(@Body requestJson:RequestJson): Response<Advertisings>


}