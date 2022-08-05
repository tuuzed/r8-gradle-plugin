import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    id("maven-publish")
}

group = "com.github.tuuzed"
version = "0.0.1"

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation(gradleApi())
    implementation("com.android.tools:r8:3.3.28")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
