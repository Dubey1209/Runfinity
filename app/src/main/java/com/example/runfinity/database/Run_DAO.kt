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

    @Query("SELECT * FROM running_table ORDER BY timeStamp DESC")
    fun getAllRunsSortedByDate(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY timeMillis DESC")
    fun getAllRunsSortedByTimeMillis(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY burntCalories DESC")
    fun getAllRunsSortedByBurntCalories(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY distanceMeters DESC")
    fun getAllRunsSortedByDistance(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY averageSpeedKMH DESC")
    fun getAllRunsSortedByAverageSpeedKMH(): LiveData<List<Run>>

    @Query("SELECT SUM(timeMillis) FROM running_table")
    fun getTotalTimeMillis(): LiveData<Long>

    @Query("SELECT SUM(burntCalories) FROM running_table")
    fun getTotalBurntCalories(): LiveData<Int>

    @Query("SELECT SUM(distanceMeters) FROM running_table")
    fun getTotalDistanceMeters(): LiveData<Int>

    @Query("SELECT AVG(averageSpeedKMH) FROM running_table")
    fun getTotalAverageSpeedKMH(): LiveData<Float>
}