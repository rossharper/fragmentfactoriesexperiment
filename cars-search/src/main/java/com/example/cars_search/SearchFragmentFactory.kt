package com.example.cars_search

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.example.booking_stats_service.Stats
import com.example.cars_bff_client.BffClient
import java.lang.IllegalArgumentException

class SearchFragmentFactory(
    private val searchRouter: SearchRouter,
    private val bffClient: BffClient,
    private val stats: Stats
) : FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return if (className == SearchFragment::class.java.name) {
            SearchFragment(SearchViewModelFactory(BffClientSearchRepository(bffClient), BookingStatsSearchTelemetry(stats), searchRouter))
        } else {
            throw IllegalArgumentException("Incorrect factory for fragment class")
        }
    }
}