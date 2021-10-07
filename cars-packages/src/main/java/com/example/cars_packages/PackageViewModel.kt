package com.example.cars_packages

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PackageViewModel(private val packageRepository: PackageRepository, private val packageTelemetry: PackageTelemetry) : ViewModel() {
    val viewState =
        MutableLiveData<String>("Random Package id: " + packageRepository.getPackages().result)
}