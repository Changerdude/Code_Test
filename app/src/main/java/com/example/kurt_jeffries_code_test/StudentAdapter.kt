package com.example.kurt_jeffries_code_test

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.kurt_jeffries_code_test.databinding.StudentListCardBinding

class StudentAdapter:RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    inner class StudentViewHolder(val binding: StudentListCardBinding):RecyclerView.ViewHolder(binding.root)

    val diffCallback = object: DiffUtil.ItemCallback<Student>() {
        override fun areItemsTheSame(oldItem: Student, newItem: Student): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Student, newItem: Student): Boolean {
            return oldItem.studentName == newItem.studentName
        }

    }


    val differ = AsyncListDiffer(this,diffCallback)

    var studentList
        get() = differ.currentList
        set(value) { differ.submitList(value)}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        return StudentViewHolder(StudentListCardBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.binding.apply {
            val student: Student = studentList[position]
            tvName.text = student.studentName
            tvAge.text = "${student.studentAge.toString()} yrs"
            tvRoll.text = student.studentRollNumber.toString()
        }
    }

    override fun getItemCount(): Int {
        return studentList.size
    }


}