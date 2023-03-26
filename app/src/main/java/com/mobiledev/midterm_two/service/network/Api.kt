package com.mobiledev.midterm_two.service.network

import com.mobiledev.midterm_two.domain.model.Model
import retrofit2.Call
import retrofit2.http.GET

interface Api {

    // TODO: Implement api
    @GET("v2/top-headlines")
    fun get(): Call<List<Model>>

    companion object {
        const val BASE_URL = "https://newsapi.org"
    }
}