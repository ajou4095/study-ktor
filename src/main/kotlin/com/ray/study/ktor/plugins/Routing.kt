package com.ray.study.ktor.plugins

import com.ray.study.ktor.data.repository.StudentRepositoryImpl
import com.ray.study.ktor.domain.usecase.student.GetStudentByIdUseCase
import com.ray.study.ktor.presentation.student.StudentService
import com.ray.study.ktor.presentation.student.studentRouting
import io.ktor.server.application.Application
import io.ktor.server.routing.routing
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    routing {
        // region DI
        val studentService: StudentService by inject<StudentService>()
        //endregion DI

        studentRouting(service = studentService)
    }
}
