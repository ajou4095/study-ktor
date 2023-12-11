package com.ray.plugins

import com.ray.repository.StudentRepository
import com.ray.routes.studentRouting
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
//        val studentRepository by inject<StudentRepository>()

        studentRouting(
            studentRepository = StudentRepository()
        )
    }
}
