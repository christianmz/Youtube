package com.meazza.youtube.common

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.api.load

@BindingAdapter("image")
fun loadImage(imageView: ImageView, url: String) {
    imageView.load(url) {
        crossfade(true)
    }
}
