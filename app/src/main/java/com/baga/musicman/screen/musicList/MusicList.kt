package com.baga.musicman.screen.musicList

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MusicListScreen() {
    Box(modifier = Modifier) {
        Box(modifier = Modifier.fillMaxSize()
            .padding(end = 80.dp, start = 40.dp, top = 40.dp, bottom = 40.dp)
            .shadow(
                elevation = 5.dp,
                RoundedCornerShape(20.dp),
                clip = true
            )
            .background(
                Brush.linearGradient(
                    listOf(
                        Color(0xFFFBFCFE),
                        Color(0xFFDBDEFC),
                    ),
                ), RoundedCornerShape(20.dp)
            )
        )
        LazyColumn(
            modifier = Modifier
                .padding(end = 40.dp, start = 40.dp, top = 40.dp, bottom = 40.dp)
        ) {
            itemsIndexed(getSampleItemsList()) { index, item ->
                MusicItemScreenWithConstraints(item)
            }
        }

    }

}

