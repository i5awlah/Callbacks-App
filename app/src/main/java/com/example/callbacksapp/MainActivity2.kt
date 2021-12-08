package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        showToastAndLog("onCreate MainActivity2")

        // Create a button in the second Activity that will take you to the third activity when clicked.
        val myButton = findViewById<Button>(R.id.button)
        myButton.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
    override fun onRestart() {
        super.onRestart()
        showToastAndLog("onRestart MainActivity1")
    }

    override fun onResume() {
        super.onResume()
        showToastAndLog("onResume MainActivity2")
    }

    override fun onStart() {
        super.onStart()
        showToastAndLog("onStart MainActivity2")
    }

    override fun onPause() {
        super.onPause()
        showToastAndLog("onPause MainActivity2")
    }

    override fun onStop() {
        super.onStop()
        showToastAndLog("onStop MainActivity2")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToastAndLog("onDestroy MainActivity2")
    }

    private fun showToastAndLog(txt: String) {
        Toast.makeText(this, txt, Toast.LENGTH_LONG).show()
        Log.d("Main", txt)
    }
}