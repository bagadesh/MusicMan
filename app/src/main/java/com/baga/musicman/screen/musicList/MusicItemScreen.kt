package com.baga.musicman.screen.musicList

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.baga.musicman.R
import com.baga.musicman.screen.musicList.entity.MusicItem

@Preview
@Composable
fun MusicItemScreen() {
    Row(modifier = Modifier.background(Color.White)) {
        MusicItemScreenWithConstraints(
            getSampleItemsList().first()
        )
    }
}

@Composable
fun MusicItemScreenWithConstraints(item: MusicItem) {

    when (item.isPlaying) {
        true -> {
            val modifier: Modifier = Modifier
                .padding(start = 10.dp, top = 10.dp, bottom = 10.dp, end = 10.dp)
                .shadow(
                    elevation = 5.dp,
                    RoundedCornerShape(20.dp),
                    clip = false
                )
                .background(Color.White, RoundedCornerShape(20.dp))
                .requiredHeight(80.dp)
                .fillMaxWidth()
                .wrapContentHeight()
//            modifier.padding(end = 50.dp, start = 10.dp, top = 10.dp, bottom = 10.dp)
            MusicItemContentView(item, modifier)
        }
        false -> {
            val modifier: Modifier = Modifier
                .padding(end = 50.dp, start = 10.dp, top = 10.dp, bottom = 10.dp)
                .requiredHeight(80.dp)
                .fillMaxWidth()
                .wrapContentHeight()
            MusicItemContentView(item, modifier)
        }
    }
}

@Composable
fun MusicItemContentView(
    item: MusicItem,
    modifier: Modifier
) {
    ConstraintLayout(
        modifier = modifier
    ) {
        val (icon, title, artist, favorite, moreIcon) = createRefs()
        Box(
            modifier = Modifier
                .padding(start = 10.dp)
                .size(60.dp)
                .background(
                    Color.Red, RoundedCornerShape(10.dp)
                )
                .constrainAs(icon) {
                    start.linkTo(parent.start)
                    centerVerticallyTo(parent)
                },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_baseline_home_24),
                contentDescription = item.title,
                modifier = Modifier
                    .background(
                        Color.Transparent, RoundedCornerShape(10.dp)
                    )
            )
        }

        Text(
            text = "sahdigs213123123321312323121321312213213dauygasuydguyg",
            modifier = Modifier
                .padding(start = 10.dp)
                .constrainAs(title) {
                    top.linkTo(parent.top)
                    bottom.linkTo(artist.top)
                    linkTo(icon.end, favorite.start, bias = 0F, endMargin = 5.dp)
                    width = Dimension.preferredWrapContent
                },
            fontSize = 12.sp,
            color = MaterialTheme.colors.onSurface,
            fontWeight = FontWeight.Black,
            textAlign = TextAlign.Start,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1,
        )
        Text(
            text = "ArtistArtistArtistArtistArtistArtistArtistArtistArtistArtistArtist",
            modifier = Modifier
                .padding(start = 10.dp)
                .constrainAs(artist) {
                    top.linkTo(title.bottom)
                    bottom.linkTo(parent.bottom)
                    linkTo(icon.end, favorite.start, bias = 0F, endMargin = 5.dp)
                    width = Dimension.preferredWrapContent
                },
            fontSize = 12.sp,
            color = Color(0xFFB9B7D0),
            textAlign = TextAlign.Start,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1,
        )

        var mutableFavorite by remember { mutableStateOf(item.isFavorite) }
        Icon(
            painter = when {
                mutableFavorite -> painterResource(id = R.drawable.ic_baseline_favorite_24)
                else -> painterResource(id = R.drawable.ic_baseline_favorite_border_24)
            },
            contentDescription = "isFavorite",
            modifier = Modifier
                .padding(end = 10.dp)
                .constrainAs(favorite) {
                    end.linkTo(moreIcon.start)
                    centerVerticallyTo(parent)
                }
                .clickable(
                    interactionSource = MutableInteractionSource(),
                    onClick = {
                        mutableFavorite = !mutableFavorite
                    },
                    indication = rememberRipple(bounded = false)
                ) ,
            tint = when (mutableFavorite) {
                false -> Color(0xFFA19EB2)
                true -> Color.Red
            }
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_more_horiz_24),
            contentDescription = "More option",
            modifier = Modifier
                .padding(end = 20.dp)
                .constrainAs(moreIcon) {
                    end.linkTo(parent.end)
                    centerVerticallyTo(parent)
                }
        )
    }
}