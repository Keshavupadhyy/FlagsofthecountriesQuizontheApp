package com.example.flagsofthecountriesquizontheapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.flagsofthecountriesquizontheapp.R
import com.example.flagsofthecountriesquizontheapp.utils.Constants

class QuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        val questionList = Constants.getQuestions()
        Log.d("QuestionSize","${questionList.size}")
    }
}