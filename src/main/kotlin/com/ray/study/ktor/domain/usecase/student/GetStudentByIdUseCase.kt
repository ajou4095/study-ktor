package com.ray.study.ktor.domain.usecase.student

import com.ray.study.ktor.domain.model.Student
import com.ray.study.ktor.domain.repository.StudentRepository

class GetStudentByIdUseCase(
    private val studentRepository: StudentRepository
) {
    suspend operator fun invoke(
        id: String
    ): Student? {
        return studentRepository.getStudentById(id)
    }
}
