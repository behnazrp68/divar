package com.rajabi.divarapplication.presentation.compose.advertising

import androidx.compose.runtime.Composable
import com.rajabi.divarapplication.data.model.advertising.Widget

@Composable
fun AdvertisingItem(value: Widget) {
    checkUiType(value =value )
}