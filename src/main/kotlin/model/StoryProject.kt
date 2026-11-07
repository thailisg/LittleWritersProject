package org.example.model

import kotlinx.serialization.Serializable

/**
 *This is the class StoryProject that have the id to identify correctly each story that you have store
 * and have the title which represent the title of the story and the description which it is planned for the synopsis
 */
@Serializable
data class StoryProject(val id: Int, var title: String, var description: String, val chapters: MutableList<Chapter> = mutableListOf(), val notes: MutableList<Note> = mutableListOf()) {

}
