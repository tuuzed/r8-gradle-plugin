package com.github.tuuzed.r8gradleplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class R8Plugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.tasks.register("r8Jar", R8JarTask::class.java)
    }

}
