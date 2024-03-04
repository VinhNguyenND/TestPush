package com.example.material_tester.Cororutine.Model

data class Dictionary(
    val word: String,
    val phonetics: List<Phonetic>,
    val meanings: List<Meaning>,
    val license: License2,
    val sourceUrls: List<String>,
)