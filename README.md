# Overview
## Little Writers

Little Writers is a writing app that I designed for people who enjoy creating stories, especially novels. The goal is to provide a space where writers can organize 
their projects, manage chapters, store notes and ideas related about their stories (with plans to add character cards and maps creation). This is the first version, 
it was developed using Kotlin and works via the console. For the moment includes only basic features, it serves as the first step toward a more comprehensive 
and user friendly application for writers.

Developing this project also help me strengthen my knowledge of Kotlin. Right now, the project includes:

- Mutable and immutable variables
- Expressions
- Conditional structures
- Loops
- Functions
- Classes

Additionally, I implemented mutable lists to manage project data. I used Kotlin Serialization to allowing information to be 
stored in a JSON file and preserved even after the program is closed. I also used the 'when' expression to handle options in the interactive menu.

I designed this app with writers in mind. I personally enjoy writing stories, and while I’ve used many different applications, I’ve encountered certain limitations 
that I feel stop the creative process. That’s why I decided to develop my own app to eliminate those limitations and address the aspects I wanted to improve. 
This is just the first version, is basic, but my goal is to create a user friendly Android app that’s free from those annoying limitations.

## video pendiente

[Software Demo Video](http://youtube.link.goes.here)

Software demonstration video

# Development Environment

To develop Little Writers, I used the following:

- IDE: IntelliJ IDEA.
- Programming language: Kotlin.
- Build system: Gradle.
- Library: Kotlinx Serialization, used for serializing and deserializing data in JSON format.

# Useful Websites

{Make a list of websites that you found helpful in this project}

- [Official Kotlin documentation](https://kotlinlang.org/docs/home.html)
- [Kotlin course on YouTube](https://www.youtube.com/watch?v=i1PNVWd_dTY&list=PL8ie04dqq7_OcBYDpvHrcSFVoggLi3cm_)
- [Kotlinx Serialization JSON documentation](https://kotlinlang.org/api/kotlinx.serialization/kotlinx-serialization-json/kotlinx.serialization.json/)

# Future Work

- Improve the MVC architecture: improve code organization and better distribute responsibilities of classes and functions
- Character cards: implement CRUD functionality to create, view, update, and delete character cards
- Redesign the menu: create a more user friendly and organized navigation system to avoid the long console menu
- Develop a graphical interface: replace the console based interface with a visual one (but I will do this when I turn this app into a more complete, attractive, and user friendly Android application)