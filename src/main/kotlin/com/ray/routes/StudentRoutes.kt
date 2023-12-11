package com.ray.routes

import com.ray.repository.StudentRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

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
