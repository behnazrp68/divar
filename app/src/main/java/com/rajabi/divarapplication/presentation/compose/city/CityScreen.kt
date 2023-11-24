@file:OptIn(ExperimentalMaterial3Api::class)

package com.rajabi.divarapplication.presentation.compose.city

import android.widget.ProgressBar
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.rajabi.divarapplication.data.util.Resource
import com.rajabi.divarapplication.presentation.compose.advertising.Progressbar
import com.rajabi.divarapplication.presentation.viewmodel.CityViewModel
import com.rajabi.divarapplication.presentation.viewmodel.CityViewModelFactory

@Composable
fun CityScreen(
    onNavigateToAdvertisingScreen: (Int) -> Unit,
    factory: CityViewModelFactory,
    modifier: Modifier = Modifier,
    cityViewModel: CityViewModel = viewModel(factory = factory)
) {
    LaunchedEffect(key1 = true) {
        cityViewModel.getCities()

    }

    val cities = cityViewModel.cities.observeAsState()
    var displayingCity by remember { mutableStateOf("یک شهر را انتخاب نمایید") }
    var textFieldSize by remember { mutableStateOf(Size.Zero) }
    var expanded by remember { mutableStateOf(false) }
    val icon = if (expanded) {
        Icons.Filled.KeyboardArrowUp
    } else {
        Icons.Filled.KeyboardArrowDown
    }
    Column {

        OutlinedTextField(
            value = displayingCity,
            onValueChange = { displayingCity = it },
            textStyle = TextStyle(fontSize = 28.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier
                .fillMaxWidth()
                .onGloballyPositioned { cordinate ->
                    textFieldSize = cordinate.size.toSize()
                },
            label = { Text(text = "نام شهر") },
            trailingIcon = {
                Icon(icon, contentDescription = "icon",
                    modifier = Modifier.clickable {
                        expanded = !expanded
                    })
            },
            readOnly = true

        )
        DropdownMenu(
            expanded = expanded, onDismissRequest = { expanded = false },
            modifier = Modifier.width(with(LocalDensity.current) { textFieldSize.width.toDp() })
        )
        {

            cities.apply {
                var citylist = cities.value?.data?.cities
                citylist?.forEach { city ->
                    DropdownMenuItem({
                        Text(
                            text = city.name,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }, onClick = {
                        displayingCity = city.name
                        expanded = false

                        onNavigateToAdvertisingScreen(city.id)
                    }
                    )

                }


            }
        }
    }
}