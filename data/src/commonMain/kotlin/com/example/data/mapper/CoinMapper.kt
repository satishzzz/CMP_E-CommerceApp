package com.example.data.mapper

import com.example.data.model.CoinDto
import com.example.domain.model.CoinListModel

object CoinMapper {
    fun toCoinListModel(coinDto: CoinDto): CoinListModel {
        return CoinListModel(
            name = coinDto.name,
            type = coinDto.type
        )
    }

    fun toDomain(dtos: List<CoinDto>): List<CoinListModel> {
        return dtos.map { toCoinListModel(it) }
    }
}