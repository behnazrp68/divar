package com.rajabi.divarapplication.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.rajabi.divarapplication.data.model.city.City

@Database(
    entities = [City::class],
    version = 1 ,
    exportSchema = false
)
//@TypeConverters(Converter::class)
public abstract class DivarDataBase : RoomDatabase() {
    abstract fun getCityDao():CityDao
}