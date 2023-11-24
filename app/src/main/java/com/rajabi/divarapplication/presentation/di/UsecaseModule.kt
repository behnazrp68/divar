package com.rajabi.divarapplication.presentation.di

import com.rajabi.divarapplication.domain.repository.DivarRepository
import com.rajabi.divarapplication.domain.usecase.GetAllAdvertisingUsecase
import com.rajabi.divarapplication.domain.usecase.GetAllCitiesUsecase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UsecaseModule {

    @Provides
    @Singleton
    fun provideGetAllCitiesUsecase(
        divarRepository: DivarRepository
    ): GetAllCitiesUsecase {
        return GetAllCitiesUsecase(divarRepository)
    }

    @Provides
    @Singleton
    fun provideGetAllAdvertisingUsecase(
        divarRepository: DivarRepository
    ): GetAllAdvertisingUsecase {
        return GetAllAdvertisingUsecase(divarRepository)
    }}