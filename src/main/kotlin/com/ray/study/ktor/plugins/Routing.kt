package com.ray.study.ktor.plugins

import com.ray.study.ktor.presentation.common.util.getOrNull
import com.ray.study.ktor.presentation.student.StudentService
import com.ray.study.ktor.presentation.student.studentRouting
import io.ktor.server.application.Application
import io.ktor.server.routing.routing

fun Application.configureRouting() {
    routing {
        getOrNull<StudentService>()?.let { studentService ->
            studentRouting(service = studentService)
        }
    }
}
