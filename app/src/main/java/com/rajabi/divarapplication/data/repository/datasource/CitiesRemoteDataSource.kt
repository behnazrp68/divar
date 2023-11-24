package com.rajabi.divarapplication.data.repository.datasource

import com.rajabi.divarapplication.data.model.advertising.APIResponseAdvertis
import com.rajabi.divarapplication.data.model.city.APIResponse
import retrofit2.Response

interface CitiesRemoteDataSource {

    suspend fun getCIties(): Response<APIResponse>
    suspend fun getAdvertisings(cityId:Int?,page:Int,lastPostDate:Int): Response<APIResponseAdvertis>

}