package com.mobiledev.midterm_two.service.network

import com.mobiledev.midterm_two.domain.model.UserResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface UserApi {

    @GET("/api")
    suspend fun getUsers(
        @Query("inc") inc: String = "nat,name,email",
        @Query("results") results: Int = DEFAULT_RESULT_COUNT
    ): UserResponse

    companion object {
        const val BASE_URL = "https://randomuser.me"
        const val DEFAULT_RESULT_COUNT = 10
    }
}