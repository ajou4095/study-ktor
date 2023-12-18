package com.ray.study.ktor.data.repository

import com.ray.study.ktor.domain.model.Student

class StudentRepository {
    private val students: List<Student> = listOf(
        Student(
            id = "0",
            name = "Hana",
            age = 13
        ),
        Student(
            id = "1",
            name = "Aimyon",
            age = 13
        ),
        Student(
            id = "2",
            name = "Anzu",
            age = 70
        ),
        Student(
            id = "3",
            name = "Deco",
            age = 19
        ),
        Student(
            id = "4",
            name = "Mirai",
            age = 13
        ),
        Student(
            id = "5",
            name = "Mars",
            age = 13
        ),
        Student(
            id = "6",
            name = "Shion",
            age = 13
        ),
    )

    fun getStudent(id: String): Student? {
        return students.find { it.id == id }
    }

    fun getStudentList(): List<Student> {
        return students
    }
}