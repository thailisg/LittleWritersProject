package org.example.data

import org.example.model.StoryProject
import org.example.model.Chapter
import org.example.model.Note

interface ProjectData {
    /*=======General functions for projects=========*/
    fun createProject(project: StoryProject)
    fun getAllProjects(): List<StoryProject>
    fun getProjectById(id: Int): StoryProject?
    fun updateProject(project: StoryProject)
    fun deleteProject(id: Int)

    /*=======Functions for chapters in projects=======*/
    fun addChapter(projectId: Int, chapter: Chapter)
    fun getChapters(projectId: Int): List<Chapter>
    fun getChapterById(projectId: Int, chapterId: Int): Chapter?
    fun updateChapter(projectId: Int, chapter: Chapter)
    fun deleteChapter(projectId: Int, chapterId: Int)

    /* ===============Note Functions================= */

    fun addNote(projectId: Int, note: Note)
    fun getNotes(projectId: Int): List<Note>
    fun getNoteById(projectId: Int, noteId: Int): Note?
    fun updateNote(projectId: Int, note: Note)
    fun deleteNote(projectId: Int, noteId: Int)
}