package com.dragon.sortlayout

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide

class ImageHolder(context: Context,data: ItemData) :SortLayout.Holder<ItemData>(context,data){
    lateinit var imageView : ImageView
    override fun createView(parent: View?): View {
        val root = LayoutInflater.from(parent?.context).inflate(R.layout.image_item_layout,parent as ViewGroup,false)
        imageView = root.findViewById(R.id.imageView)
        return root
    }

    override fun bindView(parent: View, view: View, position: Int, data: ItemData) {
        super.bindView(parent, view, position, data)
        Glide.with(parent).load(data.url).dontAnimate().into(imageView)
    }

    override fun showView(index: Int) {
        imageView.visibility = View.VISIBLE
    }

    override fun hideView(index: Int) {
        imageView.visibility = View.INVISIBLE
    }

    override fun canMove() = true

    override fun beforeHideView() {
    }
}