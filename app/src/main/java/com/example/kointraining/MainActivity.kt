package com.example.kointraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val userViewModel by viewModel<UserViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userViewModel.data.observe(this, Observer {
            Log.e("user", it.toString())
        })

        userViewModel.loadingState.observe(this, Observer {
            it?.status?.name?.toString()?.let { it1 -> Log.e("loading", it1) }
        })
    }
}