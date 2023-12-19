plugins {
    kotlin("jvm")
    kotlin("kapt")
    kotlin("plugin.serialization")
    id("com.google.devtools.ksp")
    id("io.ktor.plugin")
    id("io.sentry.jvm.gradle")
}

dependencies {
    implementation(project(":common"))
    implementation(project(":domain"))

    implementation(libs.bundles.kotlin)
    implementation(libs.bundles.data)

    implementation(libs.logback)
    implementation(libs.dagger2)
    ksp(libs.dagger2.compiler)
}
