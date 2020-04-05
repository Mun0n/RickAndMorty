package com.mun0n.rickmorty.di

import com.mun0n.rickmorty.presentation.characters.CharactersViewModel
import com.mun0n.rickmorty.presentation.main.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    //Main
    viewModel {
        MainViewModel()
    }
    //Characters
    viewModel {
        CharactersViewModel(get())
    }
}