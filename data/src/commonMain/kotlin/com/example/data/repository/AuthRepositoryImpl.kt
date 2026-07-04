package com.example.data.repository

import com.example.data.data_source.RemoteDataSource
import com.example.domain.repository.coin_list.CoinRepository

class AuthRepositoryImpl(val apiService: RemoteDataSource): CoinRepository {
    override suspend fun getCoins() {
      apiService.getCoinListing()
    }
}