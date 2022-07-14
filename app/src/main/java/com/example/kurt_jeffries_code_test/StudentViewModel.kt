package com.example.kurt_jeffries_code_test


import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kurt_jeffries_code_test.data.StudentRepo
import com.example.kurt_jeffries_code_test.data.retrofit.Student
import com.example.kurt_jeffries_code_test.databinding.ActivityMainBinding

class StudentViewModel(val binding: ActivityMainBinding,val context: Context) {
    val repo = StudentRepo()
    lateinit var studentList :List<Student>


    suspend fun getStudents(){
        studentList = repo.getStudents().await()
    }

    fun setupRecyclerView(){
        val adapter = StudentAdapter()
        binding.rvStudents.adapter = adapter
        binding.rvStudents.layoutManager = LinearLayoutManager(context)

    }
}