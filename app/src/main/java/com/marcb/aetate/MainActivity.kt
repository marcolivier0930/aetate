package com.marcb.aetate

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goButton.setOnClickListener {
            // WILL RUN WHEN ANYONE CLICKS THE BUTTON
            val yearOfBirth: Int = editText.text.toString().toInt()
            var currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val myAge = currentYear - yearOfBirth

//            THIS WILL SHOW THE AGE OF THE USER
            result.text = "$myAge years old"

        }

    }
}
