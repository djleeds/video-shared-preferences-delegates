package com.daveleeds.example

import android.content.Context
import androidx.activity.ComponentActivity
import com.daveleeds.example.data.SettingsRepository
import com.daveleeds.example.viewmodel.SettingsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

fun koinAppModule(context: Context) = module {
    single { SettingsRepository(get()) }
    single { context.getSharedPreferences("shared-preferences-delegates-example", ComponentActivity.MODE_PRIVATE) }
    viewModel { SettingsViewModel(get()) }
}
