package br.com.androidtest.navigation

sealed class Routes(val route: String) {
    object Home : Routes("home")
    object MyData : Routes("my_data")
    object MyPlan : Routes("my_plan")
}
