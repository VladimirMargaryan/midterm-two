package com.mobiledev.midterm_two.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mobiledev.midterm_two.domain.model.User
import com.mobiledev.midterm_two.ui.theme.Custom

@Composable
fun UserScreen(
    users: List<User>
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .background(Custom),
        ) {
            Text(
                text = "Users",
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(start = 15.dp, top = 10.dp)
            )
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
        ) {
            LazyColumn {
                items(users) { user ->
                    Row(
                        modifier = Modifier
                            .background(color = Color.LightGray)
                            .padding(5.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(5.dp),
                            verticalArrangement = Arrangement.SpaceAround
                        ) {
                            Text(
                                text = "$user.name.first $user.name.last",
                                style = MaterialTheme.typography.h6,
                                fontSize = 20.sp,
                                maxLines = 2,
                                overflow = TextOverflow.Ellipsis
                            )

                            Spacer(modifier = Modifier.height(5.dp))

                            Text(
                                text = user.email,
                                style = MaterialTheme.typography.body1,
                                maxLines = 2,
                                overflow = TextOverflow.Ellipsis,
                                color = Color.LightGray
                            )
                        }
                    }
                }
            }
        }
    }
}