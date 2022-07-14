package com.example.kurt_jeffries_code_test.data.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object Retrofit {

    val api : StudentsApi by lazy{
        Retrofit.Builder()
            .baseUrl("https://mocki.io/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create()
    }

}