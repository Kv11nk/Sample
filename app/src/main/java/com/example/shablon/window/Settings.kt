package com.example.shablon.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Settings(){
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
        Card(
            Modifier
                .padding(10.dp)
                .clip(shape = RoundedCornerShape(12.dp))
                .fillMaxWidth(0.95f)
                .size(70.dp)
                .clickable { }
        ) {
            Text(text = "Язык",
                Modifier
                    .clip(shape = RoundedCornerShape(12.dp))
                    .background(Color.Blue)
                    .fillMaxSize(),
                fontSize = 32.sp,
                textAlign = TextAlign.Center,
                color = Color.White
            )
        }
        Card(
            Modifier
                .padding(10.dp)
                .clip(shape = RoundedCornerShape(12.dp))
                .fillMaxWidth(0.95f)
                .size(70.dp)
                .clickable { }
        ) {
            Text(text = "Смена темы",
                Modifier
                    .clip(shape = RoundedCornerShape(12.dp))
                    .background(Color.Blue)
                    .fillMaxSize(),
                fontSize = 32.sp,
                textAlign = TextAlign.Center,
                color = Color.White
            )
        }
    }
}