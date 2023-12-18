package com.ray.study.ktor.presentation.student

import org.koin.dsl.module

val studentModule = module {
    single { StudentService(get()) }
}
