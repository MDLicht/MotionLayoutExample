package com.mdlicht.zb.motionlayoutexample.main

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

class MainRecyclerAdapter(private val dataSet: List<String>): RecyclerView.Adapter<MainViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MainViewHolder {
        return MainViewHolder.newInstance(p0.context, p0)
    }

    override fun getItemCount(): Int = dataSet.size

    override fun onBindViewHolder(p0: MainViewHolder, p1: Int) {
        p0.onBindViewHolder(p1, dataSet[p1])
    }
}