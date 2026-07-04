package com.example.presentation.feature.coint_list

data class CoinListUiState(
    val coinList: List<String> = emptyList(),
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)
