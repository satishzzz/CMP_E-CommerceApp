package com.example.data.data_source

import com.example.data.model.CoinDto
import com.example.data.model.CoinListingResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

// this class is similar to APIService.kt

class RemoteDataSource(private val httpClient: HttpClient, baseUrl: String) {

    private val BASE_URL = baseUrl
    private val SIGN_IN_ENDPOINT = "${BASE_URL}/auth/login"
    private val REGISTER_ENDPOINT = "${BASE_URL}/auth/register"
    private val LISTING_ENDPOINT = "${BASE_URL}/listings"

    suspend fun getCoinListing() : Result<CoinListingResponse>{
        return try {
            val response = httpClient.get(urlString = LISTING_ENDPOINT)
            Result.success(response.body())
        } catch (ex: Exception) {
            Result.failure(ex)
        }
    }
}