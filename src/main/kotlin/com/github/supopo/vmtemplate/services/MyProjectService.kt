package com.github.supopo.vmtemplate.services

import com.intellij.openapi.project.Project
import com.github.supopo.vmtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
