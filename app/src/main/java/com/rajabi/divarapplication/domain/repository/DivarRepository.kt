package com.rajabi.divarapplication.domain.repository

import com.rajabi.divarapplication.data.model.city.APIResponse
import com.rajabi.divarapplication.data.model.advertising.Advertisings
import com.rajabi.divarapplication.data.model.city.City
import com.rajabi.divarapplication.data.model.advertising.Data
import com.rajabi.divarapplication.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface DivarRepository {
    suspend fun getAllCities():Resource<APIResponse>
    suspend fun getAllAdvertisingsInCity(selectedCityId:Long):Resource<Advertisings>

    suspend fun saveAdvertising(data : Data)
    suspend fun deleteAdvertising(data: Data)

    fun getSavedAdvertising(): Flow<List<Data>>

    suspend fun saveCity(city: City)

    fun getSavedCities():Flow<List<City>>

}
