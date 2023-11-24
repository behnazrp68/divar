package com.rajabi.divarapplication.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.rajabi.divarapplication.domain.usecase.GetAllAdvertisingUsecase
import com.rajabi.divarapplication.domain.usecase.GetAllCitiesUsecase

class CityViewModelFactory
    (
    private val app: Application,
    private val getAllCitiesUsecase: GetAllCitiesUsecase,
    private val getAllAdvertisingUsecase: GetAllAdvertisingUsecase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CityViewModel(
            app, getAllCitiesUsecase, getAllAdvertisingUsecase
        ) as T
    }
}