package com.example.shablon.window.lesson

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TEST(){
    Column(Modifier.fillMaxWidth()) {
        Text(TitleLess(), Modifier.padding(10.dp))
        Text(TextLess(), Modifier.padding(10.dp))
    }
}