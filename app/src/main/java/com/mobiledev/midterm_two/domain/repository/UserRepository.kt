package com.mobiledev.midterm_two.domain.repository

import com.mobiledev.midterm_two.domain.model.UserResponse

interface UserRepository {

    suspend fun getUsers(): UserResponse
}