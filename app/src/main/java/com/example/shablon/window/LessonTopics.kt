package com.example.shablon.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shablon.R
import com.example.shablon.window.lesson.Acquaintance
import com.example.shablon.window.lesson.Basics
import com.example.shablon.window.lesson.Independent

@Composable
fun LessonTopics(){
    var windowLessons by remember { mutableStateOf(0) }

    if(windowLessons == 0){
        Column() {
            Card(
                Modifier
                    .clickable { windowLessons = 1 }
                    .padding(10.dp)
                    .weight(1f)
                    .clip(shape = RoundedCornerShape(16.dp))) {
                Image(painter = painterResource(R.drawable.les2), contentDescription = "")
                Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
                    Spacer(modifier = Modifier.weight(1f))
                    Text(text = "Знакомство с Python", Modifier.padding(10.dp), fontSize = 28.sp, textAlign = TextAlign.Center)
                }
            }
            Card(
                Modifier
                    .clickable { windowLessons = 2 }
                    .padding(10.dp)
                    .weight(1f)
                    .clip(shape = RoundedCornerShape(16.dp))) {
                Image(painter = painterResource(R.drawable.les1), contentDescription = "")
                Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
                    Spacer(modifier = Modifier.weight(1f))
                    Text(text = "Основы кодинга", Modifier.padding(10.dp), fontSize = 28.sp, textAlign = TextAlign.Center)
                }
            }
            Card(
                Modifier
                    .clickable { windowLessons = 3 }
                    .padding(10.dp)
                    .weight(1f)
                    .clip(shape = RoundedCornerShape(16.dp))) {
                Image(painter = painterResource(R.drawable.les3), contentDescription = "")
                Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
                    Spacer(modifier = Modifier.weight(1f))
                    Text(text = "Самостоятельная работа", Modifier.padding(10.dp), fontSize = 28.sp, textAlign = TextAlign.Center)
                }
            }
        }
    }
    else if(windowLessons == 1){
        Acquaintance()
    }
    else if(windowLessons == 2){
        Basics()
    }
    else if(windowLessons == 3){
        Independent()
    }


}