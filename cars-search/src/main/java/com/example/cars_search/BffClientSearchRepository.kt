package com.example.cars_search

import com.example.cars_bff_client.BffClient
import com.example.cars_entitites.SearchResults

class BffClientSearchRepository(private val bffClient: BffClient) :
    SearchRepository {

    override fun getSearchResults(): SearchResults {
        return bffClient.getSearchResults()
    }
}
