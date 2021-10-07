package com.example.cars_search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class SearchViewModelFactory(
    private val searchRepository: SearchRepository,
    private val searchTelemetry: SearchTelemetry,
    private val searchRouter: SearchRouter
) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        @Suppress("UNCHECKED_CAST")
        return SearchViewModel(searchRepository, searchTelemetry, searchRouter) as T
    }
}