package com.gvoltr.kmm.shared

import android.util.Log

actual fun platformPrint(message: String) {
    Log.d("platformPrint", message)
}