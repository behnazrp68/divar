package com.rajabi.divarapplication.data.repository.datasource

import com.rajabi.divarapplication.data.model.city.APIResponse
import retrofit2.Response

interface CitiesRemoteDataSource {

    suspend fun getCIties(): Response<APIResponse>
}