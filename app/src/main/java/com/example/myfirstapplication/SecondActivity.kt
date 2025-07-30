package com.example.myfirstapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Life", "SecondActivity: onCreate")
        setContentView(R.layout.activity_second)

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    override fun onStart()
    {
        super.onStart();
        Log.d("Life", "SecondActivity: onStart")
    }
    override fun onResume()
    {
        super.onResume();
        Log.d("Life", "SecondActivity: onResume")
    }
    override fun onPause()
    {
        super.onPause();
        Log.d("Life", "SecondActivity: onPause")
    }
    override fun onStop()
    {
        super.onStop();
        Log.d("Life", "SecondActivity: onStop")
    }
    override fun onDestroy()
    {
        super.onDestroy();
        Log.d("Life", "SecondActivity: onDestroy")
    }
}
