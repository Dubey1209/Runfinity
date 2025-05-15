package com.example.runfinity.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface Run_DAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query(value = "SELECT* FROM running_table ORDER BY timeStamp")
    fun getAllRunsSortedByDate(): LiveData<List<Run>>

    @Query(value = "SELECT* FROM running_table ORDER BY timeMillis")
    fun getAllRunsSortedByTimeMillis(): LiveData<List<Run>>

    @Query(value = "SELECT* FROM running_table ORDER BY burntCalories")
    fun getAllRunsSortedByBurntCalories(): LiveData<List<Run>>

    @Query(value = "SELECT* FROM running_table ORDER BY distanceMeters")
    fun getAllRunsSortedByDistance(): LiveData<List<Run>>

    @Query(value = "SELECT* FROM running_table ORDER BY averageSpeedKMH ")
    fun getAllRunsSortedByAverageSpeedKMH(): LiveData<List<Run>>

    @Query(value = "SELECT SUM(timeMillis) FROM running_table")
    fun getTotalTimeMillis(): LiveData<Long>

    @Query(value = "SELECT SUM(burntCalories) FROM running_table")
    fun getTotalBurntCalories(): LiveData<Int>

    @Query(value = "SELECT SUM(distanceMeters) FROM running_table")
    fun getTotalDistanceMeters(): LiveData<Int>

    @Query(value = "SELECT AVERAGE(averageSpeedKMH) FROM running_table")
    fun getTotalAverageSpeedKMH(): LiveData<Float>
}