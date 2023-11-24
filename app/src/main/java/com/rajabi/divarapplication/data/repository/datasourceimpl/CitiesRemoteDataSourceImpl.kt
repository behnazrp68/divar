package com.rajabi.divarapplication.data.repository.datasourceimpl

import com.rajabi.divarapplication.data.api.DivarAPIServices
import com.rajabi.divarapplication.data.model.advertising.APIResponseAdvertis
import com.rajabi.divarapplication.data.model.advertising.RequestJson
import com.rajabi.divarapplication.data.model.city.APIResponse
import com.rajabi.divarapplication.data.repository.datasource.CitiesRemoteDataSource
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject
import retrofit2.Response

class CitiesRemoteDataSourceImpl
    (private val divarAPIServices: DivarAPIServices) : CitiesRemoteDataSource {
    override suspend fun getCIties(): Response<APIResponse> {
        return divarAPIServices.getAllCities()
    }

    override suspend fun getAdvertisings(
        cityId: Int?,
        page: Int,
        lastPostDate: Int
    ): Response<APIResponseAdvertis> {

        val jsonObject = JSONObject()
        jsonObject.put("page", page)
        jsonObject.put("last_post_date", lastPostDate)

        // Convert JSONObject to String
        val jsonObjectString = jsonObject.toString()

        // Create RequestBody ( We're not using any converter, like GsonConverter, MoshiConverter e.t.c, that's why we use RequestBody )
        val requestBody = jsonObjectString.toRequestBody("application/json".toMediaTypeOrNull())
        val requestJson = RequestJson(page, lastPostDate)
        return divarAPIServices.getAllAdvertising(cityId, requestJson)
    }
}