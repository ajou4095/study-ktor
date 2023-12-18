package com.ray.study.ktor.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Student(
    val id: String,
    val name: String,
    val age: Int,
)