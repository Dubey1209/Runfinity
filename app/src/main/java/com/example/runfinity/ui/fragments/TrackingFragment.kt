package com.example.runfinity.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.runfinity.R
import com.example.runfinity.ui.viewModel.MainViewModel
import com.example.runfinity.ui.viewModel.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class TrackingFragment : Fragment(R.layout.fragment_tracking)
{
    private val viewModel: MainViewModel by viewModels()
}