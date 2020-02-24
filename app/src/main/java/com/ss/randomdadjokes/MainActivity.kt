package com.ss.randomdadjokes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRDJ.setOnClickListener {
            // Code
            Log.i("MainActivity", "What did the fish say when it hit a wall? Dam.")
            Toast.makeText(this, "What did the fish say when it hit a wall? Dam.", Toast.LENGTH_LONG).show()
        }

        btnSendMsgToNextActivity.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()

            val intent = intent(this, RandomJokeActivity::class.java)
            startActivity(intent)
        }

    }

}
