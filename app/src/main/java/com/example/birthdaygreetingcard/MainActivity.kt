package com.example.birthdaygreetingcard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createWish(view: View) {

        Toast.makeText( this,"Button is clicked", Toast.LENGTH_SHORT).show()
        val name = findViewById<EditText>(R.id.editTextTextPersonName)
        val finalName = name.editableText.toString()
        val intent = Intent(this,BirthdayWishActivity::class.java)
        intent.putExtra(BirthdayWishActivity.NAME_EXTRA, finalName )
        startActivity(intent)

    }
}