package com.gvoltr.kmm.shared

actual fun threadName() : String = Thread.currentThread().name