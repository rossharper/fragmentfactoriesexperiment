package com.example.cars_packages

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class PackageViewModelFactory(
    private val packageRepository: PackageRepository,
    private val packageTelemetry: PackageTelemetry
) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        @Suppress("UNCHECKED_CAST")
        return PackageViewModel(packageRepository, packageTelemetry) as T
    }
}