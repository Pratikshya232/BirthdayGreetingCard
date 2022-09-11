package com.example.birthdaygreetingcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayWishActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_wish)

        val name = intent.getStringExtra(NAME_EXTRA)

        //val Greeting = findViewById<TextView>(R.id.greeting)
       //Greeting.text = "Happy Birthday/n $name"

        val Greeting = findViewById<TextView>(R.id.textView2)
        Greeting.text = "Happy Birthday/n $name"

    }
}