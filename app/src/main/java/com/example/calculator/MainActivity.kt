package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buNumberEvent(view: android.view.View) {
        val buSelect = view as Button
        var buClickValue: String = edShowNumber.text.toString()

        when(buSelect.id) {
            bu1.id -> {
                buClickValue += "1"
            }
            bu2.id -> {
                buClickValue = "-"+ buClickValue
            }
            bu3.id -> {
                buClickValue += "3"
            }
            bu4.id -> {
                buClickValue += "4"
            }
            bu5.id -> {
                buClickValue += "7"
            }
            bu6.id -> {
                buClickValue += "8"
            }
            bu7.id -> {
                buClickValue += "9"
            }
            bu8.id -> {
                buClickValue += "4"
            }
            bu9.id -> {
                buClickValue += "5"
            }
            bu10.id -> {
                buClickValue += "6"
            }

            bu11.id -> {
                buClickValue += "11"
            }
            bu12.id -> {
                buClickValue += "1"
            }
            bu13.id -> {
                buClickValue += "2"
            }
            bu14.id -> {
                buClickValue += "3"
            }
            bu15.id -> {
                buClickValue += "15"
            }
            bu16.id -> {
                buClickValue += "0"
            }

        }

        edShowNumber.setText(buClickValue)
    }
}