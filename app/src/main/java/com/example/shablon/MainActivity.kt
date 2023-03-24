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
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shablon.ui.theme.ShablonTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            Greeting()
        }
    }
}

@Composable
fun Greeting() {
    val state = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    var window by remember { mutableStateOf(0) }
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

                    DropdownMenuItem({window = 1}) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(text = "Темы уроков ")
                            Spacer(modifier = Modifier.weight(1f))
                            Icon(Icons.Default.Search, "")
                        }
                    }
                    Divider()

                    DropdownMenuItem({window = 2}) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(text = "Статистика ")
                            Spacer(modifier = Modifier.weight(1f))
                            Icon(Icons.Default.Search, "")
                        }
                    }
                    Divider()

                    DropdownMenuItem({window = 3}) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(text = "Настройка ")
                            Spacer(modifier = Modifier.weight(1f))
                            Icon(Icons.Default.Settings, "")
                        }
                    }
                    Divider()

                    Spacer(modifier = Modifier.weight(1f))

                    Divider()
                    DropdownMenuItem({window = 4}) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(text = "О приложении ")
                            Spacer(modifier = Modifier.weight(1f))
                            Icon(Icons.Default.Info, "")
                        }
                    }
                }
            }
        ) {
        }
    }
}
