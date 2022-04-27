package com.example.project_1.ui.theme

import android.util.Log.d
import android.widget.Toast

import androidx.compose.compiler.plugins.kotlin.ComposeFqNames.remember
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowDropUp
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.geometry.Size

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.IntSize.Companion.Zero
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.project_1.R
import com.example.project_1.Screen
import com.example.searchview.ListViewModel
import com.google.firebase.database.snapshot.Index
import dev.leonardom.loginjetpackcompose.presentation.components.RoundedButton
import dev.leonardom.loginjetpackcompose.presentation.components.TransparentTextField
import java.lang.reflect.Array.get

//class Add{
//    var enabled by mutableStateOf(false)
//        val icon:Int
//       @Composable get() = if(enabled){
//          R.drawable.sear
//        }else{
//
//        }

//    fun onSelect(){
//
//    }
//}
@ExperimentalMaterialApi
@Composable
fun AddReview(navController: NavController){
    val textvalue = rememberSaveable{ mutableStateOf("") }
    val focusManager = LocalFocusManager.current
 val scrollState = rememberScrollState()


    Column() {
        Text(text = "Add Your Review Here",
        fontSize = 25.sp,
        color = Color.Cyan,
        fontFamily = Epilogue,
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth()
        )

        Box(modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color.White,
                        lightWhite

                    )
                )
            )

        ){
            Column (modifier = Modifier.verticalScroll(scrollState)){
                val stateHolder = rememberExposedMenuStateHolder()
                MainScr()
//                Text(text = "Name of the Faculty",
//                    fontSize = 15.sp,
//                    color = Blue500,
//                    fontFamily = Epilogue,
//                    modifier = Modifier
//                        .padding(25.dp)
//                        .fillMaxWidth()
//                )
//                TransparentTextField(
//                    textFieldValue = textvalue,
//                    textLabel = "Enter the Name of Faculty",
//                    modifier = Modifier
//                        .background(lightWhite)
//                        .align(CenterHorizontally)
//                        .width(350.dp),
////                        .padding(15.dp),
//                    keyboardType = KeyboardType.Text,
//                    keyboardActions = KeyboardActions(
//                        onNext = {
//                            focusManager.moveFocus(FocusDirection.Up)
//                        }
//                    ),
//                    imeAction = ImeAction.Next

//                )
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(25.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
                    ) {
                  Text(
                        text = "Art of Teaching", fontSize = 20.sp,
                        color = Blue500,
                        fontFamily = Epilogue,
                        modifier = Modifier

                    )
MainScr2()


                    }

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(25.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Class Interaction", fontSize = 20.sp,
                        color = Blue500,
                        fontFamily = Epilogue,
                        modifier = Modifier

                    )

MainScr2()


                }

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(25.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Level Of Question Paper", fontSize = 15.sp,
                        color = Blue500,
                        fontFamily = Epilogue,
                        modifier = Modifier

                    )

                    MainScr2()
                }

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(25.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Frequency Of Assignment", fontSize = 15.sp,
                        color = Blue500,
                        fontFamily = Epilogue,
                        modifier = Modifier

                    )
                    MainScr2()
                }

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(25.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Individual Doubt Solving", fontSize = 15.sp,
                        color = Blue500,
                        fontFamily = Epilogue,
                        modifier = Modifier

                    )
                    MainScr2()
                }

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(25.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Paper Checking", fontSize = 15.sp,
                        color = Blue500,
                        fontFamily = Epilogue,
                        modifier = Modifier

                    )


                    MainScr2()
                }

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(25.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Internal Marking", fontSize = 15.sp,
                        color = Blue500,
                        fontFamily = Epilogue,
                        modifier = Modifier

                    )
                    MainScr2()
                    }

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(25.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                TransparentTextField(
                    textFieldValue = textvalue,
                    textLabel = "Other Remarks",
                    modifier = Modifier
                        .background(lightWhite)
//                        .align(CenterHorizontally)
                        .width(350.dp),
//                        .padding(15.dp),
                    keyboardType = KeyboardType.Text,
                    keyboardActions = KeyboardActions(
                        onNext = {
                            focusManager.moveFocus(FocusDirection.Up)
                        }
                    ),
                    imeAction = ImeAction.Next

                )
                }
val context = LocalContext.current
                RoundedButton(
                    text = "Submit",
                    modifier = Modifier
                        .align(CenterHorizontally)
                        .padding(10.dp),
                    displayProgressBar = false,
                    onClick = {
                        navController.navigate(route = Screen.Homescreen.route)
                    Toast.makeText(context,"Review Submitted",Toast.LENGTH_SHORT).show()
                    }
                )
                }

}



            }
            }










