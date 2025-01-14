package com.shubhamtripz.allinoneconverter.ui.features.imagepdf

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ImageToPdfScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Convert Image to PDF")
        Spacer(modifier = Modifier.height(16.dp))

        // Add more components for the image to PDF functionality here

        Button(onClick = { /* Handle the conversion logic */ }) {
            Text("Convert")
        }
    }
}
