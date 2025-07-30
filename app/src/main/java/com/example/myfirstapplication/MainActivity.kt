package com.example.myfirstapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Life", "MainActivity: onCreate")
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnNext).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        findViewById<Button>(R.id.btnShare).setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, "welcome everyone!")
            }
            startActivity(Intent.createChooser(intent, "Share via"))
        }
    }

    override fun onStart()
    {
        super.onStart();
        Log.d("Life", "MainActivity: onStart")
    }
    override fun onResume()
    {
        super.onResume();
        Log.d("Life", "MainActivity: onResume")
    }
    override fun onPause()
    {
        super.onPause();
        Log.d("Life", "MainActivity: onPause")
    }
    override fun onStop()
    {
        super.onStop();
        Log.d("Life", "MainActivity: onStop")
    }
    override fun onDestroy()
    {
        super.onDestroy();
        Log.d("Life", "MainActivity: onDestroy")
    }
}
