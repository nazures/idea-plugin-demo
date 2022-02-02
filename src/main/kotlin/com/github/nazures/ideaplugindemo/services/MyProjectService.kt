package com.github.nazures.ideaplugindemo.services

import com.intellij.openapi.project.Project
import com.github.nazures.ideaplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
