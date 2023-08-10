package com.example.livedata2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private val textView: TextView
        get() = findViewById(R.id.txtV)
    private val button: Button
        get() = findViewById(R.id.buttonOne)

    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.facts.observe(this, {
            textView.text = it
        })

        button.setOnClickListener {
            mainViewModel.update()
            button.text = "Updated data"
        }
    }
}