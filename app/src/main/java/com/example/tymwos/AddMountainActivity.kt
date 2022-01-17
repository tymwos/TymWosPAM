package com.example.tymwos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class AddMountainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_mountain)
    }

    fun addMountain(view: android.view.View) {
        Toast.makeText(this, R.string.notImplementInfo, Toast.LENGTH_SHORT).show()
    }
    fun deleteMountain(view: android.view.View) {
        Toast.makeText(this, R.string.notImplementInfo, Toast.LENGTH_SHORT).show()
    }
}