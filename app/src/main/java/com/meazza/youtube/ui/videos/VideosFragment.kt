package com.meazza.youtube.ui.videos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.meazza.youtube.R
import com.meazza.youtube.databinding.FragmentVideosBinding
import org.koin.android.ext.android.inject


class VideosFragment : Fragment() {

    private val videosViewModel by inject<VideosViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return DataBindingUtil.inflate<FragmentVideosBinding>(
            inflater,
            R.layout.fragment_videos,
            container,
            false
        ).apply {
            lifecycleOwner = this@VideosFragment
            viewModel = videosViewModel
        }.root
    }
}
