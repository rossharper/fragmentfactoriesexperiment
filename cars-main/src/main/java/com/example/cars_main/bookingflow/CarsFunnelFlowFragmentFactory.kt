package com.example.cars_main.bookingflow

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.example.booking_stats_service.Stats
import com.example.cars_bff_client.RandomBffClientFactory
import com.example.cars_packages.PackageFragment
import com.example.cars_packages.PackageFragmentFactory
import com.example.cars_search.SearchFragment
import com.example.cars_search.SearchFragmentFactory
import com.example.cars_search.SearchRouter

class CarsFunnelFlowFragmentFactory(private val stats: Stats) {
    fun create(searchRouter: SearchRouter): FragmentFactory {
        return object : FragmentFactory() {

            private val bffClient = RandomBffClientFactory().create()

            override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
                return when (className) {
                    SearchFragment::class.java.name -> SearchFragmentFactory(
                        searchRouter,
                        bffClient,
                        stats
                    )
                    PackageFragment::class.java.name -> PackageFragmentFactory(
                        bffClient,
                        stats
                    )
                    else -> null
                }?.instantiate(classLoader, className) ?: super.instantiate(classLoader, className)
            }
        }
    }
}