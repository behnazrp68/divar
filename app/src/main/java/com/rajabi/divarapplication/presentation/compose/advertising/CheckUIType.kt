package com.rajabi.divarapplication.presentation.compose.advertising

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.rajabi.divarapplication.data.model.advertising.Type
import com.rajabi.divarapplication.data.model.advertising.Widget

@Composable
fun checkUiType(value: Widget) {
    when (value.widgetType) {

        Type.TITLE_ROW.toString() -> ShowTitle(value = value)
        Type.SUBTITLE_ROW.toString() -> ShowSubTitle(value = value)
        Type.POST_ROW.toString() -> ShowPostRow(value = value)
        Type.UNKNOWN.toString() -> Spacer(modifier = Modifier.requiredSize(0.dp))
    }

}