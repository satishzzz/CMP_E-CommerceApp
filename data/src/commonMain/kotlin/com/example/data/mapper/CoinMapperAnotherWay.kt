package com.example.data.mapper

import com.example.data.CoinDto
import com.example.domain.model.CoinListModel

object CoinMapperAnotherWay {
    fun toCoinListModel(coinDto: CoinDto): CoinListModel {
        return CoinListModel(
            name = coinDto.name,
            type = coinDto.type
        )
    }

    fun toCoinDetailModel(){

    }
}