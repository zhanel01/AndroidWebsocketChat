package com.example.androidchat

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.chatlibrary.ChatLauncher

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startChatButton: Button = findViewById(R.id.btnStartChat)

        startChatButton.setOnClickListener {
            ChatLauncher.start(this)
        }
    }
}
