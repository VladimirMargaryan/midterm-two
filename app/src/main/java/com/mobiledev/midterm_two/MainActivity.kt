package com.mobiledev.midterm_two

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import com.mobiledev.midterm_two.domain.model.UserResponse
import com.mobiledev.midterm_two.presentation.screen.UserScreen
import com.mobiledev.midterm_two.presentation.viewmodel.UserViewModel
import com.mobiledev.midterm_two.ui.theme.MidtermtwoTheme

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<UserViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        viewModel.loadUsers()
        super.onCreate(savedInstanceState)
        setContent {
            MidtermtwoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    UserScreen(viewModel.userResponseLiveData.observeAsState().value!!)
                }
            }
        }
    }
}
