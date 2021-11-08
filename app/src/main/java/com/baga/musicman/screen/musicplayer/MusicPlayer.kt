package com.baga.musicman.screen.musicplayer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.baga.musicman.R

@Preview
@Composable
fun MusicPlayer() {
    ConstraintLayout(
        modifier = Modifier
            .padding(start = 20.dp, end = 60.dp, top = 20.dp, bottom = 20.dp)
            .fillMaxWidth()
            .height(160.dp)
            .background(
                brush = Brush.horizontalGradient(
                    listOf(
                        Color(0xFF7F5FFF),
                        Color(0xFF8E73FF),
                    )
                ),
                shape = RoundedCornerShape(60.dp)
            )
            .padding(15.dp)
    ) {
        val (mainIcon, title, artist, back, playPause, next, musicBar) = createRefs()
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_home_24),
            contentDescription = "",
            modifier = Modifier
                .padding(start = 5.dp)
                .background(Color.White, shape = RoundedCornerShape(30.dp))
                .size(120.dp)
                .constrainAs(mainIcon) {
                    start.linkTo(parent.start)
                    linkTo(parent.top, parent.bottom, topMargin = 0.dp, bottomMargin = 0.dp)
                    height = Dimension.preferredWrapContent
                },
            tint = Color.White
        )
        Text(text = "")
    }
}