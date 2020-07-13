package com.sunasterisk.moviedb_51.utils

enum class MoviesTypes(val value: String) {
    CAST("cast"),
    PRODUCER("producer"),
    GENRES("genres"),
    RECENT("recent"),
    POPULAR("popular"),
    TOP_RATED("top_rated"),
    UPCOMING("upcoming"),
    NOW_PLAYING("now_playing")
}
