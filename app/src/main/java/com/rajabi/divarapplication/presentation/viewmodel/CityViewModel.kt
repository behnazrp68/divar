package com.rajabi.divarapplication.presentation.viewmodel

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.rajabi.divarapplication.data.model.advertising.APIResponseAdvertis
import com.rajabi.divarapplication.data.model.city.APIResponse
import com.rajabi.divarapplication.data.util.Resource
import com.rajabi.divarapplication.domain.usecase.GetAllAdvertisingUsecase
import com.rajabi.divarapplication.domain.usecase.GetAllCitiesUsecase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class CityViewModel
    (
    private val app: Application,
    private val getAllCitiesUsecase: GetAllCitiesUsecase,
    private val getAllAdvertisingUsecase: GetAllAdvertisingUsecase
) : AndroidViewModel(app) {

    val cities: MutableLiveData<Resource<APIResponse>> = MutableLiveData()
    val advertisingsList: MutableLiveData<Resource<APIResponseAdvertis>> = MutableLiveData()
    fun getCities() = viewModelScope.launch(Dispatchers.IO) {
        cities.postValue(Resource.Loading())

        try {
            if (isNetworkAvailable(app)) {
                val apiResult = getAllCitiesUsecase.execute()
                cities.postValue(apiResult)
            } else {
                Toast.makeText(app, "error", Toast.LENGTH_LONG).show()
            }
        } catch (e: Exception) {
            cities.postValue(Resource.Error(e.message.toString()))
        }

    }
        fun getAdvertings(cityId:Int?,page:Int,lastPostDate:Int) = viewModelScope.launch(Dispatchers.IO) {
            advertisingsList.postValue(Resource.Loading())

            try {
                if (isNetworkAvailable(app)) {
                    val apiResult = getAllAdvertisingUsecase.execute(cityId,page=0, lastPostDate = 0)
                    advertisingsList.postValue(apiResult)
                } else {
                    Toast.makeText(app, "error", Toast.LENGTH_LONG).show()
                }
            } catch (e: Exception) {
                advertisingsList.postValue(Resource.Error(e.message.toString()))
            }
        }

    private fun isNetworkAvailable(context: Context?): Boolean {
        if (context == null) return false
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            val capabilities =
                connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)

            if (capabilities != null) {

                when {
                    capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> return true
                    capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> return true
                    capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> return true
                    capabilities.hasTransport(NetworkCapabilities.TRANSPORT_BLUETOOTH) -> return true
                    else -> return false
                }
            }
        } else {
            val activeNetworkInfo = connectivityManager.activeNetworkInfo
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected)
                return true
        }
        return false
    }

}