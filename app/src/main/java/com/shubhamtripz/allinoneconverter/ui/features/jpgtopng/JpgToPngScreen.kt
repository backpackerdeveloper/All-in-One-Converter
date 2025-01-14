package com.shubhamtripz.allinoneconverter.ui.features.jpgtopng

import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun JpgToPngScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Convert JPG to PNG")
        Spacer(modifier = Modifier.height(16.dp))

        // Add more components for the JPG to PNG functionality here

        Button(onClick = { /* Handle the conversion logic */ }) {
            Text("Convert")
        }
    }
}
