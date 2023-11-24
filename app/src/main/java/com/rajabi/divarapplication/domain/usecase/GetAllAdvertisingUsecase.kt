package com.rajabi.divarapplication.domain.usecase

import com.rajabi.divarapplication.data.model.advertising.APIResponseAdvertis
import com.rajabi.divarapplication.data.util.Resource
import com.rajabi.divarapplication.domain.repository.DivarRepository

class GetAllAdvertisingUsecase(private val divarRepository: DivarRepository) {
    suspend fun execute(cityId: Int?,page:Int,lastPostDate:Int): Resource<APIResponseAdvertis> {
        return divarRepository.getAllAdvertisingsInCity(cityId,page,lastPostDate)
    }
}