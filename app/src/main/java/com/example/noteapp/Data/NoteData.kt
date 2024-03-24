package com.example.noteapp.Data

import com.example.noteapp.model.Note

class NoteDataSource{
    fun loadNotes(): List<Note>{
        return listOf(
            Note(title = "A good day", description = "We went on a vacation"),
            Note(title = "Android Compose", description = "Working on android app"),
            Note(title = "A movie day", description = "Watching movie with friends"),
        )
    }
}