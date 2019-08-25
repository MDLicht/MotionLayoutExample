package com.mdlicht.zb.motionlayoutexample.main

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mdlicht.zb.motionlayoutexample.Ex03ImageFilterView.Ex03ImageFilterViewActivity
import com.mdlicht.zb.motionlayoutexample.R
import com.mdlicht.zb.motionlayoutexample.ex01basic.Ex01BasicActivity
import com.mdlicht.zb.motionlayoutexample.ex02colorchange.Ex02ColorChangeActivity
import kotlinx.android.synthetic.main.item_main_viewholder.view.*

class MainViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    companion object {
        fun newInstance(context: Context, parent: ViewGroup): MainViewHolder {
            val view = LayoutInflater.from(context).inflate(R.layout.item_main_viewholder, parent, false)
            return MainViewHolder(view)
        }
    }

    fun onBindViewHolder(position: Int, title: String) {
        itemView.title.apply {
            this.text = title
            setOnClickListener {
                handleClickEvent(itemView.context, title)
            }
        }
    }

    private fun handleClickEvent(context: Context, title: String) {
        when(title) {
            context.getString(R.string.ex01_basic) -> {
                context.startActivity(Intent(context, Ex01BasicActivity::class.java))
            }
            context.getString(R.string.ex02_colorchange) -> {
                context.startActivity(Intent(context, Ex02ColorChangeActivity::class.java))
            }
            context.getString(R.string.ex03_image_filter_view) -> {
                context.startActivity(Intent(context, Ex03ImageFilterViewActivity::class.java))
            }
        }
    }
}