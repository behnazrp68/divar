package com.rajabi.divarapplication.domain.usecase

import com.rajabi.divarapplication.data.model.city.City
import com.rajabi.divarapplication.domain.repository.DivarRepository

class SaveCityUsecase(private val divarRepository: DivarRepository) {
    suspend fun execute(city: City)=divarRepository.saveCity(city)
}