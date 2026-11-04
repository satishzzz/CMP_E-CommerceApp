package com.example.cmmdemo

import androidx.compose.ui.window.ComposeUIViewController
import com.example.cmmdemo.di.appModule
import org.koin.core.context.startKoin

fun MainViewController() = ComposeUIViewController {
    try {
        startKoin {
            modules(appModule)
        }
    } catch (_: Exception) {
        // Koin already started
    }
    App()
}
