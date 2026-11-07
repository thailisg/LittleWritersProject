package org.example

import org.example.controller.ProjectController
import org.example.data.JsonProjectData
import org.example.view.ConsoleView

fun main() {
    val projectData = JsonProjectData()
    val controller = ProjectController(projectData)
    val view = ConsoleView(controller)

    view.menu()
}
