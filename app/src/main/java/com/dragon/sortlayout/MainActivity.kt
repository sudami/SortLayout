package com.dragon.sortlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sortLayout = findViewById<SortLayout>(R.id.sort_layout)
        sortLayout.addHolder(ImageHolder(this, ItemData("file:///android_asset/1.jpg")))
        sortLayout.addHolder(ImageHolder(this, ItemData("file:///android_asset/2.jpg")))
        sortLayout.addHolder(ImageHolder(this, ItemData("file:///android_asset/3.jpg")))
        sortLayout.addHolder(ImageHolder(this, ItemData("file:///android_asset/4.jpg")))
        sortLayout.addHolder(ImageHolder(this, ItemData("file:///android_asset/5.jpg")))
    }
}
