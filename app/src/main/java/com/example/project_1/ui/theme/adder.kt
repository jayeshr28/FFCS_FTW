package com.example.project_1.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import com.example.project_1.R


class DropDown2 {
    var enabled by mutableStateOf(false)
    var value by mutableStateOf("",)
    var selectedIndex by mutableStateOf(-1)
    var size by mutableStateOf(Size.Zero)
    val icon: Int
        @Composable get() = if(enabled){
            R.drawable.baseline_arrow_drop_up_24
        }else{
            R.drawable.baseline_arrow_drop_down_24
        }

    val items = (1..5).map{
        "$it"
    }
//        mutableStateListOf(
//            "1",
//            "2",
//            "3",
//            "4",
//            "5"
//        )

    fun onEnabled(newValue:Boolean){
        enabled = newValue
        Color.Black
    }
    fun onSelectedIndex(newValue:Int){
        selectedIndex = newValue
        value = items[selectedIndex]
        Color.Black
    }
    fun onSize(newValue: Size){
        size=newValue

    }
}

@Composable
fun rememberExposedMenuStateHolder2() = remember{
    DropDown2()
}

@Composable
fun MainScr2(){
    val stateHolder2 = rememberExposedMenuStateHolder2()
    ExposedDropDownMenu2(stateHolder = stateHolder2)
}

@Composable
fun ExposedDropDownMenu2(stateHolder:DropDown2){
    Column() {
        Box{
            OutlinedTextField(
                value = stateHolder.value,
                onValueChange = {stateHolder.value = it},

                label = { Text(text = "Rate", color = Color.Blue) },

                colors = TextFieldDefaults.outlinedTextFieldColors(
                    Color.Black,
                    focusedBorderColor = MaterialTheme.colors.secondary,
                    unfocusedBorderColor = MaterialTheme.colors.secondary,
                    focusedLabelColor = MaterialTheme.colors.secondary,
                    cursorColor = Color.Black
                ),

                trailingIcon = {
                    Icon(
                        painter = painterResource(id = stateHolder.icon),
                        contentDescription = null,

                        Modifier.clickable { stateHolder.onEnabled(!(stateHolder.enabled)) },
                        tint = Color.Black
                    )
                },


                modifier = Modifier
                    .onGloballyPositioned { stateHolder.onSize(it.size.toSize()) }
                    .padding(10.dp)



            )
        }
        DropdownMenu(
            expanded = stateHolder.enabled,
            onDismissRequest = { stateHolder.onEnabled((false))},
            modifier = Modifier.width(with(LocalDensity.current){stateHolder.size.width.toDp()})
        ){
            stateHolder.items.forEachIndexed { index, s ->
                DropdownMenuItem(
                    onClick = {
                        stateHolder.onSelectedIndex(index)
                        stateHolder.onEnabled(false)
                    }) {
                    Text(text = s)
                } }
        }
    }


}


