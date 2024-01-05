package com.jonna.clean

import android.app.Application
import android.content.Intent
import com.jonna.ui.MainActivity

class App: Application() {

    /*
    This class will have information or permission about device
    */
    override fun onCreate() {
        super.onCreate()

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}