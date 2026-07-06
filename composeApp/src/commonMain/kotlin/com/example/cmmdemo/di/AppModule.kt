package com.example.cmmdemo.di

import com.example.data.di.dataModule
import com.example.domain.di.domainModule
import com.example.presentation.di.presentationModule
import org.koin.core.module.Module

expect fun platformModule(): Module

val appModule = listOf(
    platformModule(), presentationModule, domainModule, dataModule
)