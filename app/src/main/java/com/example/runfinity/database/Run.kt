package com.example.runfinity.database

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_table")
data class Run
    (

    var image: Bitmap? = null,
    var timeStamp: Long = 0L,
    var averageSpeedKMH: Float = 0f,
    var distanceMeters: Int = 0,
    var timeMillis: Long = 0L,
    var burntCalories: Int = 0

)

{

    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}