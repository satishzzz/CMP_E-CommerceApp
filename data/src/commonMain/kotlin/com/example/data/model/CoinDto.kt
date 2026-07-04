package com.example.data.model

import com.example.domain.model.CoinListModel
import kotlinx.serialization.Serializable

@Serializable
data class CoinDto(
    val id: String,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String)



/*
 we can also create mapper in the same dto class like below, extension function
 you can create in the same class

data class CoinDto(
    val id: String,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

fun CoinDto.toCoin(): CoinListModel {
    return CoinListModel(
        name = name,
        type = type,
    )
}*/
