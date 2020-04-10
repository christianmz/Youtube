package com.meazza.youtube.di

import com.meazza.youtube.ui.videos.VideosViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val videoModule = module {
    viewModel { VideosViewModel() }
}