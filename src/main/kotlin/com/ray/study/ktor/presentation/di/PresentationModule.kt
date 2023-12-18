package com.ray.study.ktor.presentation.di

import com.ray.study.ktor.domain.usecase.student.GetStudentByIdUseCase
import com.ray.study.ktor.presentation.student.studentModule
import org.koin.dsl.module

val presentationModule = module {
    factory { GetStudentByIdUseCase(get()) } // TODO
    includes(studentModule)
}
