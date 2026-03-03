package br.com.androidtest.di

import br.com.androidtest.presentation.home.viewmodel.HomeViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    // ViewModel:
    viewModel {
        HomeViewModel()
    }
}
