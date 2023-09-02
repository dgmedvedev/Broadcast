package com.demo.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        when (intent?.action) {
            Intent.ACTION_AIRPLANE_MODE_CHANGED -> { // слушаем изменение состояния режима в полете
                Toast.makeText(context, "Airplane mode change", Toast.LENGTH_SHORT).show()
            }
        }
    }
}