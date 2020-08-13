package com.fl1ck5h07.trolltiktok

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        supportActionBar?.hide()


        val uri = Uri.parse("android.resource://$packageName/${R.raw.video}")
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.setOnPreparedListener { mp -> //Start Playback
            videoView.start()
            //Loop Video
            mp!!.isLooping = true
        }
    }
}
