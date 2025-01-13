package dev.jessica.navigatorjetpack.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddScreen (navController: NavHostController) {
    Scaffold (
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Green),
                title = { Text( text = "Cantantes Ecuatorianos Masculinos",color = Color.White)},
                navigationIcon = {
                    IconButton(onClick = {
                        navController.popBackStack()
                    }){
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowLeft,
                            contentDescription = "Go Back")
                    }
                }
            )
        }
    )
    { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            ItemContact("Segundo Rosero")
            ItemContact("David Visbal")
            ItemContact("Marcelo Ruedas")
            ItemContact("Maykel Cedeño")
            ItemContact("Julio Jaramillo")
            ItemContact("Aladino")
            ItemContact("Jaime Enrique Aymara")
            ItemContact("Juan Luis Guerra")
            ItemContact("Gerardo Moan")
            ItemContact("Juan Fernando Velasco")
            }
      }

}
