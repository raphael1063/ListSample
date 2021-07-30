package com.example.listsample.ui.main

import com.example.listsample.R
import com.example.listsample.base.BaseActivity
import com.example.listsample.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    private val adapter by lazy {
        MainListAdapter()
    }

    override fun start() {
        with(binding) {
            rvMain.adapter = adapter
        }
    }

    override fun observe() {
    }

}