package com.mocoding.pokedex.core.network

import io.ktor.client.HttpClient
import io.ktor.client.engine.js.*

actual fun createPlatformHttpClient(): HttpClient {
    return HttpClient(Js)
}