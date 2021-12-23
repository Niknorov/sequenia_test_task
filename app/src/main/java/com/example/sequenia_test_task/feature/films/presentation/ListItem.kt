package com.example.sequenia_test_task.feature.films.presentation

sealed class ListItem {

    data class FilmItem(
        val localizedName: String,
        val image: String?,
    ) : ListItem()

    data class Genre(
        val genre: String
    ) : ListItem()

    object HeadingFilms : ListItem()
    object HeadingGenres : ListItem()
}

