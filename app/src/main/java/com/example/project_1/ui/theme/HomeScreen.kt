package com.example.project_1.ui.theme

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.project_1.Reviewscreen
import com.example.project_1.Screen
import com.example.project_1.login.RegisterScreen
import org.json.JSONObject.NULL

@Composable
fun HomeScreen(navController: NavController){
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                backgroundColor = Blue500,
                content = {
                    Row (modifier = Modifier.padding(7.dp),horizontalArrangement = Arrangement.SpaceBetween){
                        Icon(
                            painter = painterResource(id = com.example.project_1.R.drawable.baseline_add_20),
                            contentDescription = null,
                            tint = Color.White,

                        )
                        
//                        Text(text = "Add Your Review")
                    }
                    

                },
                onClick = { navController.navigate(route = Screen.Addreview.route)}
            )
        },
        floatingActionButtonPosition = FabPosition.End

    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()


        ) {
            val scrollState = rememberScrollState()
            val scrollState1 = rememberScrollState()
            val scrollState2 = rememberScrollState()
//            val username =  rememberSaveable { mutableStateOf("username") }
            Column {
                MessageCard(navController = navController)
                GreetingsCard()
                chiphead(title = "Course")

                Row(modifier = Modifier.horizontalScroll(state = scrollState)) {
                    val painter = painterResource(id = com.example.project_1.R.drawable.ai)
                    val contentDescription = "ai"
                    val title = "Artificial Intelligence"
                    Imagecard(
                        painter = painter,
                        contentDescription = contentDescription,
                        title = title,
                        onClick = {navController.navigate(route = Screen.Artificial.route)}
                    )

                    val painter1 = painterResource(id = com.example.project_1.R.drawable.cyber)
                    val contentDescription1 = "cs"
                    val title1 = "Cyber Security"
                    Imagecard(
                        painter = painter1,
                        contentDescription = contentDescription1,
                        title = title1,
                        onClick = {navController.navigate(route = Screen.Artificial.route)}
                    )

                    val painter4 = painterResource(id = com.example.project_1.R.drawable.aero)
                    val contentDescription4 = "aero"
                    val title4 = "Aerospace"
                    Imagecard(
                        painter = painter4,
                        contentDescription = contentDescription4,
                        title = title4,
                        onClick = {}
                    )


                }
                Row(modifier = Modifier.horizontalScroll(state = scrollState1)) {
                    val painter2 = painterResource(id = com.example.project_1.R.drawable.cs1)
                    val contentDescription2 = "cs"
                    val title2 = "Computer Science Core"
                    Imagecard(
                        painter = painter2,
                        contentDescription = contentDescription2,
                        title = title2,
                        onClick = {}
                    )

                    val painter3 = painterResource(id = com.example.project_1.R.drawable.game)
                    val contentDescription3 = "cs"
                    val title3 = "Gaming"
                    Imagecard(
                        painter = painter3,
                        contentDescription = contentDescription3,
                        title = title3,
                        onClick = {}
                    )

                    val painter5 = painterResource(id = com.example.project_1.R.drawable.bio)
                    val contentDescription5 = "cs"
                    val title5 = "Bioengineering"
                    Imagecard(
                        painter = painter5,
                        contentDescription = contentDescription5,
                        title = title5,
                        onClick = {}
                    )
                }
                chiphead(title = "Latest Updates")
                Column(modifier = Modifier.verticalScroll(scrollState2)) {
                    val text = "College Premises opening soon"
                    val text1 = "Get ready for Offline exams"
                    val painter = painterResource(id = com.example.project_1.R.drawable.college)
                    val contentDescription = "college"
                    newsupdate(
                        text = text,
                        text1 = text1,
                        painter = painter,
                        contentDescription = contentDescription
                    )
                    newsupdate(
                        text = text,
                        text1 = text1,
                        painter = painter,
                        contentDescription = contentDescription
                    )
                }


            }

        }
    }

}



@Composable
fun GreetingsCard(
    name: String = "Jayesh"
){

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Transparent)
                .padding(start = 20.dp, end = 15.dp, bottom = 5.dp)


        ){
            Column(
                verticalArrangement = Arrangement.Center,


            ){
                Text(
                    text = "Good Morning, $name" ,
                    fontFamily = Montserrat,
                    style = MaterialTheme.typography.h4,
                    color = Color.White
                )
                Text(
                    text = "Wish You best for FFCS",
                    fontFamily = Montserrat,
                    fontSize = 19.sp

                )


            }
//            Icon(painterResource(id = com.example.project_1.R.drawable.baseline_search_24),
//                contentDescription = "search",
//                modifier = Modifier
//                    .size(32.dp)
//                    .clickable {
//                    }
//            )

        }
    }



@Composable
fun MessageCard(navController: NavController) {
    val context = LocalContext.current // Add padding around our message
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,

        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 20.dp)) {
        Image(
            painter = painterResource(com.example.project_1.R.drawable.pro),
            contentDescription = "Contact profile picture",

            modifier = Modifier

                // Set image size to 40 dp
                .size(45.dp)
                // Clip image to be shaped as a circle
                .clip(CircleShape)
                .clickable { navController.navigate(route = Screen.ProfilePage.route) }
        )

        Icon(
            painter = painterResource(com.example.project_1.R.drawable.baseline_search_24),
            contentDescription = "Search",
            modifier = Modifier
                .clickable {
                    navController.navigate(route = Screen.Searchscreen.route)
                }
                // Set image size to 40 dp
                .size(33.dp)
                // Clip image to be shaped as a circle

        )




    }
}

//@Composable
//fun Catergories(
//    chips: List<String>,
//    title: String
//){  Column {
//    Box(modifier = Modifier
//        .padding(start = 17.dp, top = 15.dp, bottom = 0.dp)
//        .fillMaxWidth()
//
//    ){
//        Text(
//            text = title,
//            style = TextStyle(fontSize = 20.sp),
//            fontWeight = FontWeight.Bold
//            )
//    }
//    var selectedChipIndex by remember {
//        mutableStateOf(0)
//    }
//    LazyRow{
//        items(chips.size){
//            Box(modifier = Modifier
//                .padding(start = 15.dp, top = 15.dp, bottom = 15.dp)
//                .clickable {
//                    selectedChipIndex = it
//                }
//                .clip(RoundedCornerShape(10.dp))
//                .background(
//                    if (selectedChipIndex == it) Teal200
//                    else DarkGreen

//                )
//                .padding(15.dp)
//            ){
//                Text(text = chips[it], color = Color.Black)
//            }
//        }
//    }
//}
//}

@Composable
fun Imagecard(
    painter: Painter,
    contentDescription: String,
    title: String,
    onClick : ()-> Unit,
    modifier: Modifier = Modifier
) {
    Card (
        modifier = modifier
            .width(160.dp)

            .padding(start = 10.dp, top = 8.dp, bottom = 7.dp, end = 10.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(10.dp),
     elevation = 5.dp

    ){
        Box(modifier= Modifier.height(150.dp)


        ){
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop

            )
            Box(modifier = Modifier
                .fillMaxSize()

                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ),
                        startY = 300f

                    )

                )
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                contentAlignment = Alignment.BottomCenter
            ){
                Text(
                    text = title,
                    color = Color.White,
                    fontSize = 17.sp,
                    textAlign = TextAlign.Center,
                    fontFamily = Epilogue
                )

            }

        }
    }
}

@Composable
fun addButton(){
Scaffold(
    floatingActionButton = {
        FloatingActionButton(
        backgroundColor = Blue500,
        content = {
            Icon(
                painter = painterResource(id = com.example.project_1.R.drawable.baseline_add_20),
                contentDescription = null,
                tint = Color.White

            )

        },
            onClick = { /*TODO*/ }
        )
    },
    floatingActionButtonPosition = FabPosition.End

){
}


}

@Composable
fun chiphead(
    title: String
){
    Box(modifier = Modifier

        .padding(20.dp)
        .clip(RoundedCornerShape(10.dp))
        .background(lightblue)
//        .fillMaxWidth()
    )
    {
       Box(modifier = Modifier
           .padding(start = 15.dp, end = 15.dp, bottom = 6.dp, top = 6.dp)
//           .fillMaxWidth()
           ) {
               Text(
            text = title,
                   fontFamily = Montserrat,
        fontSize = 20.sp,
color = Color.Black
        )
           }
    }
}

@Composable
fun newsupdate(
    text:String,
    text1:String,
painter:Painter,
contentDescription: String
){
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(5.dp)
//        .border(2.dp, Blue500, RoundedCornerShape(5.dp))
    ){
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(21.dp)
            .fillMaxWidth()
            ) {
            Column {
                Text(text = text,
                    fontWeight = FontWeight.Bold,
                    fontFamily = Play,
                    fontSize = 19.sp,
                    color = Color.White
                )
                Text(text = text1,
                    fontWeight = FontWeight.Normal,
                    fontFamily = Play,
                    fontSize = 13.sp,
                    color = lightWhite
                )
            }

                Image(
                    painter = painter,
                    contentDescription = contentDescription,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(45.dp)
                        .clip(
                            RoundedCornerShape(4.dp)
                        )
                )


        }
        }
}



@Composable
fun Clickable(
    onClick: (() -> Unit)? = null,
    consumeDownOnStart: Boolean = false,
    children: @Composable() () -> Unit
){}