package com.example.cars_bff_client

import com.example.cars_entitites.Packages
import com.example.cars_entitites.SearchResults

interface BffClient {
    fun getSearchResults(): SearchResults
    fun getPackages(): Packages
}

