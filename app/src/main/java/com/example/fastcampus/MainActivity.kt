package com.example.fastcampus

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // 한번만 하면 되는 작업
        Log.d("LifeCycle","onCreate")

    }

    override fun onStart() {
        Log.d("LifeCycle","onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("LifeCycle","onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("LifeCycle","onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("LifeCycle","onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("LifeCycle","onDestroy")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.d("LifeCycle","onRestart")
        super.onRestart()
    }
}
