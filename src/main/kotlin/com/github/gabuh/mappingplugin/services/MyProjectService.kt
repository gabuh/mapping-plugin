package com.github.gabuh.mappingplugin.services

import com.intellij.openapi.project.Project
import com.github.gabuh.mappingplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
