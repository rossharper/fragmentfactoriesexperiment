package com.example.fragmentfactoryexperiment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cars_main.bookingflow.CarsFunnelFlowActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCars.setOnClickListener {
            CarsFunnelFlowActivity.launch(this)
        }
    }
}