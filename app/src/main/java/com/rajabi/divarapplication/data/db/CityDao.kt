package com.rajabi.divarapplication.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.rajabi.divarapplication.data.model.city.City
import kotlinx.coroutines.flow.Flow

@Dao
interface CityDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(city: City)

    @Query("SELECT * from cities")
    fun getAllCities(): Flow<List<City>>

    @Delete
    suspend fun  deleteCity(city: City)
}