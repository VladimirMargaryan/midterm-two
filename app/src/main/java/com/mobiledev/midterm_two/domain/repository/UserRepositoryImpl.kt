package com.mobiledev.midterm_two.domain.repository

import com.mobiledev.midterm_two.domain.model.UserResponse
import com.mobiledev.midterm_two.service.network.RetrofitUtil
import com.mobiledev.midterm_two.service.network.UserApi

class UserRepositoryImpl : UserRepository {

    private val retrofit by lazy { RetrofitUtil.getInstance() }

    override suspend fun getUsers(): UserResponse {
        val userApi = retrofit.create(UserApi::class.java)
        return userApi.getUsers()
    }
}