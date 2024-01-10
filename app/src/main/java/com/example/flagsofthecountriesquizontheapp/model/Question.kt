package com.example.flagsofthecountriesquizontheapp.model

data class Question(
    val id: Int,
    val question: String,
    val image: Int,
    val optionOne: String,
    val optionTwp: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int
)