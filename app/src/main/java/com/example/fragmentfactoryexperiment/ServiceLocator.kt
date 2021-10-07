package com.example.fragmentfactoryexperiment

import com.example.booking_stats_service.Stats
import com.example.booking_stats_service.StatsImpl

object ServiceLocator {

    private lateinit var _stats: StatsImpl
    val stats: Stats
        get() = _stats

    fun init() {
        _stats = StatsImpl()
    }
}
