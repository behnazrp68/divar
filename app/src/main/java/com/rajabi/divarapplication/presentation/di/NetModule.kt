package com.rajabi.divarapplication.presentation.di

import com.rajabi.divarapplication.BuildConfig
import com.rajabi.divarapplication.data.api.DivarAPIServices
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetModule {
    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BuildConfig.BASE_URL)
            .build()
    }

    fun provideDivarAPIService(retrofit: Retrofit):DivarAPIServices{
        return retrofit.create(DivarAPIServices::class.java)
    }
}