package com.example.truckmyrun.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.truckmyrun.R
import com.example.truckmyrun.ui.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RunFragment:Fragment(R.layout.fragment_run) {
    private val viewModel : MainViewModel by viewModels()

}