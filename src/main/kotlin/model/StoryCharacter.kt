package org.example.model

import kotlinx.serialization.Serializable
/**
 *This is the class for the characters of the story
 * Have the id for identify correctly each character
 * have the name of your character
 * have the age which can be null and Have physical Appearance to describe your character
 * This class is for future
 */
@Serializable
data class StoryCharacter(val id: Int, var name: String, var age: Int?, var physicalAppearance: String)