package com.example.runfinity.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.runfinity.R
import com.example.runfinity.database.Run_DAO
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var runDao: Run_DAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
