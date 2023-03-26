package com.mobiledev.midterm_two.domain.repository

import com.mobiledev.midterm_two.domain.model.Model
import com.mobiledev.midterm_two.service.network.Api
import com.mobiledev.midterm_two.service.network.RetrofitUtil

class ModelRepositoryImpl : ModelRepository {

    private val retrofit by lazy { RetrofitUtil.getInstance() }

    override fun getModels(): List<Model> {
        val api = retrofit.create(Api::class.java)
        //TODO: Not yet implemented
        return listOf(Model())
    }
}