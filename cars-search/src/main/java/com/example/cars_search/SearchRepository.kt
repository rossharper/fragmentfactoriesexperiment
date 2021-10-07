package com.example.cars_search

import com.example.cars_entitites.SearchResults

interface SearchRepository {
    fun getSearchResults(): SearchResults
}
