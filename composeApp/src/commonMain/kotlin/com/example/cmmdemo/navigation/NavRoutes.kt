package com.example.cmmdemo.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed interface NavRoutes {

    @Serializable
    data object CoinList : NavRoutes

    @Serializable
    data object CoinDetails : NavRoutes
}
