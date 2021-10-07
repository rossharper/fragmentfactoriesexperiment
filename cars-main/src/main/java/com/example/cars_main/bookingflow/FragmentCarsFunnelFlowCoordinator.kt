package com.example.cars_main.bookingflow

import androidx.annotation.IdRes
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import com.example.cars_search.SearchRouter

class FragmentCarsFunnelFlowCoordinator(
    flowFragmentFactory: CarsFunnelFlowFragmentFactory,
    private val fragmentManager: FragmentManager,
    @IdRes private val fragmentContainerId: Int
) : CarsFunnelFlowCoordinator,
    SearchRouter {

    init {
        fragmentManager.fragmentFactory = flowFragmentFactory.create(this)
    }

    override fun startSearch() {
        fragmentManager.commit {
            replace(fragmentContainerId, com.example.cars_search.SearchFragment::class.java, null)
        }
    }

    override fun goToPackages() {
        fragmentManager.commit {
            replace(fragmentContainerId, com.example.cars_packages.PackageFragment::class.java, null)
            addToBackStack(null)
        }
    }
}