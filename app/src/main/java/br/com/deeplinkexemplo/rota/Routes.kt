package br.com.deeplinkexemplo.rota

sealed class Routes(val rota : String) {
    object Home : Routes("Home")
    object Login : Routes("Login")
    object Detalhes : Routes("Detalhes")
    object bem_vindo : Routes("bem_vindo/{nome}"){
        fun createRoute(nome : String) = "bem_vindo/$nome"
    }
}