package com.lachlanvass.colorgame

import androidx.compose.ui.graphics.Color

fun getRandomColorPair():Pair<String, Color> {

    val colorPairs = listOf(
        "Red" to Color.Red,
        "Yellow" to Color.Yellow,
        "Blue" to Color.Cyan,
        "Purple" to Color.Magenta,
        "White" to Color.White,
        "Green" to Color.Green
    )

    return colorPairs.random()



}

