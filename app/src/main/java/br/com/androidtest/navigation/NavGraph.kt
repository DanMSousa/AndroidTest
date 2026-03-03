package br.com.androidtest.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.androidtest.presentation.home.ui.HomeScreen


@ExperimentalMaterial3Api
@Composable
fun NavGraph(
    startDestination: String = Routes.Home.route
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(Routes.Home.route) {
            HomeScreen(navController)
        }
    }
}
