package com.example.project_1.reviews

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.project_1.ImageHead
import com.example.project_1.R
import com.example.project_1.Screen
import com.example.project_1.TextDetail
import com.example.project_1.ui.theme.lightWhite

@Composable
fun Reviewt(navController: NavController){
    Box(modifier = Modifier.background(lightWhite)){

        TextDetail("4.8","4.5","3.9","4.2","4.6","3.8","4.9")
        ImageHead(painter = painterResource(id = R.drawable.praveen), title = "Dr. Praveen Lalwani", contentDescription = "", rate = "3.9" , regno = "100100" , qual = "Assistant Professor")
    }
    Icon(Icons.Default.ArrowBack, contentDescription = "back", modifier = Modifier
        .padding(10.dp)
        .clickable { navController.navigate(Screen.Homescreen.route) }, tint = Color.Black)
}