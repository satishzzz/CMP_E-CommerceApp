package com.example.data.di

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.example.data.data_source.CacheDataSource
import com.example.data.data_source.RemoteDataSource
import com.example.data.repository.AuthRepositoryImpl
import com.example.data.repository.CoinRepositoryImpl
import com.example.domain.repository.auth.AuthRepository
import com.example.domain.repository.coin_list.CoinRepository
import io.ktor.client.HttpClient
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.DEFAULT
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.header
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.dsl.module

val dataModule = module {
    single<HttpClient> {
        HttpClient {
            install(ContentNegotiation) {
                json(Json {
                    ignoreUnknownKeys = true
                    isLenient = true
                    prettyPrint = true
                })
            }
            install(Logging) {
                level = LogLevel.ALL
                logger = Logger.DEFAULT
            }
            install(DefaultRequest) {
                header(HttpHeaders.ContentType, ContentType.Application.Json)
            }
        }
    }

    single { RemoteDataSource(httpClient = get<HttpClient>(), get()) }
    single { CacheDataSource(dataStore = get<DataStore<Preferences>>()) }

    single<AuthRepository> {
        AuthRepositoryImpl(get<RemoteDataSource>())
    }

    single<CoinRepository> {
        CoinRepositoryImpl(get<RemoteDataSource>())
    }
}