package com.example.kurt_jeffries_code_test

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.kurt_jeffries_code_test.databinding.ActivityMainBinding
import com.example.kurt_jeffries_code_test.databinding.ActivityStudentDetailBinding
import kotlinx.coroutines.runBlocking

class StudentDetail : AppCompatActivity() {

    lateinit var binding: ActivityStudentDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStudentDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}