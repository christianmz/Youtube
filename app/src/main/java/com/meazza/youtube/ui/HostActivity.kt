package com.meazza.youtube.ui

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import com.meazza.youtube.R
import kotlinx.android.synthetic.main.activity_host.*

class HostActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_host)

        setToolbar()
    }

    private fun setToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.title = ""
        supportActionBar?.setIcon(R.drawable.ic_youtube_logo)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        val item = menu?.findItem(R.id.mn_search)
        search_view.setMenuItem(item)
        return true
    }
}
