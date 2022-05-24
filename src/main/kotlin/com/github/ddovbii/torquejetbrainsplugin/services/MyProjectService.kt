package com.github.ddovbii.torquejetbrainsplugin.services

import com.intellij.openapi.project.Project
import com.github.ddovbii.torquejetbrainsplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
