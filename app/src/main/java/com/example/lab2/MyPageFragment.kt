package com.example.lab2

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class MyPageFragment : Fragment(R.layout.activity_main) {
    var isSwitched = false
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(view) {
            findViewById<Button>(R.id.button).setOnClickListener {
                if (isSwitched) {
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
}