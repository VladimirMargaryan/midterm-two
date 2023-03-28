package com.mobiledev.midterm_two.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobiledev.midterm_two.domain.model.User
import com.mobiledev.midterm_two.domain.model.UserResponse
import com.mobiledev.midterm_two.domain.repository.UserRepositoryImpl
import kotlinx.coroutines.launch

class UserViewModel : ViewModel() {

    private val userRepository by lazy { UserRepositoryImpl() }
    private val _userResponseLiveData: MutableLiveData<List<User>> = MutableLiveData(listOf())
    val userResponseLiveData: LiveData<List<User>> = _userResponseLiveData

    fun loadUsers() {
        viewModelScope.launch {
            Log.d("response",userRepository.getUsers().users.toString() )
            val users = userRepository.getUsers().users
            _userResponseLiveData.postValue(users)
        }
    }
}