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
        if(isNewOp){
            edShowNumber.setText("")
        }
        isNewOp=false
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

            bu12.id -> {
                buClickValue += "1"
            }
            bu13.id -> {
                buClickValue += "2"
            }
            bu14.id -> {
                buClickValue += "3"
            }
            bu16.id -> {
                buClickValue += "0"
            }
            bu17.id -> {
                buClickValue += "."
            }

        }

        edShowNumber.setText(buClickValue)
    }

     var op ="*"
     var oldNumber = ""
     var isNewOp = true
    fun buOpEvent(view: android.view.View) {

        val buSelect = view as Button

        when(buSelect.id) {
            buMul.id -> {
                op ="*"
            }
            buDiv.id -> {
                op ="/"
            }
            buSub.id -> {
                op ="-"
            }
            buAdd.id -> {
                op ="+"
            }
        }
        oldNumber = edShowNumber.text.toString()
        isNewOp=true
    }

    fun buEqualEvent(view: android.view.View) {
        var newNumber = edShowNumber.text.toString()
        var finalNumber:Double?=null
        when(op){
            "*"->{
                finalNumber = oldNumber.toDouble() * newNumber.toDouble()
            }
            "/"->{
                finalNumber = oldNumber.toDouble() / newNumber.toDouble()
            }
            "-"->{
                finalNumber = oldNumber.toDouble() - newNumber.toDouble()
            }
            "+"->{
                finalNumber = oldNumber.toDouble() + newNumber.toDouble()
            }
        }
        edShowNumber.setText(finalNumber.toString())
        isNewOp=true
    }




}