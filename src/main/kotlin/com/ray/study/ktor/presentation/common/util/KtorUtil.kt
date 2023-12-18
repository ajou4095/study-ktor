package com.ray.study.ktor.presentation.common.util

import io.ktor.server.routing.Routing
import org.koin.core.parameter.ParametersDefinition
import org.koin.core.qualifier.Qualifier
import org.koin.ktor.ext.getKoin

inline fun <reified T : Any> Routing.getOrNull(
    qualifier: Qualifier? = null,
    noinline parameters: ParametersDefinition? = null
): T? {
    return getKoin().getOrNull<T>(qualifier, parameters)
}
