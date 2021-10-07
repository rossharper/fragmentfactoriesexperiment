package com.example.cars_packages

import com.example.cars_entitites.Packages

interface PackageRepository {
    fun getPackages(): Packages
}
