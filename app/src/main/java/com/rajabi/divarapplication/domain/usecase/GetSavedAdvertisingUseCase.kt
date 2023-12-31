package com.rajabi.divarapplication.domain.usecase

import com.rajabi.divarapplication.data.model.advertising.DataX
import com.rajabi.divarapplication.domain.repository.DivarRepository
import kotlinx.coroutines.flow.Flow

class GetSavedAdvertisingUseCase(private val divarRepository: DivarRepository) {
    fun execute(): Flow<List<DataX>> {
        return divarRepository.getSavedAdvertising()
    }
}