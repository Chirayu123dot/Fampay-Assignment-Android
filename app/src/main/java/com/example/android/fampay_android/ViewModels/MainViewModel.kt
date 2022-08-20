package com.example.android.fampay_android.ViewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.fampay_android.networking.ApiService
import com.example.android.fampay_android.networking.data.Response
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    var response: Response by mutableStateOf(Response())
    var errorMessage: String by mutableStateOf("")

    fun getResponse() {
        viewModelScope.launch {
            val apiService = ApiService.getInstance()
            try {
                val apiResponse = apiService.getResponse()
                response = apiResponse
            } catch (e: Exception) {
                errorMessage = e.message.toString()
            }
        }
    }
}