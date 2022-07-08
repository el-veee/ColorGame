package com.lachlanvass.colorgame

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun ColorBox() {


    var colorNamePair = remember {
        mutableStateOf(
            getRandomColorPair()
        )
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.Center),
    ) {

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
            .fillMaxSize()
            .background(colorNamePair
                .value
                .second)
            .clickable {

                colorNamePair.value = getRandomColorPair()

            }){

            Text(
                text = colorNamePair.value.first,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 50.sp
            )

        }
    }

}