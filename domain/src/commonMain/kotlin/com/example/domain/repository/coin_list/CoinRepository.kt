package com.example.domain.repository.coin_list

import com.example.domain.model.CoinListModel

interface CoinRepository {
    suspend fun getCoins(): Result<List<CoinListModel>>
}