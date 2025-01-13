package dev.jessica.navigatorjetpack.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                containerColor = Color.Red,
                onClick = { navController.navigate("add") }
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Go to add Screen",
                    tint = Color.White
                )
            }
        },
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Red
                ),
                title = { Text("Cantantes femeninas Ecuatorianas", color = Color.White) })
        }
    )

    { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
                ItemContact("Sharon la Hechicera")
                ItemContact("Dayanara Peralta")
                ItemContact("Azucena Aymara")
                ItemContact("Jenny Rosero")
                ItemContact("Alexandra Cabanilla")
                ItemContact("María Elisa Camargo")
                ItemContact("Mirella Cesa")
                ItemContact("Mariela Condo")
                ItemContact("Pamela Cortés")
                ItemContact("Cristina Morrison")
            }
        }

    }





