package com.example.project_1

import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.colorspace.Illuminant.B
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.project_1.ui.theme.Blue500
import com.example.project_1.ui.theme.Epilogue
import com.example.project_1.ui.theme.lightWhite
import java.sql.Types.NULL

@Composable
fun Reviewscreen(navController: NavController){
    Scaffold(
        floatingActionButton = {
        FloatingActionButton(
            backgroundColor = Blue500,
            content = {
                Row (modifier = Modifier.padding(7.dp),horizontalArrangement = Arrangement.SpaceBetween){
                    Icon(
                         Icons.Default.Download,
                        contentDescription = null,
                        tint = Color.White,

                        )

                        Text(text = "Download Notes")
                }


            },
            onClick = { }
        )
    },
        floatingActionButtonPosition = FabPosition.Center
    )
    {
        Box(modifier = Modifier.background(lightWhite)){

            TextDetail("4.8","4.5","3.9","4.2","4.6","3.8","4.9")
            ImageHead(painter = painterResource(id = R.drawable.jino), title = "Jino Ramson", contentDescription = "", rate = "4.5" , regno = "100234" , qual = "Senior Assistant Professor")}
        Icon(Icons.Default.ArrowBack, contentDescription = "back", modifier = Modifier
            .padding(10.dp)
            .clickable { navController.navigate(Screen.Homescreen.route) }, tint = Color.Black)

    }



}



@Composable
fun ImageHead(
    painter: Painter,
    title: String,
    contentDescription : String,
    rate : String,
    regno : String,
    qual : String
){


        Image(
            painter = painter,
            contentDescription = contentDescription,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp)
                .clip(RoundedCornerShape(10.dp))
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 310.dp),
            horizontalArrangement = Arrangement.SpaceBetween){
            Surface(color = Color.Black,
                modifier = Modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .alpha(0.8f)
            ){
                Column(verticalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp, bottom = 15.dp)
                    .height(60.dp)) {
                      Row(modifier = Modifier
                          .width(170.dp)
                          .padding(start = 10.dp, end = 10.dp, top = 10.dp),
        horizontalArrangement = Arrangement.SpaceEvenly) {
        Text(text = title,fontFamily = Epilogue,color = Color.White)

        Icon(Icons.Default.Star, contentDescription = "star", tint = Color.Yellow,modifier = Modifier.size(20.dp))

        Text(text = rate, fontSize = 15.sp,fontFamily = Epilogue, color = Color.White)
    }
                    Text(text = qual,fontFamily = Epilogue,color = Color.White, fontSize = 12.sp,modifier = Modifier.padding(horizontal = 6.dp))
}


            }

            Surface(color = Color.Black,
                modifier = Modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .alpha(0.8f)
            ){
                Column(modifier = Modifier
                    .width(170.dp)
                    .padding(15.dp)) {
                    Row (
                        horizontalArrangement = Arrangement.SpaceEvenly
                            ){
                        Icon(Icons.Default.Group, contentDescription = "info", tint = Color.White)
                        Text(text = "Registration No.",fontFamily = Epilogue, color = Color.White, fontSize = 12.sp, modifier = Modifier.padding(start = 4.dp))}
                    
                    Text(text = regno,fontWeight = FontWeight.Bold, color = Color.White)


                }

            }
        }




}

@Composable
fun TextDetail(
    t1 : String,
    t2 : String,
    t3 : String,
    t4 : String,
    t5 : String,
    t6 : String,
    t7 : String
){
    val scrollState = rememberScrollState()
    Column(modifier = Modifier
        .padding(top = 400.dp)
        .fillMaxSize()
        .background(lightWhite)
        .verticalScroll(state = scrollState),
    verticalArrangement = Arrangement.SpaceEvenly){

        Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Art of Teaching"
                ,color = Color.Black, fontSize = 20.sp, modifier = Modifier
                    .padding(15.dp))
            Row(){
                Icon(Icons.Default.Star, contentDescription = "star",tint = Color.Yellow,modifier = Modifier.size(41.dp))
                Text(text = t1,color = Color.Black, fontSize = 20.sp, modifier = Modifier
                    .padding(15.dp))
            }
        }

        Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Class Interaction"
                ,color = Color.Black, fontSize = 20.sp, modifier = Modifier
                    .padding(15.dp))
            Row(){
                Icon(Icons.Default.Star, contentDescription = "star",tint = Color.Yellow,modifier = Modifier.size(41.dp))
                Text(text = t2,color = Color.Black, fontSize = 20.sp, modifier = Modifier
                    .padding(15.dp))
            }
        }

        Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Level of Question Paper"
                ,color = Color.Black, fontSize = 20.sp, modifier = Modifier
                    .padding(15.dp))
            Row(){
                Icon(Icons.Default.Star, contentDescription = "star",tint = Color.Yellow,modifier = Modifier.size(41.dp))
                Text(text = t3,color = Color.Black, fontSize = 20.sp, modifier = Modifier
                    .padding(15.dp))
            }
        }

        Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Frequency Of Assignments"
                ,color = Color.Black, fontSize = 19.sp, modifier = Modifier
                    .padding(15.dp))
            Row(){
                Icon(Icons.Default.Star, contentDescription = "star",tint = Color.Yellow,modifier = Modifier.size(41.dp))
                Text(text = t4,color = Color.Black, fontSize = 20.sp, modifier = Modifier
                    .padding(15.dp))
            }
        }

        Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Individual Doubt Solving"
                ,color = Color.Black, fontSize = 20.sp, modifier = Modifier
                    .padding(15.dp))
            Row(){
                Icon(Icons.Default.Star, contentDescription = "star",tint = Color.Yellow,modifier = Modifier.size(41.dp))
                Text(text = t5,color = Color.Black, fontSize = 20.sp, modifier = Modifier
                    .padding(15.dp))
            }
        }

        Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Paper Checking"
                ,color = Color.Black, fontSize = 20.sp, modifier = Modifier
                    .padding(15.dp))
            Row(){
                Icon(Icons.Default.Star, contentDescription = "star",tint = Color.Yellow,modifier = Modifier.size(41.dp))
                Text(text = t6,color = Color.Black, fontSize = 20.sp, modifier = Modifier
                    .padding(15.dp))
            }
        }

        Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Internal Marking"
                ,color = Color.Black, fontSize = 20.sp, modifier = Modifier
                    .padding(15.dp))
            Row(){
                Icon(Icons.Default.Star, contentDescription = "star",tint = Color.Yellow,modifier = Modifier.size(41.dp))
                Text(text = t7,color = Color.Black, fontSize = 20.sp, modifier = Modifier
                    .padding(15.dp))
            }
        }

        Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Other Remarks"
                ,color = Color.Black, fontSize = 20.sp, modifier = Modifier
                    .padding(15.dp))
            Row(){
//                Icon(Icons.Default.Star, contentDescription = "star",tint = Color.Yellow,modifier = Modifier.size(41.dp))
                Text(text = "Excellent teacher, Always Smiling and have a great positive personality",color = Color.Black, fontSize = 18.sp, modifier = Modifier
                    .padding(15.dp))
            }
        }

    }

}