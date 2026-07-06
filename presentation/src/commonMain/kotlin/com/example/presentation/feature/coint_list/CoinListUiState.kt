package com.example.presentation.feature.coint_list

import com.example.domain.model.CoinListModel

data class CoinListUiState(
    val coinList: List<CoinListModel> = emptyList(),
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)