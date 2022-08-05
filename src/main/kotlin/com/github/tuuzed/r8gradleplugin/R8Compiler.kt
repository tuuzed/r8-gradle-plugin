package com.github.tuuzed.r8gradleplugin

import com.android.tools.r8.R8
import java.io.File

internal object R8Compiler {

    fun r8Jar(inJar: File, outJar: File, rules: File) {
        val argv = arrayOf(
            "--release",
            "--classfile",
            "--output", outJar.absolutePath,
            "--pg-conf", rules.absolutePath,
            "--lib", System.getProperties()["java.home"].toString(),
            inJar.absolutePath,
        )
        R8.main(argv)
    }

}
