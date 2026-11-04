package com.example.cmmdemo.di

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.example.data.data_source.createDataStore
import com.example.data.data_source.dataStoreFileName
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun platformModule(): Module = module {
    single<String> { "https://api.coinpaprika.com/" }
    single<DataStore<Preferences>> {
        createDataStore {
            androidContext().filesDir.resolve(dataStoreFileName).absolutePath
        }
    }
}
