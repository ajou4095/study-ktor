package com.ray.study.ktor.di

import com.ray.study.ktor.data.di.dataModule
import com.ray.study.ktor.domain.di.domainModule
import com.ray.study.ktor.presentation.di.presentationModule
import org.koin.dsl.module

val appModule = module {
    includes(dataModule, domainModule, presentationModule)
}
