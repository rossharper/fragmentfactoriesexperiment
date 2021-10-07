package com.example.cars_bff_client

interface BffClientFactory {
    fun create(): BffClient
}

class RandomBffClientFactory : BffClientFactory {
    override fun create(): BffClient {
        return RandomBffClient()
    }
}