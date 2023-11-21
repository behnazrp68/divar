package com.rajabi.divarapplication.data.repository.datasourceimpl

import com.rajabi.divarapplication.data.api.DivarAPIServices
import com.rajabi.divarapplication.data.model.city.APIResponse
import com.rajabi.divarapplication.data.repository.datasource.CitiesRemoteDataSource
import retrofit2.Response

class CitiesRemoteDataSourceImpl
    (private val divarAPIServices: DivarAPIServices) : CitiesRemoteDataSource {
    override suspend fun getCIties(): Response<APIResponse> {
        return divarAPIServices.getAllCities()
    }
}