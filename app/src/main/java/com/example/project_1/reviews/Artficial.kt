package com.example.project_1.reviews

import android.annotation.SuppressLint
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.project_1.Screen
import com.example.project_1.ui.theme.darkpink
import com.example.searchview.ListViewModel


@ExperimentalMaterialApi
@Composable
fun Artificial(navController: NavController, ) {

    val listViewModel2 = viewModel<ListViewModel2>()
    var isDefaultAppBar by remember{ mutableStateOf(true) }
    val scrollState = rememberScrollState()
    BackHandler(!isDefaultAppBar) {
        if(!isDefaultAppBar)
            isDefaultAppBar = true
    }

    Scaffold(
        topBar = {
            if(isDefaultAppBar)
                DefaultAppBar2("Search", onClick = {isDefaultAppBar = false},)
            else
                isDefaultAppBar = SearchAppBar(listViewModel2)
        }
    ){
        LazyColumn(
            contentPadding = PaddingValues(10.dp),
        ){

            if (!isDefaultAppBar) {
                items(listViewModel2.searchList) {item->



                    ListItem(
                        icon = { Icon(Icons.Default.List, null) },
                        text = {
                            Text(item, fontSize = 18.sp, fontWeight = FontWeight.W600,modifier = Modifier.clickable {})
                        }

                    )



                }
            } else {
                items(listViewModel2.bookList) { item->
                    ListItem(
                        icon = { Icon(Icons.Default.List, null) },
                        text = {
                            Text(item, fontSize = 18.sp, fontWeight = FontWeight.W600,modifier = Modifier.clickable {navController.navigate(route = Screen.Reviewscreen.route)})
                        }

                    )

                }
            }
        }
    }
}

@Composable
fun DefaultAppBar2(
    title: String,
    onClick : ()-> Unit,
    modifier: Modifier = Modifier
){
    TopAppBar(
        title = { Text(title) },
        modifier = modifier,
        contentColor = Color.Black,
        backgroundColor =  Color.Blue,
        elevation = AppBarDefaults.TopAppBarElevation,
        actions = {
            IconButton(onClick = onClick) {
                Icon(Icons.Default.Search, null)
            }
        }
    )
}

@SuppressLint("ComposableNaming")
@Composable
fun SearchAppBar(listViewModel2: ListViewModel2): Boolean{
    var searchItem by remember{ mutableStateOf("") }
    var visible by remember{ mutableStateOf(false) }

    Surface(
        elevation = AppBarDefaults.TopAppBarElevation
    ) {
        TextField(
            value = searchItem,
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                cursorColor = Color.DarkGray,
                unfocusedIndicatorColor = Color.White,
                focusedIndicatorColor = Color.White
            ),
            textStyle = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.W500),
            onValueChange = {
                searchItem = it
                searchBook(it, listViewModel2)
            },
            placeholder = { Text("Search...", color = Color.DarkGray) },
            leadingIcon = {
                IconButton(
                    onClick = { visible = !visible }
                ) { Icon(Icons.Default.ArrowBack, null, tint = Color.Black) }
            },
            trailingIcon = {
                IconButton(
                    onClick = {
                        if (searchItem == "")
                            visible = !visible
                        else
                            searchItem = ""
                    }
                ) { Icon(Icons.Default.Clear, null, tint = Color.Black) }
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
        )
    }
    return visible
}


fun searchBook(query: String, listViewModel2: ListViewModel2) {
    listViewModel2.searchList.clear()
    for(faculty in listViewModel2.bookList){
        if(faculty.lowercase().contains(query.lowercase()))
            listViewModel2.searchList.add(faculty)
    }
}
