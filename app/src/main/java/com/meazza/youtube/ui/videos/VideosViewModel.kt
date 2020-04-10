package com.meazza.youtube.ui.videos

import androidx.lifecycle.ViewModel
import com.meazza.youtube.model.Video

class VideosViewModel : ViewModel() {

    val getAdapter = VideoAdapter()

    fun setAdapter(videos : MutableList<Video>){
        getAdapter.setListData(videos)
        getAdapter.notifyDataSetChanged()
    }
}
