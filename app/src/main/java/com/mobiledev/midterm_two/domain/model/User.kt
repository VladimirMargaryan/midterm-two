package com.mobiledev.midterm_two.domain.model

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("name")
    val name: Name,
    @SerializedName("email")
    val email: String,
    @SerializedName("nat")
    val nat: String
)
