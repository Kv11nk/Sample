package com.example.shablon

import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shablon.ui.theme.*
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            MainWindow()
        }
    }
}

@Composable
fun MainWindow() {
    val state = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    var window by remember { mutableStateOf(0) }
    fun close() = scope.launch { state.drawerState.close() }

    ShablonTheme {
        Scaffold(
            scaffoldState = state,
            topBar = {
                TopAppBar() {

                    IconButton({
                        scope.launch {
                            state.drawerState.open()
                        }
                    }) {
                        Icon(Icons.Default.Menu, "")
                    }

                    Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth(0.9f)) {
                        if(window == 0) Text("Темы уроков", fontSize = 24.sp, fontWeight = FontWeight.W600)
                        else if (window == 1) Text("Статистика", fontSize = 24.sp, fontWeight = FontWeight.W600)
                        else if (window == 2) Text("Настройки", fontSize = 24.sp, fontWeight = FontWeight.W600)
                        else if (window == 3) Text("О приложении", fontSize = 24.sp, fontWeight = FontWeight.W600)
                    }
                }
            },
            drawerContent = {
                Column {

                    Row(verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .background(color = MaterialTheme.colors.background)
                            .fillMaxWidth()
                            .padding(bottom = 10.dp, top = 10.dp)
                    ) {
                        Text(text = "Курс python ")
                    }

                    Divider()

                    DropdownMenuItem({
                        window = 0
                        close()
                    }) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(text = "Темы уроков ")
                            Spacer(modifier = Modifier.weight(1f))
                            Icon(Icons.Default.Search, "")
                        }
                    }
                    Divider()

                    DropdownMenuItem({
                        window = 1
                        close()
                    }) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(text = "Статистика ")
                            Spacer(modifier = Modifier.weight(1f))
                            Icon(Icons.Default.DateRange, "")
                        }
                    }
                    Divider()

                    DropdownMenuItem({
                        window = 2
                        close()
                    }) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(text = "Настройка ")
                            Spacer(modifier = Modifier.weight(1f))
                            Icon(Icons.Default.Settings, "")
                        }
                    }
                    Divider()

                    Spacer(modifier = Modifier.weight(1f))

                    Divider()
                    DropdownMenuItem({
                        window = 3
                        close()
                    }) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(text = "О приложении ")
                            Spacer(modifier = Modifier.weight(1f))
                            Icon(Icons.Default.Info, "")
                        }
                    }
                }
            }
        ) {
            if(window == 0) LessonTopics()
            else if (window == 1) Statistics()
            else if (window == 2) Settings()
            else if (window == 3) AboutApplication()
            else Column(Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center){
                Text(text = "ERROR", fontSize = 54.sp)
            }
        }
    }
}
