package com.example.project_1

import android.annotation.SuppressLint
import android.widget.SearchView
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.searchview.ListViewModel
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import com.example.project_1.ui.theme.Clickable
import com.example.project_1.ui.theme.darkpink
import com.example.project_1.ui.theme.pink


@ExperimentalMaterialApi
@Composable
fun Searchscreen(navController: NavController, ) {

    val listViewModel = viewModel<ListViewModel>()
    var isDefaultAppBar by remember{ mutableStateOf(true) }
    val scrollState = rememberScrollState()
    BackHandler(!isDefaultAppBar) {
        if(!isDefaultAppBar)
            isDefaultAppBar = true
    }

    Scaffold(
        topBar = {
            if(isDefaultAppBar)
                DefaultAppBar("Search", onClick = {isDefaultAppBar = false},)
            else
                isDefaultAppBar = SearchAppBar(listViewModel)
        }
    ){
        LazyColumn(
            contentPadding = PaddingValues(10.dp),
        ){

            if (!isDefaultAppBar) {
                items(listViewModel.searchList) {item->



                        ListItem(
                            icon = {Icon(Icons.Default.List, null)},
                            text = {
                                Text(item, fontSize = 18.sp, fontWeight = FontWeight.W600,modifier = Modifier.clickable {})
                            }

                        )



                }
            } else {
                items(listViewModel.bookList) { item->
                    ListItem(
                        icon = {Icon(Icons.Default.List, null)},
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
fun DefaultAppBar(
    title: String,
    onClick : ()-> Unit,
    modifier: Modifier = Modifier
){
    TopAppBar(
        title = {Text(title)},
        modifier = modifier,
        contentColor = Color.Black,
        backgroundColor =  darkpink,
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
fun SearchAppBar(listViewModel: ListViewModel): Boolean{
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
                searchBook(it, listViewModel)
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


fun searchBook(query: String, listViewModel: ListViewModel) {
    listViewModel.searchList.clear()
    for(faculty in listViewModel.bookList){
        if(faculty.lowercase().contains(query.lowercase()))
            listViewModel.searchList.add(faculty)
    }
}
