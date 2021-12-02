package com.github.ppaszkiewicz.androidktlib

import android.content.Context

/***
 * Provides hello functionality.
 */
class AndroidKtLib {
    companion object{
        fun getHello(context: Context) : String{
            return context.getString(R.string.kt_lib_hello)
        }
    }
}