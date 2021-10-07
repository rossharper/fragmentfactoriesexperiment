package com.example.cars_search

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SearchViewModel(
    private val searchRepository: SearchRepository,
    private val searchTelemetry: SearchTelemetry,
    private val searchRouter: SearchRouter
) : ViewModel() {

    val viewState =
        MutableLiveData<String>("Random search id: " + searchRepository.getSearchResults().result)

    fun onResultSelected() {
        searchRouter.goToPackages()
    }
}