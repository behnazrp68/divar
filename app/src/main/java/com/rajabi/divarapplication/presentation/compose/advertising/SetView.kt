package com.rajabi.divarapplication.presentation.compose.advertising

import androidx.compose.runtime.Composable
import com.rajabi.divarapplication.data.model.advertising.Widget

@Composable
private fun SetView(data: ArrayList<Widget>) {
    data?.forEach { value ->
        checkUiType(value)
    }
}