package com.github.djangochain.linterplugin.services

import com.intellij.openapi.project.Project
import com.github.djangochain.linterplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
