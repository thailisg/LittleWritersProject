package org.example.model

import kotlinx.serialization.Serializable

/**
 *This is the class Chapter that have the id to identify correctly each chapter of the story
 * and have the title which represent the title of the story
 * and have the number that you choose for that chapter
 * and have the content where the story you tell in the chapter fits in
 */
@Serializable
data class Chapter (val id: Int, var title: String, var number: Int, var content: String, var stateOfChapter: StateOfChapter)
/**
 *This is the class for state of chapter it is designed for identify whether the story is a draft, in progress, or completed
 */

@Serializable
enum class StateOfChapter {DRAFT, IN_PROGRESS, COMPLETED}