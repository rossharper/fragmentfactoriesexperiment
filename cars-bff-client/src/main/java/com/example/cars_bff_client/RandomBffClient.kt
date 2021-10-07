package com.example.cars_bff_client

import com.example.cars_entitites.Packages
import com.example.cars_entitites.SearchResults

class RandomBffClient : BffClient {
    override fun getSearchResults(): SearchResults {
        return SearchResults(
            (Math.random() * 1000).toInt()
        )
    }
    override fun getPackages(): Packages {
        return Packages(
            (Math.random() * 1000).toInt()
        )
    }
}