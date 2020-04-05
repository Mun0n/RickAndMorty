package com.mun0n.rickmorty

import android.app.Application
import com.mun0n.rickmorty.di.remoteDataSourceModule
import com.mun0n.rickmorty.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class RickMortyApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@RickMortyApp)
            modules(
                listOf(
                    viewModelModule,
                    remoteDataSourceModule
                )
            )
        }
    }
}