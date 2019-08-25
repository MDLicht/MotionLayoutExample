package com.mdlicht.zb.motionlayoutexample.ex04keyframe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mdlicht.zb.motionlayoutexample.R

class Ex04KeyFrameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex04_key_frame)
        supportActionBar?.title = getString(R.string.ex04_keyframe)
    }
}
