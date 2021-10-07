package com.example.cars_search

import com.example.booking_stats_service.Stats

class BookingStatsSearchTelemetry(private val stats: Stats) : SearchTelemetry {
    override fun sendTelemetry(message: String) {
        stats.sendStat(message)
    }

}
