package com.mobiledev.midterm_two.domain.model

import com.google.gson.annotations.SerializedName


data class UserResponse(
    @SerializedName("results")
    val users: List<User>
)
