package com.mun0n.rickmorty.data.network

import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RemoteClient(
    okHttpClient: OkHttpClient,
    baseUrl: String
) {
    private val retrofit: Retrofit

    init {
        val httpUrl = HttpUrl.parse(baseUrl) ?: throw IllegalArgumentException("Invalid base url")

        retrofit = Retrofit.Builder()
            .baseUrl(httpUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }

    fun <T> createService(clazz: Class<T>): T = retrofit.create(clazz)
}