package com.example.cars_packages

import com.example.cars_bff_client.BffClient
import com.example.cars_entitites.Packages

class BffClientPackageRepository(private val bffClient: BffClient) :
    PackageRepository {
    override fun getPackages(): Packages {
        return bffClient.getPackages()
    }
}
