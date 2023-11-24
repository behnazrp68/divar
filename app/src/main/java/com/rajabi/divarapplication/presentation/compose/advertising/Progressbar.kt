package com.rajabi.divarapplication.presentation.compose.advertising

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha

@Composable
fun Progressbar(alpha:Float){

    CircularProgressIndicator(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .alpha(alpha)
    )
}