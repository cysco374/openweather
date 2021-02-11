package com.dodolife.weather.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.dodolife.weather.R
import com.dodolife.weather.databinding.ActivityMainBinding
import com.dodolife.weather.modules.BaseActivity

class MainActivity : BaseActivity() {

    private lateinit var navController: NavController

    private val binding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        navController = findNavController(R.id.navMain)

        navController.setGraph(R.navigation.nav_main)

        binding.toolbar.setupWithNavController(navController)

    }


}