package com.example.tymwos

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class KoronaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_korona)
    }

    fun clickMe(view: android.view.View) {
        val url = "https://www.tutorialspoint.com/sending-an-intent-to-browser-to-open-specific-url-using-kotlin"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
}