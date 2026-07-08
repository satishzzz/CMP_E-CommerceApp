package com.example.cmmdemo.ui.coin_listing

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.presentation.feature.coint_list.CoinListingVM
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun CoinListScreen(coinListingVM: CoinListingVM = koinViewModel()) {

    val dataState = coinListingVM.state.collectAsStateWithLifecycle()
    Scaffold {
        Box(modifier = Modifier.fillMaxSize().padding(it)) {
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(dataState.value.coinList) { item ->
                    CoinListItem(
                        coin = item,
                        onItemClick = {}
                    )

                }
            }
            if (dataState.value.isLoading) {
                CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
            }
            if (dataState.value.errorMessage != null) {
                Text(
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 16.dp).align(Alignment.Center),
                    text = "Error is->  " + dataState.value.errorMessage!!
                )
            }
        }
    }
}