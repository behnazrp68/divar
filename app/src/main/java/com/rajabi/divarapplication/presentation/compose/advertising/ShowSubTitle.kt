package com.rajabi.divarapplication.presentation.compose.advertising

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.rajabi.divarapplication.data.model.advertising.Widget

@Composable
fun ShowSubTitle(value: Widget) {
    Text(
        text = "${value.data.text}",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    )
}