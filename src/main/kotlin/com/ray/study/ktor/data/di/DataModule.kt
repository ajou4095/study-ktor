package com.ray.study.ktor.data.di

import com.ray.study.ktor.data.repository.StudentRepositoryImpl
import com.ray.study.ktor.domain.repository.StudentRepository
import org.koin.dsl.module

val dataModule = module {
    single<StudentRepository> { StudentRepositoryImpl() }
}
