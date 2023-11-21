package com.rajabi.divarapplication.domain.usecase

import com.rajabi.divarapplication.data.model.city.City
import com.rajabi.divarapplication.domain.repository.DivarRepository
import kotlinx.coroutines.flow.Flow

class GetSavedCitiesUsecase(private val divarRepository: DivarRepository) {

    suspend fun execute():Flow<List<City>>{
        return divarRepository.getSavedCities()
    }
}