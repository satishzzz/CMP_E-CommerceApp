package com.example.data.model

import kotlinx.serialization.Serializable

@Serializable
data class CoinListingResponse(
    val listings: List<CoinDto>,
    val page: Int,
    val pageSize: Int,
    val total: Int
)