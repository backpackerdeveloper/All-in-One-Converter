package com.shubhamtripz.allinoneconverter.ui.features.compressimage


import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CompressImageScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Compress Image")
        Spacer(modifier = Modifier.height(16.dp))

        // Add more components for the image compression functionality here

        Button(onClick = { /* Handle the compression logic */ }) {
            Text("Compress")
        }
    }
}
