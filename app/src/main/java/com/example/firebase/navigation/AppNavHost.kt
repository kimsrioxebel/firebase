package com.example.firebase.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebase.ui.theme.screens.login.LoginScreen
import com.example.firebase.ui.theme.screens.register.RegisterScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController = rememberNavController(),

               startDestination: String= ROUTE_HOME) {
    NavHost(navController = navController, modifier = modifier, startDestination = startDestination) {

        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER) {
            RegisterScreen(navController)
        }
        composable(ROUTE_ADD_PRODUCT) {
//            productsscreen(navController)
        }
        composable(ROUTE_UPDATE_PRODUCT) {
//            productsscreen(navController)
        }
        composable(ROUTE_VIEW_PRODUCT) {
//            productsscreen(navController)
        }
        composable(ROUTE_VIEW_UPLOAD) {
//            productsscreen(navController)
        }

    }
}
