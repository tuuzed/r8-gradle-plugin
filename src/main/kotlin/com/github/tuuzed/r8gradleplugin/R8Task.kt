package com.github.tuuzed.r8gradleplugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import java.io.File

open class R8JarTask : DefaultTask() {

    init {
        group = "build"
    }

    @Input
    var inJar: File = File(project.buildDir, "libs/${project.name}-${project.version}.jar")

    @Input
    var outJar = File(project.buildDir, "libs/${project.name}-${project.version}-r8.jar")

    @Input
    var rules = project.file("r8-rules.txt")

    @TaskAction
    fun entry() {
        R8Compiler.r8Jar(inJar, outJar, rules)
    }

}
