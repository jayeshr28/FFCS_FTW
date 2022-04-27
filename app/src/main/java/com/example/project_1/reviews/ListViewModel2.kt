package com.example.project_1.reviews

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import javax.inject.Inject



class ListViewModel2 @Inject constructor() : ViewModel() {

    val bookList = mutableStateListOf(
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

            var searchList = mutableStateListOf<String>()
        }


