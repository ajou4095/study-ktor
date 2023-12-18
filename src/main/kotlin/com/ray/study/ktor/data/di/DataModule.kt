package com.ray.study.ktor.data.di

import com.ray.study.ktor.data.model.StudentEntity
import com.ray.study.ktor.data.repository.StudentRepositoryImpl
import com.ray.study.ktor.data.source.local.RayDatabase
import com.ray.study.ktor.data.source.local.StudentTable
import com.ray.study.ktor.data.source.local.student.StudentDao
import com.ray.study.ktor.data.source.local.student.StudentDaoImpl
import com.ray.study.ktor.domain.model.Student
import com.ray.study.ktor.domain.repository.StudentRepository
import kotlinx.coroutines.runBlocking
import org.koin.dsl.module

val students: List<Student> = listOf(
    Student(
        id = 0,
        name = "Hana",
        age = 13
    ),
    Student(
        id = 1,
        name = "Aimyon",
        age = 13
    ),
    Student(
        id = 2,
        name = "Anzu",
        age = 70
    ),
    Student(
        id = 3,
        name = "Deco",
        age = 19
    ),
    Student(
        id = 4,
        name = "Mirai",
        age = 13
    ),
    Student(
        id = 5,
        name = "Mars",
        age = 13
    ),
    Student(
        id = 6,
        name = "Shion",
        age = 13
    ),
)

val dataModule = module {
    single<StudentTable> { StudentTable() }
    single<RayDatabase> { RayDatabase(get()) }
    single<StudentDao> {
        StudentDaoImpl(get(), get()).apply {
            runBlocking {
                if (selectAll().isEmpty()) {
                    insertAll(
                        students.map { student ->
                            StudentEntity(
                                id = student.id,
                                name = student.name,
                                age = student.age
                            )
                        }
                    )
                }
            }
        }
    }
    single<StudentRepository> { StudentRepositoryImpl(get()) }
}
