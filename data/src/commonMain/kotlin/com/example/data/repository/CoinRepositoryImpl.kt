package com.example.data.repository

import com.example.data.data_source.RemoteDataSource
import com.example.data.mapper.CoinMapper
import com.example.domain.model.CoinListModel
import com.example.domain.repository.coin_list.CoinRepository

class CoinRepositoryImpl(val apiService: RemoteDataSource) : CoinRepository {
    override suspend fun getCoins(): Result<List<CoinListModel>> {
        val dtos = apiService.getCoinListing()
        if (dtos.isSuccess) {
            val listings = dtos.getOrNull()!!
            val models = CoinMapper.toDomain(listings)
            return Result.success(models)
        } else {
            print("RESPONSE-> 2"+dtos.exceptionOrNull()!!)
            throw dtos.exceptionOrNull()!!
        }

    }
}