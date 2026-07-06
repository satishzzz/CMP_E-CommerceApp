package com.example.cmmdemo

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import com.example.cmmdemo.ui.CoinListScreen
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App() {
    MaterialTheme {
        CoinListScreen()
    }
}