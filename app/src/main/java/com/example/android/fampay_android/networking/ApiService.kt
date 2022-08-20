package com.example.android.fampay_android.networking

import com.example.android.fampay_android.networking.data.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://run.mocky.io/v3/"

interface ApiService {
    @GET("fefcfbeb-5c12-4722-94ad-b8f92caad1ad#FFB486")
    suspend fun getResponse() : Response

    companion object {
        var apiService: ApiService? = null

        fun getInstance() : ApiService {
            if (apiService == null) {
                apiService = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(ApiService::class.java)
            }
            return apiService!!
        }
    }
}