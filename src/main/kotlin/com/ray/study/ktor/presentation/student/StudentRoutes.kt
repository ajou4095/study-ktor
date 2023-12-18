package com.ray.study.ktor.presentation.student

import com.ray.study.ktor.data.repository.StudentRepository
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route

fun Route.studentRouting(
    studentRepository: StudentRepository
) {
    route("/student") {
        get("{id?}") {
            val id = call.parameters["id"] ?: return@get call.respondText(
                "Missing id",
                status = HttpStatusCode.BadRequest
            )
            val student = studentRepository.getStudent(id = id) ?: return@get call.respondText(
                "No student with id $id",
                status = HttpStatusCode.NotFound
            )
            call.respond(student)
        }
//        get {
//
//        }
//        post {
//
//        }
//        delete("{id?}") {
//
//        }
    }
}
