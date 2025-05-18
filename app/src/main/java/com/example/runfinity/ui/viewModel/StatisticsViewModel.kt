package com.example.runfinity.ui.viewModel

import androidx.lifecycle.ViewModel
import com.example.runfinity.Repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class StatisticsViewModel @Inject constructor(
 val mainRepository: MainRepository
): ViewModel()

{



}