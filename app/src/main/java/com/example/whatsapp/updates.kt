package com.example.whatsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class updates : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_updates)
        intent
        val chatsIntent = findViewById<Button>(R.id.chats)
        val callsIntent = findViewById<Button>(R.id.calls)
        val updatesIntent = findViewById<Button>(R.id.updates)

        chatsIntent.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        callsIntent.setOnClickListener {
            val intent = Intent(this, calls::class.java)
            startActivity(intent)
        }
        updatesIntent.setOnClickListener {
            val intent = Intent(this, updates::class.java)
            startActivity(intent)
        }

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.chat_toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.new_group->{
                Toast.makeText(this, "Home Item Selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.new_broadcast->{
                Toast.makeText(this, "Home Item Selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.linked_devices->{
                Toast.makeText(this, "Home Item Selected", Toast.LENGTH_SHORT).show()
                true
            }R.id.starred_messages->{
                Toast.makeText(this, "Home Item Selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.settings->{
                Toast.makeText(this, "Home Item Selected", Toast.LENGTH_SHORT).show()
                true
            }

            else -> onOptionsItemSelected(item)
        }
    }
}