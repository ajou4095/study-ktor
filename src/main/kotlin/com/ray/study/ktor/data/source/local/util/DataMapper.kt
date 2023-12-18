package com.ray.study.ktor.data.source.local.util

import org.jetbrains.exposed.sql.ResultRow

internal interface PersistenceDataMapper<T> {
    fun persistenceToEntity(row: ResultRow): T
}
