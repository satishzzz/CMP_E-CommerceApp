package com.example.data.model

import kotlinx.serialization.Serializable

@Serializable
data class CoinDto(
    val id: String,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String