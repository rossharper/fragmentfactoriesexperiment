package com.example.cars_packages

import com.example.booking_stats_service.Stats

class BookingStatsPackageTelemetry(private val stats: Stats) : PackageTelemetry {
    override fun sendTelemetry(message: String) {
        stats.sendStat(message)
    }
}
