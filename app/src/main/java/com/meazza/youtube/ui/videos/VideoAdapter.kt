package com.meazza.youtube.ui.videos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.meazza.youtube.R
import com.meazza.youtube.databinding.LayoutVideoBinding
import com.meazza.youtube.model.Video

class VideoAdapter : RecyclerView.Adapter<VideoAdapter.Holder>() {

    private var dataList = mutableListOf<Video>()

    fun setListData(data: MutableList<Video>) {
        dataList = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = Holder(
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.layout_video,
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: VideoAdapter.Holder, position: Int) {
        holder.itemBinding.video = dataList[position]
    }

    override fun getItemCount(): Int = if (dataList.size > 0) dataList.size else 0

    inner class Holder(val itemBinding: LayoutVideoBinding) :
        RecyclerView.ViewHolder(itemBinding.root)
}
