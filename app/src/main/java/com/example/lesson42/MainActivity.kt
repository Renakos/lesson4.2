package com.example.lesson42

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson42.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, SignUpFragment())
            .commit()
    }
}
