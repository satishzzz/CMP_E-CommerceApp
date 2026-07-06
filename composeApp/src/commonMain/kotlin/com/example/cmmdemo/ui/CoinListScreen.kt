package com.example.cmmdemo.ui

import androidx.compose.runtime.Composable
import com.example.presentation.feature.coint_list.CoinListingVM
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun CoinListScreen(coinListingVM: CoinListingVM = koinViewModel()){

}