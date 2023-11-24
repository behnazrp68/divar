package com.rajabi.divarapplication.domain.repository

import com.rajabi.divarapplication.data.model.advertising.APIResponseAdvertis
import com.rajabi.divarapplication.data.model.advertising.DataX
import com.rajabi.divarapplication.data.model.city.APIResponse
import com.rajabi.divarapplication.data.model.city.City
import com.rajabi.divarapplication.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface DivarRepository {
    suspend fun getAllCities():Resource<APIResponse>
    suspend fun getAllAdvertisingsInCity(selectedCityId:Int?,page:Int,lastPostDate:Int):Resource<APIResponseAdvertis>

    suspend fun saveAdvertising(data : DataX)
    suspend fun deleteAdvertising(data: DataX)

    fun getSavedAdvertising(): Flow<List<DataX>>

    suspend fun saveCity(city: City)

    fun getSavedCities():Flow<List<City>>

}
