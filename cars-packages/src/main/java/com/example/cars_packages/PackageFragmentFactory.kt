package com.example.cars_packages

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.example.booking_stats_service.Stats
import com.example.cars_bff_client.BffClient
import java.lang.IllegalArgumentException

class PackageFragmentFactory(private val bffClient: BffClient, private val stats: Stats) : FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return if (className == PackageFragment::class.java.name) {
            PackageFragment(PackageViewModelFactory(BffClientPackageRepository(bffClient), BookingStatsPackageTelemetry(stats)))
        } else {
            throw IllegalArgumentException("Incorrect factory for fragment class")
        }
    }
}