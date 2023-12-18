package com.ray.study.ktor.domain.usecase.student

import com.ray.study.ktor.domain.model.Student
import com.ray.study.ktor.domain.repository.StudentRepository
import com.ray.study.ktor.presentation.student.StudentService
import org.koin.dsl.module

internal val getStudentByIdUseCaseModule = module {
    factory { GetStudentByIdUseCase(get()) }
}

class GetStudentByIdUseCase(
    private val studentRepository: StudentRepository
) {
    suspend operator fun invoke(
        id: Long
    ): Student? {
        return studentRepository.getStudentById(id)
    }
}
