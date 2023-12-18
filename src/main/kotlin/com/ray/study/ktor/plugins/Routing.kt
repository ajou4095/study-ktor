package com.ray.study.ktor.plugins

import com.ray.study.ktor.data.repository.StudentRepository
import com.ray.study.ktor.presentation.student.studentRouting
import io.ktor.server.application.Application
import io.ktor.server.routing.routing

fun Application.configureRouting() {
    routing {
//        val studentRepository by inject<StudentRepository>()

        studentRouting(
            studentRepository = StudentRepository()
        )
    }
}
