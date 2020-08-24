package com.example.truckmyrun.ui.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.truckmyrun.repository.MainRepository

class StatisticsViewModel @ViewModelInject constructor(
    val mainRepository:MainRepository
):ViewModel() {

}