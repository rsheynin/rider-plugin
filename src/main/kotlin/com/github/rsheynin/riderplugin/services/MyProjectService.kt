package com.github.rsheynin.riderplugin.services

import com.intellij.openapi.project.Project
import com.github.rsheynin.riderplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
