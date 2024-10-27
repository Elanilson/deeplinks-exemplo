package br.com.deeplinkexemplo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.navDeepLink
import br.com.deeplinkexemplo.navegacao.TelaBem_vindo
import br.com.deeplinkexemplo.navegacao.TelaDetalhes
import br.com.deeplinkexemplo.navegacao.TelaHome
import br.com.deeplinkexemplo.navegacao.TelaLogin
import br.com.deeplinkexemplo.rota.Routes
import br.com.deeplinkexemplo.ui.theme.DeepLinkExemploTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  enableEdgeToEdge()
        setContent {
            DeepLinkExemploTheme {
              //  Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = Routes.Home.rota ){
                        composable(Routes.Home.rota, deepLinks = listOf(navDeepLink {
                            uriPattern = "https://elanilson.dev/home"
                        })){ TelaHome(navController = navController)}
                        composable(Routes.Login.rota, deepLinks = listOf(navDeepLink {
                            uriPattern = "https://elanilson.dev/login"
                        })){ TelaLogin(navController = navController)}
                        composable(Routes.Detalhes.rota, deepLinks = listOf(navDeepLink {
                            uriPattern = "https://elanilson.dev/detalhes"
                        })){ TelaDetalhes(navController = navController)}
                        composable(Routes.bem_vindo.rota,
                            deepLinks = listOf( navDeepLink { uriPattern = "https://elanilson.dev/bem_vindo/{nome}" }),
                            arguments = listOf(navArgument("nome"){type = NavType.StringType})){ navBackStackEntry ->
                            TelaBem_vindo(nome = navBackStackEntry.arguments?.getString("nome").orEmpty(), navController = navController )
                        }
                    }
                //}
            }
        }
    }
}

