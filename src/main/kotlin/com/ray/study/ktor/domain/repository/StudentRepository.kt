package com.ray.study.ktor.domain.repository

import com.ray.study.ktor.domain.model.Student

interface StudentRepository {

    suspend fun getStudentById(id: String): Student?

    suspend fun getStudentList(): List<Student>
}
