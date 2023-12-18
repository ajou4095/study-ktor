package com.ray.study.ktor.domain.usecase.student

import org.koin.dsl.module

val studentUseCaseModule = module {
    includes(
        getStudentByIdUseCaseModule,
        getStudentListUseCaseModule
    )
}
