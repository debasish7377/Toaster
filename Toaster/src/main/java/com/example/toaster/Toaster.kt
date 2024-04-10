package com.example.toaster

import android.content.Context
import android.widget.Toast

public class Toaster {

    companion object{
        public fun show(context: Context, msg: String){
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }
    }
}