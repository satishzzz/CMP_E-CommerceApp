package com.example.domain.usecase

import com.example.domain.repository.coin_list.CoinRepository

class CoinListUseCase(private val coinRepository: CoinRepository) {
    suspend fun getCoins(){

    }
}