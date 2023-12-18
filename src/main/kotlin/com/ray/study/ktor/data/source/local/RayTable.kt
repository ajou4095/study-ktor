package com.ray.study.ktor.data.source.local

import org.jetbrains.exposed.sql.Table

class StudentTable : Table() {
    val id = long("id").autoIncrement()

    val name = varchar("name", 128)

    val age = integer("age")

    override val primaryKey = PrimaryKey(id)
}
