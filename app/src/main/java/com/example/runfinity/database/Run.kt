package com.example.runfinity.database

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters

@Entity(tableName = "running_table")
data class Run(
    @TypeConverters(Converters::class)
    var image: Bitmap? = null,
    var timeStamp: Long = 0L,
    var averageSpeedKMH: Float = 0f,
    var distanceMeters: Int = 0,
    var timeMillis: Long = 0L,
    var burntCalories: Int = 0,
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
)