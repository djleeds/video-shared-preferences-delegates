package com.daveleeds.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.daveleeds.example.ui.components.SettingsScreen
import com.daveleeds.example.ui.theme.DefaultGradient
import com.daveleeds.example.ui.theme.ExampleAppTheme
import com.daveleeds.example.viewmodel.SettingsViewModel
import org.koin.androidx.compose.getViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val viewModel: SettingsViewModel = getViewModel()

            ExampleAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    Column {
                        TopAppBar(
                            title = { Text("SharedPreferences Example", color = Color.White) },
                            backgroundColor = Color.Transparent,
                            modifier = Modifier.background(DefaultGradient),
                            elevation = 0.dp
                        )

                        SettingsScreen(
                            viewModel.nickname.value,
                            { viewModel.nickname.value = it },
                            viewModel.turboMode.value,
                            { viewModel.turboMode.value = it },
                            viewModel.throttle.value,
                            { viewModel.throttle.value = it },
                            viewModel::save
                        )
                    }
                }
            }
        }
    }
}
