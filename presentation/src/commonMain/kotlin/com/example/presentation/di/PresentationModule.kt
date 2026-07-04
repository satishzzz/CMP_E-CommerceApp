package com.example.presentation.di

import com.example.domain.usecase.CoinListUseCase
import com.example.presentation.feature.coint_list.CoinListingVM
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel { CoinListingVM(get<CoinListUseCase>()) }
}