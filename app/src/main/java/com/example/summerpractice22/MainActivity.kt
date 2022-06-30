package com.example.summerpractice22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.b_count)
        button.setOnClickListener {
            val editTextName = findViewById<EditText>(R.id.et_name)
            val editTextHeight = findViewById<EditText>(R.id.et_height)
            val editTextWeight = findViewById<EditText>(R.id.et_weight)
            val editTextAge = findViewById<EditText>(R.id.et_age)
            val textViewResult = findViewById<TextView>(R.id.tv_result)
            if (editTextName.error == null && editTextHeight.error == null && editTextWeight.error == null && editTextAge.error == null) {
                val name: String = editTextName.text.toString()
                val height: Int = editTextHeight?.text.toString().toInt()
                val weight: Double = editTextWeight?.text.toString().toDouble()
                val age: Int = editTextAge?.text.toString().toInt()
                if (validate(name, height, weight, age)) {
                    textViewResult.text = "The data is entered incorrectly."
                } else {
                    textViewResult.text = count(name, height, weight, age)
                }
            } else {
                textViewResult.text = "Data can't be null"
            }
            textViewResult.visibility = View.VISIBLE
        }
    }
    private fun count(name:String, height : Int, weight : Double, age : Int) : String {
        val result = (weight*10+height*6.25-age*5)*1.5
        return "$name - $result kcal"
    }

    private fun validate(name:String, height : Int, weight : Double, age : Int):Boolean {
        return (name == "" || name.length > 50 || height <= 0 || height >= 250 || weight <= 0.0 || weight >= 250 || age <= 0 || age >= 150)
    }
}