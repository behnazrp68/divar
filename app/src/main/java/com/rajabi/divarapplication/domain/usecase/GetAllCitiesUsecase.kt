package com.rajabi.divarapplication.domain.usecase

import com.rajabi.divarapplication.data.model.city.APIResponse
import com.rajabi.divarapplication.data.util.Resource
import com.rajabi.divarapplication.domain.repository.DivarRepository

class GetAllCitiesUsecase(private val divarRepository: DivarRepository) {
    suspend fun execute():Resource<APIResponse>{
        return divarRepository.getAllCities()
    }

}