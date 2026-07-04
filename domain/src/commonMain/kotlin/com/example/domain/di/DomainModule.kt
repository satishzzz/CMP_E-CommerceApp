package com.example.domain.di

import com.example.domain.repository.coin_list.CoinRepository
import com.example.domain.usecase.CoinListUseCase
import org.koin.dsl.module

val domainModule = module {
    factory { CoinListUseCase(get<CoinRepository> ()) }
}