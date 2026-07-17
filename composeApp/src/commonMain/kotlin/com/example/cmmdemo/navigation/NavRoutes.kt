package com.example.cmmdemo.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed interface NavRoutes : NavKey {

    @Serializable
    data object CoinList : NavRoutes, NavKey

    @Serializable
    data object CoinDetails : NavRoutes, NavKey
}