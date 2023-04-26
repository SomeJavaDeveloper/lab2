package com.example.lab2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var isSwitched = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            if(isSwitched) {
                findViewById<TextView>(R.id.textView2).setBackgroundColor(Color.RED)
                findViewById<TextView>(R.id.textView4).setBackgroundColor(Color.RED)
                findViewById<TextView>(R.id.textView5).setBackgroundColor(Color.RED)
                findViewById<TextView>(R.id.textView2).setTextColor(Color.YELLOW)
                findViewById<TextView>(R.id.textView4).setTextColor(Color.YELLOW)
                findViewById<TextView>(R.id.textView5).setTextColor(Color.YELLOW)
            } else {
                findViewById<TextView>(R.id.textView2).setBackgroundColor(Color.YELLOW)
                findViewById<TextView>(R.id.textView4).setBackgroundColor(Color.YELLOW)
                findViewById<TextView>(R.id.textView5).setBackgroundColor(Color.YELLOW)
                findViewById<TextView>(R.id.textView2).setTextColor(Color.RED)
                findViewById<TextView>(R.id.textView4).setTextColor(Color.RED)
                findViewById<TextView>(R.id.textView5).setTextColor(Color.RED)
            }
            isSwitched = !isSwitched
        }
    }
}