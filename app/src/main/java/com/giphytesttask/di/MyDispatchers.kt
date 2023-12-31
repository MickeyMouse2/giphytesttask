package com.giphytesttask.di

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

data class MyDispatchers(
    val io: CoroutineDispatcher = Dispatchers.IO,
    val main: CoroutineDispatcher = Dispatchers.Main,
    val default: CoroutineDispatcher = Dispatchers.Default,
    val unconfined: CoroutineDispatcher = Dispatchers.Unconfined,
)
