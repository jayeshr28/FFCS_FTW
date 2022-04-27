package com.example.project_1.ui.theme

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.project_1.Reviewscreen
import com.example.project_1.Screen
import com.example.project_1.Searchscreen
import com.example.project_1.login.RegisterScreen
import com.example.project_1.reviews.Artificial
import com.example.project_1.reviews.Reviewt
import dev.leonardom.loginjetpackcompose.presentation.login.LoginScreen

@ExperimentalMaterialApi
@Composable
fun Navigation(
    navController : NavHostController
){

    NavHost(navController = navController, startDestination = Screen.Loginscreen.route ){
        composable(route = Screen.Homescreen.route){
            HomeScreen(navController = navController)
        }
        composable(route = Screen.Searchscreen.route){
            Searchscreen(navController = navController)
        }
        composable(route = Screen.Loginscreen.route){
            LoginScreen(navController = navController)
        }
        composable(route = Screen.RegisterPage.route){
            RegisterScreen(navController = navController)
        }
        composable(route = Screen.ProfilePage.route){
            ProfilePage(navController = navController)
        }

        composable(route = Screen.Addreview.route){
            AddReview(navController = navController)
        }

        composable(route = Screen.Reviewscreen.route){
            Reviewscreen(navController = navController)
        }

        composable(route = Screen.Review2.route){
            Reviewt(navController = navController)
        }

        composable(route = Screen.Artificial.route){
            Artificial(navController = navController)
        }
        composable(route = Screen.Artificial.route){
            Artificial(navController = navController)
        }
        composable(route = Screen.Artificial.route){
            Artificial(navController = navController)
        }
        composable(route = Screen.Artificial.route){
            Artificial(navController = navController)
        }
        composable(route = Screen.Artificial.route){
            Artificial(navController = navController)
        }
        composable(route = Screen.Artificial.route){
            Artificial(navController = navController)
        }


    }
}