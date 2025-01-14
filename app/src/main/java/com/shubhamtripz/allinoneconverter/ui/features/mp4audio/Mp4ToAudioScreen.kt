package com.shubhamtripz.allinoneconverter.ui.features.mp4audio

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Mp4ToAudioScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Convert MP4 to Audio")
        Spacer(modifier = Modifier.height(16.dp))

        // Add more components for the MP4 to Audio functionality here

        Button(onClick = { /* Handle the conversion logic */ }) {
            Text("Convert")
        }
    }
}
