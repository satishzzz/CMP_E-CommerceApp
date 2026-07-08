package com.example.data.data_source

import com.example.data.model.CoinDetailDto
import com.example.data.model.CoinDto
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

// this class is similar to APIService.kt

class RemoteDataSource(private val httpClient: HttpClient, baseUrl: String) {

    private val BASE_URL = "https://api.coinpaprika.com/v1" //baseUrl

    private val LISTING_ENDPOINT = "${BASE_URL}/coins"

    suspend fun getCoinListing() : Result<List<CoinDto>>{
        return try {
            val response = httpClient.get(urlString = LISTING_ENDPOINT)
            Result.success(response.body())
        } catch (ex: Exception) {
            print("RESPONSE-> 1"+ex.toString())
            Result.failure(ex)
        }
    }

    suspend fun getCoinById( id: String) : Result<CoinDetailDto>{

        return TODO("Provide the return value")
    }
}