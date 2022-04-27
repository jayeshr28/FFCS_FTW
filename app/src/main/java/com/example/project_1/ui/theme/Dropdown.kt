package com.example.project_1.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.material.icons.Icons.Default
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import com.example.project_1.R


class DropDown {
    var enabled by mutableStateOf(false)
    var value by mutableStateOf("")
    var selectedIndex by mutableStateOf(-1)
    var size by mutableStateOf(Size.Zero)
    val icon: Int
        @Composable get() = if(enabled){
            R.drawable.baseline_arrow_drop_up_24
        }else{
            R.drawable.baseline_arrow_drop_down_24
        }

    val items =
        mutableStateListOf(
            "Dr. Praveen Lalwani",
            "Dr. Mamta Agarwal",
            "Dr. Jino Ramson",
            "Dr. E Suganya",
            "Dr. Nidhi Mishra",

            "Dr. Rabia Musheer",
            "Dr. Abha Trivedi",
            "Dr. Kannan",
            "Dr. Manisha Jain",
            "Dr. Anand Motwani",
            "Dr. Sheetal Lalwani",
            "  Dr. Manickavasagam",
            "Dr. Ashish Kumar Sahu",

            "Dr. Shweta Saxena",
            "  Dr. Rizwan Ur Rahman",

            "  Dr. Pallabi Sarkar",

            "Dr. Sandip Mal",
            "Dr. Manas Kumar Mishra",
            "Dr. Sasmita Padhy",
            "Dr. Pradeep Kumar Kayshap",
            "Dr. R. Shriram",
            "Dr.S Balaguru",
            "Dr. Pon Harshavardhanan",
            "Dr. Vinod Bhatt",
            "Dr. Mahendran B",
            "Dr. J. Subash Chandra Bose",
            "Dr. Neha Choubey",
            "Dr. Shweta Mukherjee",
            "Dr. Kanchan Lata Kashyap",
            "Dr. Akshara Makrariya",
            "Dr. Reena Jain",
            "Dr. Alangudi Balaji",
            " Dr. Pushpinder Singh Patheja",
            "Dr. George Chellin Chandran",
            "Dr. Lakshmi .D",
            "Dr. Susant Kumar Panigrahi",
            "Dr. G.L. Balaji",
            "Dr. Ravi Bhatt",
            "Dr. Soumya Sankar Ghosh",
            "Dr. D. Saravanan",
            "Dr. Aprna Tripathi",
            "Dr. Ashok Patel",
            "Dr. Suchetana Sadhukhan",
            "Dr. Shiv Manjaree Gopaliya",
            "Dr. Sountharrajan S",
            "Dr. Debashis Adhikari",
            "Dr. S. Poonkuntran",
            "Dr. Shishir Kumar Shandilya",
            "Dr. Amudhavel J",
            "Dr. M. Xavier Suresh",
            "Dr. Mahendran B",
            "Dr. Md Asdaque Hussain",
            "Dr. Baseera A",
            "Dr. Manoj Acharya",
            "Dr. S. Suthir",
            "Dr. Murugeswari .K"
        )

    fun onEnabled(newValue:Boolean){
        enabled = newValue
    }
    fun onSelectedIndex(newValue:Int){
        selectedIndex = newValue
        value = items[selectedIndex]
    }
    fun onSize(newValue: Size){
        size=newValue

    }
}

@Composable
fun rememberExposedMenuStateHolder() = remember{
    DropDown()
}

@Composable
fun MainScr(){
    val stateHolder = rememberExposedMenuStateHolder()
    ExposedDropDownMenu(stateHolder = stateHolder)
}

@Composable
fun ExposedDropDownMenu(stateHolder:DropDown){
    Column() {
        Box{
            OutlinedTextField(
                value = stateHolder.value,
                onValueChange = {},

                label = { Text(text = "Select Faculty", color = Color.Blue) },
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


