package com.ss.randomdadjokes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRDJ.setOnClickListener {
            // Code
            Log.i("MainActivity", "What did the fish say when it hit a wall? Dam.")
        }

    }

}
