package com.gvoltr.kmm.shared.spacex

import com.gvoltr.kmm.shared.platformPrint
import com.gvoltr.kmm.shared.threadName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.withContext

class SpaceXSDK {
    private val api = SpaceXApiService()

    private val apiContext = newSingleThreadContext("API thread")

    @Throws(Exception::class)
    suspend fun getLaunches(): List<RocketLaunch> {
        return withContext(apiContext) {
            platformPrint("Running api request on ${threadName()}")
            api.getAllLaunches()
        }
    }
}