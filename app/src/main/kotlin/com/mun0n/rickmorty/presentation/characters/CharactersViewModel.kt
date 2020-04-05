package com.mun0n.rickmorty.presentation.characters

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mun0n.rickmorty.provider.CoroutineDispatcherProvider
import kotlinx.coroutines.launch

class CharactersViewModel(private val coroutineDispatcherProvider: CoroutineDispatcherProvider) :
    ViewModel() {

    val charactersListRequest = MutableLiveData<List<Unit>>()

    private fun postCharactersUIResult(){

    }

    fun getCharactersList() {
        viewModelScope.launch(coroutineDispatcherProvider.io) {

        }
    }
}