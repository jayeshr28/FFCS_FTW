package com.example.project_1.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.MotionLayout
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.MotionScene
import androidx.navigation.NavController
import com.example.project_1.R
import com.example.project_1.Screen
import java.sql.Types.NULL


//@Composable
//fun ProfileHeader(){
//    val context = LocalContext.current
//    val motionScene = remember{
//        context.resources
//            .openRawResource(R.raw.motion_scene)
//            .readBytes()
//            .decodeToString()
//    }
//
//    MotionLayout(
//        motionScene = MotionScene(content = motionScene),
//        progress = progress,
//        modifier = Modifier.fillMaxWidth()
//
//    ){
//
//    }
//
//
//
//}

@Composable
fun ProfilePage(navController: NavController){
//    Column {
        Box(
            modifier = Modifier
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            pink,
                            darkpink
                        )
                    )
                )
                .fillMaxWidth()
                .clip(
                    shape = RoundedCornerShape(
                        bottomEndPercent = 8,
                        bottomStartPercent = 8
                    )
                )
                .height(3000.dp),
        ){
            Column(modifier = Modifier.fillMaxSize(),
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {

                    IconButton( onClick = { navController.popBackStack()}) {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_arrow_back_18),
                            contentDescription = "back_arrow",
                            modifier = Modifier.size(25.dp),
                        )
                    }
                }

                Image(
                    painter = painterResource(id = R.drawable.pro), contentDescription = "profilepic",
                    modifier = Modifier
                        .align(CenterHorizontally)
                        .clip(CircleShape)
                        .size(180.dp)
                        .border(width = 2.dp, color = Color.Black, shape = CircleShape)
                )

                Text(text = "Jayesh Rathore",
                    fontSize = 24.sp, color = Color.White,
                    fontFamily = Epilogue,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .align(CenterHorizontally)
                        .padding(top = 5.dp))

                Text(text = "20BCE10981",
                    fontSize = 15.sp,
                    color = lightWhite,
                    fontFamily = Epilogue,
                    modifier = Modifier
                        .align(CenterHorizontally)
                        .padding(2.dp)

                )
                Text(text = "CSE Core",
                    fontSize = 14.sp,
                    color = lightWhite,
                    fontFamily = Epilogue,
                    modifier = Modifier
                        .align(CenterHorizontally)
                        .padding(1.dp)
                )

                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center){
                    TextButton(modifier = Modifier
                        .padding(10.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(color = darkkpink)
                        .border(2.dp,color = Color.White, RoundedCornerShape(12.dp)),
                        onClick = { /*TODO*/ }) {
                        Text(text = "Change Profile Picture", textAlign = TextAlign.Center, fontSize = 13.sp,color = Color.White,
                            modifier = Modifier.padding(5.dp)
                        )
                    }

                    TextButton(modifier = Modifier
                        .padding(10.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(color = darkkpink)
                        .border(2.dp,color = Color.White, RoundedCornerShape(12.dp)),
                        onClick = { /*TODO*/ }) {
                        Text(text = "Change Username", textAlign = TextAlign.Center, fontSize = 13.sp,color = Color.White,
                            modifier = Modifier.padding(5.dp)
                        )
                    }

            }
                TextButton(modifier = Modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(color = darkkpink)
                    .border(2.dp,color = Color.White, RoundedCornerShape(10.dp)),
                    onClick = { navController.navigate(route = Screen.Loginscreen.route) }) {
                    Text(text = "Log Out", textAlign = TextAlign.Center, fontSize = 13.sp,color = Color.White,
                        modifier = Modifier.padding(5.dp)
                            .fillMaxWidth()
                            .align(CenterVertically)
                    )

                }
            }
    }




//    }
}