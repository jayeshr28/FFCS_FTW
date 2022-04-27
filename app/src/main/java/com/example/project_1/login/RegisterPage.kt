package com.example.project_1.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.project_1.R
import com.example.project_1.ui.theme.lightWhite
import dev.leonardom.loginjetpackcompose.presentation.components.TransparentTextField
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.platform.LocalFocusManager

import androidx.constraintlayout.compose.ConstraintLayout
import com.example.project_1.Screen
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

import dev.leonardom.loginjetpackcompose.presentation.components.RoundedButton


@Composable
fun RegisterScreen(navController: NavController){
    val username =  rememberSaveable { mutableStateOf("")}
    val emailValue = rememberSaveable{ mutableStateOf("") }
    val regnum = rememberSaveable{ mutableStateOf("") }
    val passwordValue = rememberSaveable{ mutableStateOf("") }
    var passwordVisibility by remember { mutableStateOf(false) }
    val focusManager = LocalFocusManager.current
    lateinit var auth: FirebaseAuth
// ...
// Initialize Firebase Auth
    auth = Firebase.auth

    fun updateUI(currentUser: FirebaseUser?) {

    }

    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Color.Transparent,
                elevation = 1.dp
            ) {
                IconButton(onClick = { navController.popBackStack() }) {
                    Icon(painter = painterResource(id = R.drawable.baseline_arrow_back_18), contentDescription = "back")
                }
            }
        }

    ) {
        Column(modifier = Modifier
            .padding(5.dp)
            .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.vitlogo),
                contentDescription = "register image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(vertical = 16.dp, horizontal = 20.dp)
            )

            Text(
                text = "Continue With",
                fontSize = 20.sp,
                modifier = Modifier.padding(5.dp)
            )

            OutlinedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                contentPadding = PaddingValues(vertical = 15.dp, horizontal = 2.dp),
                shape = RoundedCornerShape(15.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.google_logo),
                    contentDescription = "Google logo",
                    modifier = Modifier.size(24.dp)
                )

                Text(
                    text = "Login With Google",
                    color = Color.LightGray,
                    modifier = Modifier.padding(start = 10.dp)
                )

            }


                    OutlinedButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        contentPadding = PaddingValues(vertical = 15.dp, horizontal = 2.dp),
                        shape = RoundedCornerShape(15.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.face),
                            contentDescription = "Facebook logo",
                            modifier = Modifier.size(24.dp)
                        )

                        Text(
                            text = "Login With Facebook",
                            color = Color.LightGray,
                            modifier = Modifier.padding(start = 10.dp)
                        )

                    }
            ConstraintLayout {

                val (surface, fab) = createRefs()

                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp)
                        .height(400.dp)
                        .constrainAs(surface) {
                            bottom.linkTo(parent.bottom)
                        },
                    color = Color.White,
                    shape = RoundedCornerShape(
                        topStartPercent = 8,
                        topEndPercent = 8
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(
                            text = "Register",
                            fontSize = 20.sp,
                            modifier = Modifier.padding(top = 15.dp, bottom = 5.dp),
                            color = Color.Black,

                        )
                        TransparentTextField(
                            textFieldValue = username,
                            textLabel = "Username",
                            modifier = Modifier
                                .background(lightWhite),
                            keyboardType = KeyboardType.Text,
                            keyboardActions = KeyboardActions(
                                onNext = {
                                    focusManager.moveFocus(FocusDirection.Down)
                                }
                            ),
                            imeAction = ImeAction.Next

                        )

                        TransparentTextField(
                            textFieldValue = regnum,
                            textLabel = "Registration Number",
                            modifier = Modifier
                                .background(lightWhite),
                            keyboardType = KeyboardType.Text,
                            keyboardActions = KeyboardActions(
                                onNext = {
                                    focusManager.moveFocus(FocusDirection.Down)
                                }
                            ),
                            imeAction = ImeAction.Next

                        )
                        TransparentTextField(
                            textFieldValue = emailValue,
                            textLabel = "Email",
                            modifier = Modifier
                                .background(lightWhite),

                            keyboardType = KeyboardType.Email,
                            keyboardActions = KeyboardActions(
                                onNext = {
                                    focusManager.moveFocus(FocusDirection.Down)
                                }
                            ),
                            imeAction = ImeAction.Next

                        )

                        TransparentTextField(
                            textFieldValue = passwordValue,
                            textLabel = "Password",
                            modifier = Modifier.background(lightWhite),
                            keyboardType = KeyboardType.Password,
                            keyboardActions = KeyboardActions(
                                onDone = {
                                    focusManager.clearFocus()

                                    //TODO("LOGIN")
                                }
                            ),
                            imeAction = ImeAction.Done,
                            trailingIcon = {
                                IconButton(
                                    onClick = {
                                        passwordVisibility = !passwordVisibility
                                    }
                                ) {
                                    Icon(
                                        tint = MaterialTheme.colors.secondary,
                                        imageVector = if (passwordVisibility) {
                                            Icons.Default.Visibility
                                        } else {
                                            Icons.Default.VisibilityOff
                                        },
                                        contentDescription = "Toggle Password Icon"

                                    )
                                }
                            },
                            visualTransformation = if (passwordVisibility) {
                                VisualTransformation.None
                            } else {
                                PasswordVisualTransformation()
                            }


                        )
                        RoundedButton(
                            text = "Register",
                            displayProgressBar = false,
                            onClick = {
//                                customToken?.let {
//                                    auth.signInWithCustomToken(it)
//                                        .addOnCompleteListener(this) { task ->
//                                            if (task.isSuccessful) {
//                                                // Sign in success, update UI with the signed-in user's information
//                                                Log.d(TAG, "signInWithCustomToken:success")
//                                                val user = auth.currentUser
//                                                updateUI(user)
//                                            } else {
//                                                // If sign in fails, display a message to the user.
//                                                Log.w(TAG, "signInWithCustomToken:failure", task.exception)
//                                                Toast.makeText(baseContext, "Authentication failed.",
//                                                    Toast.LENGTH_SHORT).show()
//                                                updateUI(null)
//                                            }
//                                        }
//                                }
//                                auth.createUserWithEmailAndPassword(
//                                    emailValue.value.trim(),
//                                    passwordValue.value.trim(),
////                                    regnum.value.trim(),
////                                    username.value.trim()
//
//                                )
//                                    .addOnCompleteListener(){
//                                        task -> if (task.isSuccessful) {
                                        navController.navigate(route = Screen.Homescreen.route)
//                                    }
//                                    else { Log.d("auth", "Failure")}
//                                    }
                                    }
//

                        )
                    }


                }
                }
            }
        }

    }




