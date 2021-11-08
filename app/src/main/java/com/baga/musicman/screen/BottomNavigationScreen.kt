package com.baga.musicman.screen

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.baga.musicman.R
import com.baga.musicman.screen.entity.NavigationItem

@Preview
@Composable
fun BottomNavigationPreview() {
    BottomNavigationScreen(Modifier)
}

@Composable
fun BottomNavigationScreen(
    modifier: Modifier
) {
    BottomNavigation(
        modifier = modifier
    ) {
        val items = listOf(
            NavigationItem.Home,
            NavigationItem.Settings
        )

        items.forEach {
            BottomNavigationItem(
                selected = false,
                onClick = {

                },
                icon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_baseline_home_24),
                        contentDescription = it.title
                    )
                },
                label = {
                    Text(text = it.title)
                }
            )
        }
    }
}