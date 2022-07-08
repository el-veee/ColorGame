package com.lachlanvass.colorgame

import androidx.compose.ui.graphics.Color

fun getRandomColorPair():Pair<String, Color> {

    val colorPairs = listOf(
        "Red" to Color.Red,
        "Yellow" to Color.Yellow,
        "Blue" to Color.Cyan,
        "Purple" to Color.Magenta,
        "White" to Color.White,
        "Green" to Color.Green,
        "Orange" to Color(0xFFFF862A),
        "Grey" to Color.LightGray,
        "Pink" to Color(0xFFFF6CFD),
        "Light Blue" to Color(0xFF4DD2FF)
    )

    return colorPairs.random()



}

