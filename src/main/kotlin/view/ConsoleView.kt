package org.example.view

import org.example.controller.ProjectController
import org.example.model.StoryProject
import org.example.model.Chapter
import org.example.model.StateOfChapter
import org.example.model.Note

class ConsoleView(
    val controller: ProjectController
)
{
    fun menu() {
        var keepInProgram = true

        while (keepInProgram) {
            println(
                """
            Welcome to Little Writers! :D
            Choose an option by number:
            
            1. Create project
            2. View all projects
            3. Search project by id
            4. Update project
            5. Delete project
            6. Add chapter
            7. View all chapters
            8. View chapter by id
            9. Update chapter
            10. Delete chapter
            11. Add note
            12. View all notes
            13. View note by id
            14. Update note
            15. Delete note
            16. Exit
        """.trimIndent()
            )

            val option = readln()

            when (option) {

                /*Option create Project*/
                "1" -> {
                    println("Write an Id for your project")
                    val id = readln().toInt()

                    println("Write a title for your project")
                    val title = readln()

                    println("Write a description for your project")
                    val description = readln()

                    val project = StoryProject(id, title, description)

                    controller.createProject(project)
                }

                /*Option View all projects*/
                "2" -> {
                    val projects = controller.getAllProjects()
                    projects.forEach { showProject(it) }
                }

                /*Option Search project by id*/
                "3" -> {
                    println("Write the id of the project:")
                    val id = readln().toInt()
                    val project = controller.getProjectById(id)
                    if (project != null) {
                        showProject(project)
                    } else {
                        println("Project not found")
                    }
                }

                /*Option Update Project*/
                "4" -> {
                    println("Write the id of the project you want to update:")
                    val id = readln().toInt()

                    val existingProject = controller.getProjectById(id)

                    if (existingProject != null) {
                        println("Write the new title of the project:")
                        val title = readln()

                        println("Write the new description of the project:")
                        val description = readln()

                        val updatedProject = StoryProject(
                            id = id,
                            title = title,
                            description = description,
                            chapters = existingProject.chapters,
                            notes = existingProject.notes
                        )

                        controller.updateProject(updatedProject)
                        println("Project updated successfully!")
                    } else {
                        println("Project not found.")
                    }
                }

                /*Option Delete Project*/
                "5" -> {
                    println("Write the id of the project you want to delete:")
                    val id = readln().toInt()

                    println("Are you sure you want to delete this project? Write 'yes' to confirm")
                    val answer = readln()

                    if (answer == "yes") {
                        controller.deleteProject(id)
                    } else {
                        println("Delete was Canceled")
                    }
                }

                /*Option Add chapter*/
                "6"->{
                    println("Write the id of the project you want to use:")
                    val id = readln().toInt()

                    println("Write the id that you want for your chapter")
                    val chapter = readln().toInt()

                    println("Write the chapter title:")
                    val title = readln()

                    println("Write the chapter number:")
                    val number = readln().toInt()

                    println("Write the chapter content:")
                    val content = readln()

                    println(""""
                        What is the estate of your chapter? Write just the number
                        1.Draft
                        2.In progress
                        3.Completed
                    """.trimMargin())
                    val progress = readln()

                    val state = when (progress) {
                        "1" -> StateOfChapter.DRAFT
                        "2" -> StateOfChapter.IN_PROGRESS
                        "3" -> StateOfChapter.COMPLETED
                        else -> StateOfChapter.DRAFT
                    }

                    val newChapter = Chapter(
                        id = chapter,
                        title = title,
                        number = number,
                        content = content,
                        stateOfChapter = state
                    )

                    controller.addChapter(id, newChapter)
                    println("Chapter added successfully!")
                }

                /*Option View all chapter*/
                "7" -> {
                    println("Write the id of the project:")
                    val id = readln().toInt()

                    val chapters = controller.getChapters(id)
                    chapters.forEach { showChapter(it) }
                }

                /*Option View chapter by id*/
                "8" -> {
                    println("Write the id of the project:")
                    val id = readln().toInt()

                    println("Write the id of the chapter:")
                    val chapterId = readln().toInt()

                    val chapter = controller.getChapterById(id, chapterId)
                    if (chapter != null) {
                        showChapter(chapter)
                    } else {
                        println("Chapter not found")
                    }

                }

                /*Option update chapter*/
                "9" -> {
                    println("Write the id of the project you want to update:")
                    val id = readln().toInt()

                    println("Write the id of the chapter you want to update:")
                    val chapterId = readln().toInt()

                    val chapter = controller.getChapterById(id, chapterId)

                    if (chapter != null) {
                        println("Write the new chapter title:")
                        val title = readln()

                        println("Write the new chapter number:")
                        val number = readln().toInt()

                        println("Write the new chapter content:")
                        val content = readln()

                        println("""
                            What is the estate of your chapter now? Write just the number
                                1. Draft
                                2. In progress
                                3. Completed
                        """.trimIndent())

                        val progress = readln()

                        val state = when (progress) {
                            "1" -> StateOfChapter.DRAFT
                            "2" -> StateOfChapter.IN_PROGRESS
                            "3" -> StateOfChapter.COMPLETED
                            else -> chapter.stateOfChapter
                        }

                        val updatedChapter = Chapter(
                            id = chapterId,
                            title = title,
                            number = number,
                            content = content,
                            stateOfChapter = state
                        )

                        controller.updateChapter(id, updatedChapter)

                        println("Chapter updated successfully!")
                    } else {
                        println("Chapter not found.")
                    }
                }

                /*Option delete chapter*/
                "10" -> {
                    println("Write the id of the project you want to update:")
                    val id = readln().toInt()

                    println("Write the id of the chapter you want to delete:")
                    val chapterId = readln().toInt()

                    val chapter = controller.getChapterById(id, chapterId)
                    if (chapter != null) {
                        controller.deleteChapter(id, chapterId)
                        println("Chapter deleted successfully!")
                    }else {
                        println("Chapter not found")
                    }
                }

                /*Option add note*/
                "11" -> {
                    println("Write the id of the project you want to update:")
                    val id = readln().toInt()

                    println("Write the id of the note you want:")
                    val noteId = readln().toInt()

                    println("Write the note title:")
                    val title = readln()

                    println("Write the note content:")
                    val content = readln()

                    val newNote = Note(
                        id = noteId,
                        title = title,
                        content = content
                    )

                    controller.addNote(id, newNote)

                    println("Note added successfully!")
                }

                /*Option all notes*/
                "12" -> {
                    println("Write the id of the project:")
                    val id = readln().toInt()

                    val notes = controller.getNotes(id)

                    if (notes.isEmpty()) {
                        println("This project has no notes yet.")
                    } else {
                        notes.forEach { showNote(it) }
                    }
                }

                /*Option view note by id*/
                "13" -> {
                    println("Write the id of the project:")
                    val id = readln().toInt()

                    println("Write the note id:")
                    val noteId = readln().toInt()

                    val note = controller.getNoteById(id, noteId)

                    if (note != null) {
                        showNote(note)
                    } else {
                        println("Note not found.")
                    }
                }

                /*Option update note*/
                "14" -> {
                    println("Write the id of the project:")
                    val id = readln().toInt()

                    println("Write the note id you want to update:")
                    val noteId = readln().toInt()

                    val note = controller.getNoteById(id, noteId)

                    if (note != null) {
                        println("Write the new note title:")
                        val title = readln()

                        println("Write the new note content:")
                        val content = readln()

                        val updatedNote = Note(
                            id = noteId,
                            title = title,
                            content = content
                        )

                        controller.updateNote(id, updatedNote)

                        println("Note updated successfully!")
                    } else {
                        println("Note not found.")
                    }
                }

                /*Option delete note*/
                "15" -> {
                    println("Write the id of the project you want to update:")
                    val projectId = readln().toInt()

                    println("Write the note id you want to delete:")
                    val noteId = readln().toInt()

                    val note = controller.getNoteById(projectId, noteId)

                    if (note != null) {
                        controller.deleteNote(projectId, noteId)
                        println("Note deleted successfully!")
                    } else {
                        println("Note not found.")
                    }
                }

                /*Option exit of the program*/
                "16" -> {
                    println("Have a good day. Bye :D")
                    keepInProgram = false
                }
            }
        }
    }
    /*bring the information of a project*/
    fun showProject(project: StoryProject) {
        println("ID: ${project.id}")
        println("Title: ${project.title}")
        println("Description: ${project.description}")
    }

    /*bring the information of a chapter*/
    fun showChapter(chapter: Chapter) {
        println("ID: ${chapter.id}")
        println("Title: ${chapter.title}")
        println("Number: ${chapter.number}")
        println("Content: ${chapter.content}")
        println("State: ${chapter.stateOfChapter}")
    }

    /*bring the information of a note*/
    fun showNote(note: Note) {
        println("Note ID: ${note.id}")
        println("Title: ${note.title}")
        println("Content: ${note.content}")
    }

}