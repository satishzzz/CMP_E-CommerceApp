package com.example.presentation.feature.coint_list

import androidx.lifecycle.ViewModel
import com.example.domain.usecase.CoinListUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class CoinListingVM(val coinListUseCase: CoinListUseCase) : ViewModel() {

    private val _uiState = MutableStateFlow(CoinListUiState())
    val state = _uiState.asStateFlow()
}