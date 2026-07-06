package com.example.presentation.feature.coint_list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.usecase.CoinListUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CoinListingVM(val coinListUseCase: CoinListUseCase) : ViewModel() {

    private val _uiState = MutableStateFlow(CoinListUiState())
    val state = _uiState.asStateFlow()

    init {
        getCoinListings()
    }

    fun getCoinListings() {
        viewModelScope.launch {
            _uiState.value =
                _uiState.value.copy(isLoading = true, errorMessage = null, coinList = emptyList())
            try {
                coinListUseCase.getCoins().let { listings ->
                    _uiState.value = _uiState.value.copy(
                        coinList = listings,
                        isLoading = false,
                        errorMessage = null
                    )
                }
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    errorMessage = "Failed to load listings: ${e.message}"
                )
            }
        }
    }
}