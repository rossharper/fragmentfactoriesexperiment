package com.example.cars_search

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.fragment_search.*

class SearchFragment(
    searchViewModelFactory: ViewModelProvider.Factory
) :
    Fragment(R.layout.fragment_search) {

    private val viewModel by viewModels<SearchViewModel> { searchViewModelFactory }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.viewState.observe(viewLifecycleOwner, Observer { viewState ->
            searchResults.text = viewState
        })

        btnPackages.setOnClickListener {
            viewModel.onResultSelected()
        }
    }
}

