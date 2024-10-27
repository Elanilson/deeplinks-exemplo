package br.com.deeplinkexemplo.navegacao

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@Composable
fun TelaHome(navController : NavHostController){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        contentAlignment = Alignment.Center,
    ){
        Text(text = "Home")
    }
}
@Composable
fun TelaLogin(navController : NavHostController){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        contentAlignment = Alignment.Center,
    ){
        Text(text = "Login")
    }
}

@Composable
fun TelaDetalhes(navController : NavHostController){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        contentAlignment = Alignment.Center,
    ){
        Text(text = "Detalhes")
    }
}

@Composable
fun TelaBem_vindo(nome: String, navController : NavHostController){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        contentAlignment = Alignment.Center,
        ){
        Text(text = "Bem-vindo $nome")
    }
}