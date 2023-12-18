package com.ray.study.ktor.domain.di

import com.ray.study.ktor.domain.usecase.student.studentUseCaseModule
import org.koin.dsl.module

val domainModule = module {
    includes(studentUseCaseModule)
}
