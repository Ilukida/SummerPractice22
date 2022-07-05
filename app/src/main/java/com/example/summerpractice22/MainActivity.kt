package com.example.summerpractice22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {

    lateinit var cities: List<City>
    private lateinit var controller: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cityRepository = CityRepository
        cities = cityRepository.getCities()

        controller = (supportFragmentManager.findFragmentById(R.id.main_nav_host_fragment) as NavHostFragment).navController

        setupActionBarWithNavController(controller)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}