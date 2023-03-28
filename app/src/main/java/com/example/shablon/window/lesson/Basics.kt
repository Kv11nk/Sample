package com.example.shablon.window.lesson

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shablon.R

@Composable
fun  Basics(){
    LazyColumn(Modifier.fillMaxSize()){
        item {
            Card(
                Modifier
                    .padding(10.dp)
                    .clip(shape = RoundedCornerShape(16.dp))
                    .fillMaxWidth()
                    .clickable {}
            )
            {
                Image(
                    painter = painterResource(R.drawable.les2),
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(shape = RoundedCornerShape(16.dp)),
                    contentScale = ContentScale.Crop
                )

                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                )
                {
                    Spacer(modifier = Modifier.weight(1f))

                    Text(
                        text = "Знакомство с Python",
                        Modifier.padding(10.dp),
                        fontSize = 28.sp,
                        textAlign = TextAlign.Center,
                        color = Color.White
                    )
                }
            }
        }
        item {
            Card(
                Modifier
                    .padding(10.dp)
                    .clip(shape = RoundedCornerShape(16.dp))
                    .fillMaxWidth()
                    .clickable {}
            )
            {
                Image(
                    painter = painterResource(R.drawable.les2),
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(shape = RoundedCornerShape(16.dp)),
                    contentScale = ContentScale.Crop
                )

                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                )
                {
                    Spacer(modifier = Modifier.weight(1f))

                    Text(
                        text = "Знакомство с Python",
                        Modifier.padding(10.dp),
                        fontSize = 28.sp,
                        textAlign = TextAlign.Center,
                        color = Color.White
                    )
                }
            }
        }
        item {
            Card(
                Modifier
                    .padding(10.dp)
                    .clip(shape = RoundedCornerShape(16.dp))
                    .fillMaxWidth()
                    .clickable {}
            )
            {
                Image(
                    painter = painterResource(R.drawable.les2),
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(shape = RoundedCornerShape(16.dp)),
                    contentScale = ContentScale.Crop
                )

                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                )
                {
                    Spacer(modifier = Modifier.weight(1f))

                    Text(
                        text = "Знакомство с Python",
                        Modifier.padding(10.dp),
                        fontSize = 28.sp,
                        textAlign = TextAlign.Center,
                        color = Color.White
                    )
                }
            }
        }
    }
}