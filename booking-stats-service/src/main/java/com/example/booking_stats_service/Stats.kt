package com.example.booking_stats_service

interface Stats {
    fun sendStat(stat: String)
}

class StatsImpl : Stats {
    override fun sendStat(stat: String) {
    }
}