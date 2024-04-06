package com.example.ownlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.stoast.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ///this is toast
        Toaster.showToast(this, "Hii")
    }
}