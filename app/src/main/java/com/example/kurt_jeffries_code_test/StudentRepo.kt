package com.example.kurt_jeffries_code_test

import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import java.lang.Exception

class StudentRepo {

    private val retro = Retrofit

    fun getStudents(): Deferred<List<Student>>{
        Log.d("Retro", "In Retro getStudents")

        return CoroutineScope(Dispatchers.IO).async {
            var studentList = listOf<Student>()
            try {
                Log.d("Retro", "In Retro try coroutine")
                var response = retro.api.getStudents()

                if (response.isSuccessful && response.body() != null) {
                    studentList = response.body()!!
                    Log.d("Retro", "Set studentlist")
                }
            }catch (e: Exception){
                Log.e("Retro","Retrofit Response Fail: $e")
            }
            return@async studentList
        }
    }
}