package com.belajar.coroutine

import kotlinx.coroutines.delay

class RemoteDataSource {
    suspend fun fetchListOfStringFromAPI(): List<String> {
        delay(3000)
        return listOf(
            "Data 1",
            "Data 2",
            "Data 3",
            "Data 4",
            "Data 5"
        )
    }

    suspend fun fetchStringFromAPI(): String {
        delay(1500)
        return "Some String"
    }
}