package com.mobiledev.midterm_two.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.mobiledev.midterm_two.domain.model.Model
import com.mobiledev.midterm_two.presentation.component.Component
import com.mobiledev.midterm_two.presentation.viewmodel.DataLoaderViewModel

@Composable
fun MainScreen() {

    val viewModel: DataLoaderViewModel = viewModel()
    val data = viewModel.modelLiveData.observeAsState(initial = listOf(Model()))

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Component(data.value[0].data)
        }
    }
}