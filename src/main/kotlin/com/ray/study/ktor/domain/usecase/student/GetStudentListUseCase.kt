package com.ray.study.ktor.domain.usecase.student

import com.ray.study.ktor.domain.model.Student
import com.ray.study.ktor.domain.repository.StudentRepository
import org.koin.dsl.module

internal val getStudentListUseCaseModule = module {
    factory { GetStudentListUseCase(get()) }
}

class GetStudentListUseCase(
    private val studentRepository: StudentRepository
) {
    suspend operator fun invoke(): List<Student> {
        return studentRepository.getStudentList()
    }
}
