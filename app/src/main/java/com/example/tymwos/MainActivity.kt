package com.example.tymwos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myMountainsButton: Button = findViewById(R.id.myMountainsButton);
        var addMountainButton: Button = findViewById(R.id.addMountainButton);
        var koronaButton: Button = findViewById(R.id.koronaButton);

        myMountainsButton.setOnClickListener {
            myMountainsButton_Click()
        }
        addMountainButton.setOnClickListener {
            addMountainButton_Click()
        }
        koronaButton.setOnClickListener {
            koronaButton_Click()
        }
    }

    fun myMountainsButton_Click() {
        val intent = Intent(this, MyMountainActivity::class.java).apply {
        }
        startActivity(intent)
    }
    fun addMountainButton_Click() {
        val intent = Intent(this, AddMountainActivity::class.java).apply {
        }
        startActivity(intent)
    }
    fun koronaButton_Click() {
        val intent = Intent(this, KoronaActivity::class.java).apply {}
        startActivity(intent)
    }
}