package com.example.kurt_jeffries_code_test

import retrofit2.Response
import retrofit2.http.GET

interface StudentsApi {

    @GET("abb92e67-c508-4b16-bdb2-0573b53cd364")
    suspend fun getStudents() : Response<List<Student>>

}