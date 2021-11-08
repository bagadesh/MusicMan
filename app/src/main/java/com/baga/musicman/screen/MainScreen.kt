package com.baga.musicman.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.baga.musicman.screen.musicList.MusicListScreen
import com.baga.musicman.screen.musicplayer.MusicPlayer

@Preview
@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(
                    listOf(
                        Color(0xFFF9FAFD),
                        Color(0xFFCCDCFB),
                    ),
                )
            ).padding(top = 20.dp)
    ) {
        MusicPlayer()
        MusicListScreen()
        //BottomNavigationScreen(Modifier.align(Alignment.BottomCenter))
    }

}