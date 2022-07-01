package com.example.summerpractice22

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
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
            if (editTextName.length() != 0 && editTextHeight.length() != 0 && editTextWeight.length() != 0 && editTextAge.length() != 0) {
                val name: String = editTextName.text.toString()
                val height: Int = editTextHeight.text.toString().toInt()
                val weight: Double = editTextWeight.text.toString().toDouble()
                val age: Int = editTextAge.text.toString().toInt()
                if (validate(name, height, weight, age)) {
                    textViewResult.text = resources.getString(R.string.the_data_is_entered_incorrectly)
                } else {
                    textViewResult.text = count(name, height, weight, age)
                }
            } else {
                textViewResult.text = resources.getString(R.string.data_cant_be_null)
            }
            textViewResult.visibility = View.VISIBLE
        }
    }

    private fun count(name:String, height : Int, weight : Double, age : Int) : String {
        val result = (weight*10+height*6.25-age*5)*1.5+name.length
        return "$result " + resources.getString(R.string.kcal)
    }

    private fun validate(name:String, height : Int, weight : Double, age : Int):Boolean {
        return (name == "" || name.length > 50 || height <= 0 || height >= 250 || weight <= 0.0 || weight >= 250 || age <= 0 || age >= 150)
    }
}