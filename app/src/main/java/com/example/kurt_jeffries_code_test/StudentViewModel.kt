package com.example.kurt_jeffries_code_test


import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kurt_jeffries_code_test.databinding.ActivityMainBinding

class StudentViewModel(val binding: ActivityMainBinding,val context: Context) {
    val repo = StudentRepo()

    suspend fun getStudents(){
        repo.getStudents().await()
    }

    fun setupRecyclerView(){
        val adapter = StudentAdapter()
        binding.rvStudents.adapter = adapter
        binding.rvStudents.layoutManager = LinearLayoutManager(context)

    }
}