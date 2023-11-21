package com.rajabi.divarapplication.domain.usecase

import com.rajabi.divarapplication.data.model.advertising.Data
import com.rajabi.divarapplication.domain.repository.DivarRepository

class DeleteAdvertisingUsecase(private val divarRepository: DivarRepository) {
    suspend fun execute(data: Data)=
        divarRepository.deleteAdvertising(data)

}