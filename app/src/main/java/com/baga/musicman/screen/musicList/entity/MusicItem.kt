package com.baga.musicman.screen.musicList.entity

data class MusicItem(
    val title: String,
    val artist: String,
    val icon: String,
    val isFavorite: Boolean,
    var isPlaying: Boolean = false
)
