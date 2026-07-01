package com.example.cmmdemo.di

import org.koin.core.module.Module
import org.koin.dsl.module

actual fun platformModule(): Module = module {
    single<String> { "https://api.coinpaprika.com/" }
}