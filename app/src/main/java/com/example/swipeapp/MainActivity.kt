package com.example.swipeapp

import com.example.swipeapp.ContentAdapter
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.swipeapp.R


class MainActivity : FragmentActivity() {

    private lateinit var adapter: ContentAdapter
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ContentAdapter(this)
        viewPager = findViewById(R.id.pager)
        viewPager.adapter = adapter
    }
}