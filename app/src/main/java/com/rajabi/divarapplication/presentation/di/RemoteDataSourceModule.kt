package com.rajabi.divarapplication.presentation.di

import com.rajabi.divarapplication.data.api.DivarAPIServices
import com.rajabi.divarapplication.data.repository.datasource.CitiesRemoteDataSource
import com.rajabi.divarapplication.data.repository.datasourceimpl.CitiesRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataSourceModule {
    @Singleton
    @Provides
    fun provideCitiesRemoteDataSource(divarAPIServices: DivarAPIServices): CitiesRemoteDataSource {
        return CitiesRemoteDataSourceImpl(divarAPIServices)
    }
}