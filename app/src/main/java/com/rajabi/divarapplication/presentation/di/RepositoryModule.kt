package com.rajabi.divarapplication.presentation.di

import com.rajabi.divarapplication.data.repository.DivarRepositoryImpl
import com.rajabi.divarapplication.data.repository.datasource.CitiesRemoteDataSource
import com.rajabi.divarapplication.domain.repository.DivarRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    @Singleton
    fun provideDivarRepository(citiesRemoteDataSource: CitiesRemoteDataSource): DivarRepository {
        return DivarRepositoryImpl(citiesRemoteDataSource)
    }
}