package com.example.runfinity.Repositories

import com.example.runfinity.database.Run
import com.example.runfinity.database.Run_DAO
import javax.inject.Inject


class MainRepository @Inject constructor(
     val runDao: Run_DAO
   ) {

    suspend fun insertRun(run: Run) = runDao.insertRun(run)
    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunSortedByDate() = runDao.getAllRunsSortedByDate()
    fun getAllRunSortedByDistance() = runDao.getAllRunsSortedByDistance()
    fun getAllRunSortedByTimeMillis() = runDao.getAllRunsSortedByTimeMillis()
    fun getAllRunSortedByAvgSpeed() = runDao.getAllRunsSortedByAverageSpeedKMH()
    fun getAllRunSortedByBurntCalories() = runDao.getAllRunsSortedByBurntCalories()



    fun getTotalAvgSpeed() = runDao.getTotalAverageSpeedKMH()
    fun getTotalDistance() = runDao.getTotalDistanceMeters()
    fun getTotalBurntCalories() = runDao.getTotalBurntCalories()
    fun getTotalTimeMillis() = runDao.getTotalTimeMillis()
}

