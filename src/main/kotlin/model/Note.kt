package org.example.model

import kotlinx.serialization.Serializable

/**
 *This is the class for take notes important about the story
 */
@Serializable
data class Note (val id: Int, var title: String, var content: String)