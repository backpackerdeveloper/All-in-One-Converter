package com.shubhamtripz.allinoneconverter.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.shubhamtripz.allinoneconverter.R

@Composable
fun HomeScreen(navController: NavController) {
    Column {
        TopAppBar(
            title = { Text("All in One Converter") },
            backgroundColor = Color.Blue,
            contentColor = Color.White
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Quick Action",
            fontSize = 20.sp,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        QuickActionGrid(navController = navController)
    }
}

@Composable
fun QuickActionGrid(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            QuickActionCard(imageResId = R.drawable.pdf, text = "Image to PDF", navController = navController, route = "image_to_pdf", modifier = Modifier.weight(1f))
            QuickActionCard(imageResId = R.drawable.pdf, text = "JPG to PNG", navController = navController, route = "jpg_to_png", modifier = Modifier.weight(1f))
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            QuickActionCard(imageResId = R.drawable.pdf, text = "MP4 to Audio", navController = navController, route = "mp4_to_audio", modifier = Modifier.weight(1f))
            QuickActionCard(imageResId = R.drawable.pdf, text = "Compress Image", navController = navController, route = "compress_image", modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun QuickActionCard(imageResId: Int, text: String, navController: NavController, route: String, modifier: Modifier = Modifier) {
    Card(
        shape = RoundedCornerShape(8.dp),
        elevation = 4.dp,
        modifier = modifier
            .aspectRatio(1f)
            .fillMaxHeight()
            .clickable { navController.navigate(route) }  // Handle click navigation
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(id = imageResId), contentDescription = text, modifier = Modifier.size(48.dp))
            Spacer(modifier = Modifier.height(8.dp))
            Text(text)
        }
    }
}
