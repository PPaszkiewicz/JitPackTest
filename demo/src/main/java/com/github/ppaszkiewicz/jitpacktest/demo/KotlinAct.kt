package com.github.ppaszkiewicz.jitpacktest.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import com.github.ppaszkiewicz.androidktlib.AndroidKtLib
import com.github.ppaszkiewicz.javalib.JavaLib

class KotlinAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(AppCompatTextView(this).apply {
            text = """Hello from kotlin demo app
                    |${JavaLib.getHello()}
                    |${AndroidKtLib.getHello(this@KotlinAct)}"""
                .trimMargin()
        })
    }
}