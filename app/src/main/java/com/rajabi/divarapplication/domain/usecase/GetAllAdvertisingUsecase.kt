package com.rajabi.divarapplication.domain.usecase

import com.rajabi.divarapplication.data.model.advertising.Advertisings
import com.rajabi.divarapplication.data.util.Resource
import com.rajabi.divarapplication.domain.repository.DivarRepository

class GetAllAdvertisingUsecase(private val divarRepository: DivarRepository) {
    suspend fun execute(cityId: Long): Resource<Advertisings> {
        return divarRepository.getAllAdvertisingsInCity(cityId)
    }
}