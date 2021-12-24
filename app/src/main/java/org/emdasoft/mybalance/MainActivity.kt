package org.emdasoft.mybalance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.emdasoft.mybalance.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}