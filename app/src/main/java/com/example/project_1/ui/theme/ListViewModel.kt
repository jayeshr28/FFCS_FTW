package com.example.searchview

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import javax.inject.Inject



class ListViewModel @Inject constructor() : ViewModel() {

    val bookList = mutableStateListOf(
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


            var searchList = mutableStateListOf<String>()
        }


