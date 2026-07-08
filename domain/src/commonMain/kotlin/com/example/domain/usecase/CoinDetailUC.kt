package com.example.domain.usecase

import com.example.domain.model.CoinDetailModel
import com.example.domain.repository.coin_list.CoinRepository

class CoinDetailUC(private val coinRepository: CoinRepository) {

    suspend fun getCoinDetail(coinID: String): Result<CoinDetailModel> {
        return coinRepository.getCoinById(coinID)
    }
}