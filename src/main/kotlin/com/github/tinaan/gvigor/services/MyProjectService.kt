package com.github.tinaan.gvigor.services

import com.intellij.openapi.project.Project
import com.github.tinaan.gvigor.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
