package com.github.ducoral.maritaca.services

import com.intellij.openapi.project.Project
import com.github.ducoral.maritaca.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
