package com.rajabi.divarapplication.presentation.compose.advertising

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.rajabi.divarapplication.presentation.viewmodel.CityViewModel
import com.rajabi.divarapplication.presentation.viewmodel.CityViewModelFactory

@Composable
fun AdvertisingScreen(
    factory: CityViewModelFactory, cityViewModel: CityViewModel = viewModel(factory = factory),
    cityId: Int?, page: Int = 0, lastPostDate: Int = 0
) {
    LaunchedEffect(key1 = true) {
        cityViewModel.getAdvertings(cityId, page, lastPostDate)
    }
    val advertisingList = cityViewModel.advertisingsList.observeAsState()
    var loader by remember { mutableStateOf(false) }
    Column {
        if (loader)
            Progressbar(alpha = 1F)
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(16.dp)
        ) {

            advertisingList.apply {
                var advertisings = advertisingList.value?.data?.posts
                advertisings?.forEach { advertising ->

                    items(advertisings.size) { item ->
                        AdvertisingItem(advertisings.get(item))
                    }
                }


            }
        }
    }
}
