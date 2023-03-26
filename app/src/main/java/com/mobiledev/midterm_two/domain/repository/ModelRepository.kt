package com.mobiledev.midterm_two.domain.repository

import com.mobiledev.midterm_two.domain.model.Model

interface ModelRepository {

    fun getModels(): List<Model>
}