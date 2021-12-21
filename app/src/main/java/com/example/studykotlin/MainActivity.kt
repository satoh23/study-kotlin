package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var count : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCountUp : Button = findViewById(R.id.buttonCountUp)
        buttonCountUp.setOnClickListener(this)

        val buttonCountDown : Button = findViewById(R.id.buttonCountDown)
        buttonCountDown.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.buttonCountUp -> {
                countUp()
            }
            R.id.buttonCountDown -> {
                countDown()
            }
            R.id.buttonClear -> {
                clear()
            }
        }
    }

    private fun countUp() : Int {
        count++
        val textView : TextView = findViewById(R.id.textViewNumber)
        textView.text = count.toString()
        return(count)
    }
    private fun countDown() : Int {
        if (count > 0) {
            count--
        }
        val textView : TextView = findViewById(R.id.textViewNumber)
        textView.text = count.toString()
        return(count)
    }
    private fun clear() : Int {
        count = 0
        val textView : TextView = findViewById(R.id.textViewNumber)
        textView.text = count.toString()
        return(count)
    }
}