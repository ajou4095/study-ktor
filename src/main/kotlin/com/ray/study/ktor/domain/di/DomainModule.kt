package com.ray.study.ktor.domain.di

import com.ray.study.ktor.domain.usecase.student.GetStudentByIdUseCase
import org.koin.dsl.module

val domainModule = module {
    factory { GetStudentByIdUseCase(get()) }
}
