package com.mun0n.rickmorty.di

import com.mun0n.rickmorty.BuildConfig
import com.mun0n.rickmorty.data.network.RemoteClient
import com.mun0n.rickmorty.data.network.buildOkHttpClient
import org.koin.dsl.module

val remoteDataSourceModule = module {

    single { buildOkHttpClient() }
    single { RemoteClient(get(), BuildConfig.BASE_URL) }

}