package com.rajabi.divarapplication.data.api

import com.rajabi.divarapplication.data.model.advertising.APIResponseAdvertis
import com.rajabi.divarapplication.data.model.advertising.RequestJson
import com.rajabi.divarapplication.data.model.city.APIResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

interface DivarAPIServices {
    @Headers(
        "x-access-token: Basic YXBpa2V5OjY5Y1dxVW8wNGhpNFdMdUdBT2IzMmRXZXQjsllsVzBtSkNiwU9yLUxEamNDUXFMSzJnR29mS3plZg==",

        )
    @GET("/api/v1/place/list")
    suspend fun getAllCities(): Response<APIResponse>

    @Headers(
        "x-access-token: Basic YXBpa2V5OjY5Y1dxVW8wNGhpNFdMdUdBT2IzMmRXZXQjsllsVzBtSkNiwU9yLUxEamNDUXFMSzJnR29mS3plZg==",

        )

    @POST("/api/v1/post/list")
    suspend fun getAllAdvertising(
        @Query("city") cityID: Int?,
        @Body requestJson: RequestJson
    ): Response<APIResponseAdvertis>


}