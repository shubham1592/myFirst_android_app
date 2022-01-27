package com.example.test_run3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast("Shubham", 21)
        showToast(value=31)
    }
    fun showToast(name: String = "Shubham", value: Int){
        Toast.makeText(this, "Shubham"+value, Toast.LENGTH_LONG).show()
    }
    
}
