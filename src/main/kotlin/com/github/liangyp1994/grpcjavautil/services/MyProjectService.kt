package com.github.liangyp1994.grpcjavautil.services

import com.intellij.openapi.project.Project
import com.github.liangyp1994.grpcjavautil.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
