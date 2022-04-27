package com.example.project_1

sealed class Screen (val route : String){

    object Loginscreen : Screen("login_screen")
    object Homescreen : Screen("main_screen")
    object Searchscreen : Screen("search_screen")
object RegisterPage : Screen("register_page")
    object ProfilePage : Screen("profile_page")
    object Addreview : Screen("addreview")
    object Reviewscreen : Screen("reviews")
    object Review2 : Screen(route = "prl")
    object Artificial : Screen("arti")
}