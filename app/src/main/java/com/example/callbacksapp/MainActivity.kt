package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Show a Toast message and log a message indicating the current state of both activities.
        showToastAndLog("onCreate MainActivity1")


        val myButton = findViewById<Button>(R.id.button)
        // The button will take you to the next Activity when clicked
        myButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    override fun onRestart() {
        super.onRestart()
        showToastAndLog("onRestart MainActivity1")
    }

    override fun onResume() {
        super.onResume()
        showToastAndLog("onResume MainActivity1")
    }

    override fun onStart() {
        super.onStart()
        showToastAndLog("onStart MainActivity1")
    }

    override fun onPause() {
        super.onPause()
        showToastAndLog("onPause MainActivity1")
    }

    override fun onStop() {
        super.onStop()
        showToastAndLog("onStop MainActivity1")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToastAndLog("onDestroy MainActivity1")
    }

    private fun showToastAndLog(txt: String) {
        Toast.makeText(this, txt, Toast.LENGTH_LONG).show()
        Log.d("Main", txt)
    }
}