package com.rajabi.divarapplication.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.rajabi.divarapplication.domain.usecase.GetAllCitiesUsecase

class CityViewModelFactory
    (
    private val app: Application,
    private val getAllCitiesUsecase: GetAllCitiesUsecase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CityViewModel(
            app, getAllCitiesUsecase) as T
    }
}