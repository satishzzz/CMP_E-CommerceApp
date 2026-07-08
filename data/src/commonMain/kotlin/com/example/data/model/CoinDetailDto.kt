package com.example.data.model

import com.example.domain.model.CoinDetailModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CoinDetailDto(
    val description: String,
    @SerialName("development_status")
    val developmentStatus: String,
    @SerialName("first_data_at")
    val firstDataAt: String,
)

fun CoinDetailDto.toCoinDetailModel(): CoinDetailModel{
    return CoinDetailModel(
        description = description,
        developmentStatus = developmentStatus,
        firstDataAt = firstDataAt
    )
}
