package com.github.ppaszkiewicz.androidktlib

import android.content.Context

/**
 * Provides hello functionality.
 */
object AndroidKtLib {
    /**
     * Hello function.
     */
    fun getHello(context: Context) : String{
        return context.getString(R.string.kt_lib_hello)
    }
}