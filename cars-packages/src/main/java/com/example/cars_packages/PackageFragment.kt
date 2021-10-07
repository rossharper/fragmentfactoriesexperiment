package com.example.cars_packages

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.fragment_package.*

class PackageFragment(packageViewModelFactory: ViewModelProvider.Factory) :
    Fragment(R.layout.fragment_package) {
    
    private val viewModel by viewModels<PackageViewModel> { packageViewModelFactory }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.viewState.observe(viewLifecycleOwner, Observer { viewState ->
            packages.text = viewState
        })
    }
}

