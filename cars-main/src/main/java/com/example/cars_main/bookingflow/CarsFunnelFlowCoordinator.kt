package com.example.cars_main.bookingflow

import com.example.cars_search.SearchRouter

interface CarsFunnelFlowCoordinator : SearchRouter {
    fun startSearch()
}