package com.rajabi.divarapplication.data.repository

import com.rajabi.divarapplication.data.model.advertising.APIResponseAdvertis
import com.rajabi.divarapplication.data.model.advertising.DataX
import com.rajabi.divarapplication.data.model.city.APIResponse
import com.rajabi.divarapplication.data.model.city.City
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

    override suspend fun getAllAdvertisingsInCity(selectedCityId: Int?,page:Int,lastPostDate:Int): Resource<APIResponseAdvertis> {
        return responseToResource(citiesRemoteDataSource.getAdvertisings(selectedCityId,page,lastPostDate))
    }

    override suspend fun saveAdvertising(data: DataX) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAdvertising(data: DataX) {
        TODO("Not yet implemented")
    }

    override fun getSavedAdvertising(): Flow<List<DataX>> {
        TODO("Not yet implemented")
    }

    override suspend fun saveCity(city: City) {
        TODO("Not yet implemented")
    }

    override fun getSavedCities(): Flow<List<City>> {
        TODO("Not yet implemented")
    }

    @JvmName("functionOfKotlin2")
    private fun responseToResource(response: Response<APIResponse>): Resource<APIResponse> {
        if (response.isSuccessful) {
            response.body()?.let { result ->
                return Resource.Success(result)
            }

        }
        return Resource.Error(response.message())
    }
    @JvmName("functionOfKotlin")
    private fun responseToResource(  response: Response<APIResponseAdvertis>): Resource<APIResponseAdvertis> {
        if (response.isSuccessful) {
            response.body()?.let { result ->
                return Resource.Success(result)
            }

        }
        return Resource.Error(response.message())
    }
}
