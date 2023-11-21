package com.rajabi.divarapplication.presentation.di

import android.app.Application
import com.rajabi.divarapplication.domain.usecase.GetAllCitiesUsecase
import com.rajabi.divarapplication.presentation.viewmodel.CityViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {
    @Provides
    @Singleton
    fun provideCityViewModelFactory(
        app: Application,
        getAllCitiesUsecase: GetAllCitiesUsecase
    ): CityViewModelFactory {
        return CityViewModelFactory(app, getAllCitiesUsecase)
    }

}
