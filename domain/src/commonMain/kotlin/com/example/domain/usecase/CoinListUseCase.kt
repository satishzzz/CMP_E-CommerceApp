package com.example.domain.usecase

import com.example.domain.model.CoinListModel
import com.example.domain.repository.coin_list.CoinRepository

class CoinListUseCase(private val coinRepository: CoinRepository) {
    suspend fun getCoins(): List<CoinListModel> {
        val data = coinRepository.getCoins()
        if (data.isSuccess) {
            return data.getOrNull()!!
        } else {
            return emptyList()
        }
    }
}