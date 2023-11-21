package com.rajabi.divarapplication.data.repository

import com.rajabi.divarapplication.data.model.city.APIResponse
import com.rajabi.divarapplication.data.model.advertising.Advertisings
import com.rajabi.divarapplication.data.model.city.City
import com.rajabi.divarapplication.data.model.advertising.Data
import com.rajabi.divarapplication.data.repository.datasource.CitiesRemoteDataSource
import com.rajabi.divarapplication.data.util.Resource
import com.rajabi.divarapplication.domain.repository.DivarRepository
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

class DivarRepositoryImpl
    (private val citiesRemoteDataSource: CitiesRemoteDataSource) : DivarRepository {
    override suspend fun getAllCities(): Resource<APIResponse> {
        return responseToResource(citiesRemoteDataSource.getCIties())
    }

    override suspend fun getAllAdvertisingsInCity(selectedCityId: Long): Resource<Advertisings> {
        TODO("Not yet implemented")
    }

    override suspend fun saveAdvertising(data: Data) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAdvertising(data: Data) {
        TODO("Not yet implemented")
    }

    override fun getSavedAdvertising(): Flow<List<Data>> {
        TODO("Not yet implemented")
    }

    override suspend fun saveCity(city: City) {
        TODO("Not yet implemented")
    }

    override fun getSavedCities(): Flow<List<City>> {
        TODO("Not yet implemented")
    }


    private fun responseToResource(response: Response<APIResponse>): Resource<APIResponse> {
        if (response.isSuccessful) {
            response.body()?.let { result ->
                return Resource.Success(result)
            }

        }
        return Resource.Error(response.message())
    }
}
