package com.example.data.repository

import com.example.data.data_source.RemoteDataSource
import com.example.data.mapper.CoinMapper
import com.example.data.model.CoinDetailDto
import com.example.data.model.toCoinDetailModel
import com.example.domain.model.CoinDetailModel
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
            print("RESPONSE-> 2" + dtos.exceptionOrNull()!!)
            throw dtos.exceptionOrNull()!!
        }

    }

    override suspend fun getCoinById(id: String): Result<CoinDetailModel> {
        val dtos = apiService.getCoinById(id)
        if (dtos.isSuccess) {
            val details = dtos.getOrNull()
            val models = details?.toCoinDetailModel()!!
            return Result.success(models)
        } else {
            throw dtos.exceptionOrNull()!!
        }
    }
}