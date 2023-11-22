package com.rajabi.divarapplication.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import com.rajabi.divarapplication.presentation.viewmodel.CityViewModel
import com.rajabi.divarapplication.presentation.viewmodel.CityViewModelFactory
import dagger.hilt.android.lifecycle.HiltViewModel

@Composable
fun BaseScreen(
    factory : CityViewModelFactory,
    modifier: Modifier = Modifier,
    cityViewModel: CityViewModel=  viewModel(factory=factory)

) {
//    val cityList = cityViewModel.getCities()
//    Column(modifier = Modifier.width(1200.dp)) {
        CityScreen(cityViewModel)
//    }
}