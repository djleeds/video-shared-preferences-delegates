package com.daveleeds.example.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.daveleeds.example.ui.theme.ExampleAppTheme

@Composable
fun SettingsScreen(
    nickname: String,
    onNicknameChange: (String) -> Unit,
    turboMode: Boolean,
    onTurboModeChange: (Boolean) -> Unit,
    throttle: Float,
    onThrottleChange: (Float) -> Unit,
    onSave: () -> Unit
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(32.dp),
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp)
    ) {
        TextField(
            label = { Text("Nickname") },
            value = nickname,
            onValueChange = onNicknameChange,
            modifier = Modifier.fillMaxWidth()
        )

        Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
            Text(
                "Enable Turbo Mode",
                style = MaterialTheme.typography.body1,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
            Switch(
                checked = turboMode,
                onCheckedChange = onTurboModeChange
            )
        }

        Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
            Text(
                "Throttle",
                style = MaterialTheme.typography.body1,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(end = 32.dp)
            )
            Slider(
                value = throttle,
                onValueChange = onThrottleChange,
                valueRange = 1.0f..5.0f
            )
        }

        Button(onClick = onSave, modifier = Modifier.fillMaxWidth()) {
            Text("Save")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ExampleAppTheme {
        SettingsScreen("Jack", {}, true, {}, 3.5f, {}, {})
    }
}
