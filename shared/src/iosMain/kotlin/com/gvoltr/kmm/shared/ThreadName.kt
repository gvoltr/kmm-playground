package com.gvoltr.kmm.shared

import platform.Foundation.NSThread

actual fun threadName() : String = "${NSThread.currentThread.name()} is main ${NSThread.currentThread.isMainThread}"
