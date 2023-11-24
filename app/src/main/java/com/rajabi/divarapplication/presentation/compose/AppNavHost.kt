package com.rajabi.divarapplication.presentation.compose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.rajabi.divarapplication.presentation.compose.advertising.AdvertisingScreen
import com.rajabi.divarapplication.presentation.compose.advertising.DetailScreen
import com.rajabi.divarapplication.presentation.compose.city.CityScreen
import com.rajabi.divarapplication.presentation.viewmodel.CityViewModelFactory

@Composable
fun AppNavHost(
    factory: CityViewModelFactory,
    navController: NavHostController = rememberNavController()
) {
    NavHost(navController = navController, startDestination ="city_screen"){
        composable(route="city_screen"){
            CityScreen(
                onNavigateToAdvertisingScreen = {
                    navController.navigate("advertising_screen/$it")},
                factory = factory
            )
        }
        composable(route="advertising_screen/{cityId}",
            arguments = listOf(
                navArgument("cityId"){
                    type = NavType.IntType
                }
            )
        ){
            AdvertisingScreen(factory=factory,
                cityId =it.arguments?.getInt("cityId")
            )
        }
        composable(route="detail_screen"){
            DetailScreen()
        }
    }
}