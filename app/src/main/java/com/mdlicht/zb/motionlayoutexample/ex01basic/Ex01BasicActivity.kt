package com.mdlicht.zb.motionlayoutexample.ex01basic

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mdlicht.zb.motionlayoutexample.R

class Ex01BasicActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex01_basic)
        supportActionBar?.title = getString(R.string.ex01_basic)
    }
}
