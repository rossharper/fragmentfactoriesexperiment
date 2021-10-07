package com.example.cars_main.bookingflow

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cars_main.R

class CarsFunnelFlowActivity : AppCompatActivity(R.layout.activity_booking_flow) {

    private val flowCoordinator =
        FragmentCarsFunnelFlowCoordinator(
            CarsFunnelFlowFragmentFactory(Cars.stats),
            supportFragmentManager,
            R.id.flow_fragment_container
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            flowCoordinator.startSearch()
        }
    }

    companion object {
        fun launch(parentActivity: Activity) {
            parentActivity.startActivity(Intent(parentActivity, CarsFunnelFlowActivity::class.java))
        }
    }
}

