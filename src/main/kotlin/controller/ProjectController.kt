package org.example.controller

import org.example.model.StoryProject
import org.example.data.ProjectData
import org.example.model.Chapter
import org.example.model.Note

class ProjectController(
    val projectData: ProjectData
)
{
    /*Add a new project/story */
    fun createProject(project: StoryProject) {
        projectData.createProject(project)
    }

    /*Bring All projects/stories in console*/
    fun getAllProjects(): List<StoryProject> {
        return projectData.getAllProjects()
    }

    /*Bring a single project/story by id in console*/
    fun getProjectById(id: Int): StoryProject? {
        return projectData.getProjectById(id)
    }

    /*Update a project*/
    fun updateProject(project: StoryProject) {
        projectData.updateProject(project)
    }

    /*Delete a project*/
    fun deleteProject(id: Int){
        projectData.deleteProject(id)
    }

    /*Add a chapter to a project*/
    fun addChapter(projectId: Int, chapter: Chapter) {
        projectData.addChapter(projectId, chapter)
    }

    /*Bring All chapters from a project*/
    fun getChapters(projectId: Int): List<Chapter> {
        return projectData.getChapters(projectId)
    }

    /*Bring a single chapter from a project*/
    fun getChapterById(projectId: Int, chapterId: Int): Chapter? {
        return projectData.getChapterById(projectId, chapterId)
    }

    /*Update a chapter*/
    fun updateChapter(projectId: Int, chapter: Chapter) {
        projectData.updateChapter(projectId, chapter)
    }

    /*Delete a chapter*/
    fun deleteChapter(projectId: Int, chapterId: Int){
        projectData.deleteChapter(projectId, chapterId)
    }

    /*Add a note to a project*/
    fun addNote(projectId: Int, note: Note) {
        projectData.addNote(projectId, note)
    }

    /*Bring All notes from a project*/
    fun getNotes(projectId: Int): List<Note> {
        return projectData.getNotes(projectId)
    }

    /*Bring a single note from a project*/
    fun getNoteById(projectId: Int, noteId: Int): Note? {
        return projectData.getNoteById(projectId, noteId)
    }

    /*Update a note*/
    fun updateNote(projectId: Int, note: Note) {
        projectData.updateNote(projectId, note)
    }

    /*Delete a note*/
    fun deleteNote(projectId: Int, noteId: Int) {
        projectData.deleteNote(projectId, noteId)
    }

}