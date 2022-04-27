package com.example.project_1.login

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import javax.inject.Inject



class ListViewModel3 @Inject constructor() : ViewModel() {

    val bookListt = mutableStateListOf(
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
    "Dr. Shiv Manjaree Gopaliya"

    )

            var searchList = mutableStateListOf<String>()
        }


