package com.mdlicht.zb.motionlayoutexample.ex05keyframe2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mdlicht.zb.motionlayoutexample.R

class Ex05KeyFrame2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex05_key_frame2)
        supportActionBar?.title = getString(R.string.ex05_keyframe2)
    }
}
