package com.baga.musicman.screen.musicList

import com.baga.musicman.screen.musicList.entity.MusicItem

fun getSampleItemsList(): List<MusicItem> {
    return run {
        val result = (listOf(
            MusicItem(
                "Currently playing",
                "Jain",
                "",
                false,
                isPlaying = false
            )
        ) + getSampleItemsLists()).toMutableList()
        for (i in 0..4) {
            result += getSampleItemsLists() + getSampleItemsLists()
        }
        result[6].isPlaying = true
        result
    }
}

private fun getSampleItemsLists(): List<MusicItem> {
    return listOf(
        MusicItem(
            "On My Way",
            "Jain",
            "",
            false
        ), MusicItem(
            "On My Way",
            "Jain",
            "",
            true
        ), MusicItem(
            "On My Way",
            "Jain",
            "",
            false
        ), MusicItem(
            "On My Way",
            "Jain",
            "",
            false
        ), MusicItem(
            "On My Way",
            "Jain",
            "",
            true
        )
    )
}