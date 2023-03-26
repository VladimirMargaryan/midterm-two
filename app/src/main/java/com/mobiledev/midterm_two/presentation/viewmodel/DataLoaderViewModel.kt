package com.mobiledev.midterm_two.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobiledev.midterm_two.domain.model.Model
import com.mobiledev.midterm_two.domain.repository.ModelRepositoryImpl
import kotlinx.coroutines.launch

class DataLoaderViewModel : ViewModel() {

    private val modelRepository by lazy { ModelRepositoryImpl() }
    private val _modelLiveData: MutableLiveData<List<Model>> = MutableLiveData<List<Model>>()
    val modelLiveData: LiveData<List<Model>> = _modelLiveData

    // TODO: Change implementation
    fun loadModels() {
        viewModelScope.launch {
            _modelLiveData.postValue(modelRepository.getModels())
        }
    }
}